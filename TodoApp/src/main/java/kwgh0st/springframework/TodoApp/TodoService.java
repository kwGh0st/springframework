package kwgh0st.springframework.TodoApp;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "John Doe", "Find new Job", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "John Doe", "Buy a car", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "John Doe", "Buy a house", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
    public void createTodo(String username, String description, LocalDate targetDate) {
        Todo todo = new Todo(++todosCount, username, description, targetDate, false);
        todos.add(todo);
    }
}
