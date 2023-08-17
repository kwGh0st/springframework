package kwgh0st.springframework.FullStackTodoApp.todo.service;

import kwgh0st.springframework.FullStackTodoApp.todo.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "Karol", "First Todo", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Karol", "Second Todo", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "Karol", "Third Todo", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "Karol", "Fourth Todo", LocalDate.now().plusYears(4), false));
        todos.add(new Todo(++todosCount, "Karol", "Fifth Todo", LocalDate.now().plusYears(5), false));
    }

    public List<Todo> findByUsername(String username){
        Predicate<? super Todo> predicate =
                todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public Todo addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
        return todo;
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
