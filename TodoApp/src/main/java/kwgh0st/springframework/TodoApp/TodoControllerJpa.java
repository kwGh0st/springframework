package kwgh0st.springframework.TodoApp;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {

        private final TodoService todoService;
        private final TodoRepositoryJpa repository;

        public TodoControllerJpa(TodoService todoService, TodoRepositoryJpa repository) {
            this.todoService = todoService;
            this.repository = repository;
        }

        @RequestMapping(value = "list-todos")
        public String listOfAlLTodos(ModelMap model) {
            String username = getLoggedInUsername();
            List<Todo> todosList = repository.findByUsername(username);
            model.addAttribute("todos", todosList);

            return "listTodos";
        }

        @RequestMapping(value = "add-todo", method = RequestMethod.GET)
        public String showNewTodoPage(ModelMap model) {
            Todo todo = new Todo(0, (String) model.getAttribute("name"), "", LocalDate.now().plusYears(1), false);
            model.put("todo", todo);
            return "addTodo";
        }

        @RequestMapping(value = "add-todo", method = RequestMethod.POST)
        public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
            if (result.hasErrors()) return "addTodo";

            todoService.createTodo((String) model.getAttribute("name"), todo.getDescription(), todo.getTargetDate(), false);
            return "redirect:list-todos";
        }

        @RequestMapping(value = "delete-todo")
        public String deleteTodo(@RequestParam int id) {
            todoService.deleteById(id);

            return "redirect:list-todos";
        }

        @RequestMapping(value = "update-todo", method = RequestMethod.GET)
        public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
            Todo todo = todoService.findById(id);
            model.addAttribute("todo", todo);
            return "addTodo";
        }

        @RequestMapping(value = "update-todo", method = RequestMethod.POST)
        public String updateTodo(@Valid Todo todo, BindingResult result) {
            if (result.hasErrors()) return "addTodo";


            todoService.updateTodo(todo);

            return "redirect:list-todos";
        }


        private String getLoggedInUsername() {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            return authentication.getName();
        }

    }
