package kwgh0st.springframework.TodoApp;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "John Doe", "Find new Job", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "John Doe", "Buy a car", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "John Doe", "Buy a house", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
