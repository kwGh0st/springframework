package kwgh0st.springframework.app01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App01Application {

	public static void main(String[] args) {

		SpringApplication.run(App01Application.class, args);

		var context = new AnnotationConfigApplicationContext(App01Configuration.class);

		System.out.println(context.getBean("name"));

		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));

		System.out.println(context.getBean("address"));

	}

}
