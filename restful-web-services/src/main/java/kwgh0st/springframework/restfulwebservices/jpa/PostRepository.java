package kwgh0st.springframework.restfulwebservices.jpa;

import kwgh0st.springframework.restfulwebservices.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
