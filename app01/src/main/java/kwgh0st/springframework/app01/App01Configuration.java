package kwgh0st.springframework.app01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name, int age) {}

record Address(String firstLine, String city) {}

@Configuration
public class App01Configuration {

    @Bean
    public String name() {
        return "John";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Jack" , 33);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
