package kwgh0st.springframework.app02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App02Application {

	public static void main(String[] args) {
		SpringApplication.run(App02Application.class, args);

		try (var context = new  AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GameRunner.class).run();
		}
	}

}
