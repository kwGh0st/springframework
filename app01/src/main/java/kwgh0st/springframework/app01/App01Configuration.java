package kwgh0st.springframework.app01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

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
    @Primary
    public Person person() {
        return new Person("Primary name" , 33, new Address("Primary person address", "Primary person city"));
    }

    @Bean
    @Primary
    public Address address() {
        return new Address("Primary address", "Primary City");
    }

    @Bean
    public Person personWithQualifier(@Qualifier("name-qualifier") String name, @Qualifier("age-qualifier") int age, @Qualifier("address-qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean
    @Qualifier("age-qualifier")
    public int ageWithQualifier() {
        return 50;
    }

    @Bean
    @Qualifier("name-qualifier")
    public String nameWithQualifier() {
        return "Name with qualifier";
    }

    @Bean
    @Qualifier("address-qualifier")
    public Address address3() {
        return new Address("Qualifier address", "Qualifier city");
    }
}
