package kwgh0st.springframework.app01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App01Application {

	public static void main(String[] args) {

		SpringApplication.run(App01Application.class, args);

		var context = new AnnotationConfigApplicationContext(App01Configuration.class);

		System.out.println("personWithQualifier - " + context.getBean("personWithQualifier"));

		System.out.println("Primary Person - " + context.getBean(Person.class));

		System.out.println("Primary address - " + context.getBean(Address.class));

	}

}
