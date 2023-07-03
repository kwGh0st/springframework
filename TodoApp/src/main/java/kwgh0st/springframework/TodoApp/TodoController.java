package kwgh0st.springframework.TodoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "list-todos")
    public String listOfAlLTodos(ModelMap model) {
        List<Todo> todosList = todoService.findByUsername("John Doe");
        model.addAttribute("todos", todosList);

        return "listTodos";
    }
}
