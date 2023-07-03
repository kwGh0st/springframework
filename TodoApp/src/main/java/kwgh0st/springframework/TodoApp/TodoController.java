package kwgh0st.springframework.TodoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "todos-list")
    public String listOfAlLTodos(ModelMap model) {
        List<Todo> todosList = todoService.findByUsername("John Doe");
        model.addAttribute("todos", todosList);

        return "listTodos";
    }
}
