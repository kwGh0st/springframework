package kwgh0st.springframework.app03;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App03Application {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
