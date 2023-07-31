package kwgh0st.springframework.restfulwebservices.jpa;

import jakarta.validation.Valid;
import kwgh0st.springframework.restfulwebservices.Post;
import kwgh0st.springframework.restfulwebservices.User;
import kwgh0st.springframework.restfulwebservices.UserDaoService;
import kwgh0st.springframework.restfulwebservices.exception.UserNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJpaResource {

    private final UserRepository repository;

    public UserJpaResource(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "jpa/users")
    public List<User> retrieveAllUsers() {
        return repository.findAll();
    }

    @GetMapping(path = "jpa/users/{id}/posts")
    public List<Post> retrievePostForUser(@PathVariable int id) throws UserNotFoundException {
        Optional<User> user = repository.findById(id);
        if (user.isEmpty()) throw new UserNotFoundException("id: " + id);

        return user.get().getPosts();
    }

//    @GetMapping(path = "/users/{id}")
//    public User findById(@PathVariable int id) throws UserNotFoundException {
//        User user = userDaoService.findOne(id);
//        if (user == null) throw new UserNotFoundException("id: " + id);
//        return user;
//    }

    @PostMapping(path = "jpa/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {

        User savedUser = repository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("jpa/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) throws UserNotFoundException {
        Optional<User> user = repository.findById(id);

        if (user.isEmpty()) throw new UserNotFoundException("id: " + id);

        EntityModel<User> entityModel = EntityModel.of(user.get());
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(getClass()).retrieveAllUsers());
        entityModel.add(linkBuilder.withRel("all-users"));

        return entityModel;
    }

    @DeleteMapping(path = "jpa/users/{id}")
    public void deleteUser(@PathVariable int id) {
        repository.deleteById(id);
    }
}
