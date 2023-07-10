package kwgh0st.springframework.TodoApp.repositories;

import kwgh0st.springframework.TodoApp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepositoryJpa extends JpaRepository<Todo, Integer> {
    List<Todo> findByUsername(String username);
}
