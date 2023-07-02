package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonsJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    PersonJpaRepository repository;
    @Autowired
    PersonController controller;

    @Override
    public void run(String... args) throws Exception {
        for (Person person : controller.retrieveAllPersons()) {
            repository.insert(person);
        }

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
