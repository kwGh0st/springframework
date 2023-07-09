package kwgh0st.springframework.restfulwebservices;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findById(@PathVariable int id) {
        return userDaoService.findOne(id);
    }

    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user) {
        userDaoService.save(user);
    }
}
