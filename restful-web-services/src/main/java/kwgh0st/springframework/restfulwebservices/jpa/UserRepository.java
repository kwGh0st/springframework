package kwgh0st.springframework.restfulwebservices.jpa;

import kwgh0st.springframework.restfulwebservices.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
