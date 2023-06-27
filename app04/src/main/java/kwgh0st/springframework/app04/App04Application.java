package kwgh0st.springframework.app04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App04Application {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(App04Application.class)) {
			System.out.println(context.getBean(FieldDependencyInjection.class));
			System.out.println(context.getBean(SetterDependencyInjection.class));
			System.out.println(context.getBean(ConstructorDependencyInjection.class));

		}
	}

}
