package kwgh0st.springframework.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private List<Person> persons = new ArrayList<>();

    {
        persons.add(new Person(1, "John", "Doe", "Chicago"));
        persons.add(new Person(2, "Veronica", "Simps", "Lincoln"));
        persons.add(new Person(3, "William", "Drinkwater", "London"));
        persons.add(new Person(4, "Jack", "Smith", "Manchester"));

    }


    @RequestMapping("/persons")
    public List<Person> retrieveAllPersons() {
        return persons;
    }
}
