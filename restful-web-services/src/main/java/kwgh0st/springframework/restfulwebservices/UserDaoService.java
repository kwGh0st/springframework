package kwgh0st.springframework.restfulwebservices;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Karol", LocalDate.now().minusYears(23)));
        users.add(new User(3, "Michal", LocalDate.now().minusYears(22)));
    }

    public List<User> findAll() {
        return users;
    }
}
