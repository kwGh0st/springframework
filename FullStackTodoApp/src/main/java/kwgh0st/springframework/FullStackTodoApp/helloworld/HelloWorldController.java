package kwgh0st.springframework.FullStackTodoApp.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean!");
    }

    @GetMapping(path = "/hello-world-var/{name}")
    public HelloWorldBean helloWorldVar(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World!, %s", name));
    }

}
