package kwgh0st.springframework.app05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App05Application {

	public static void main(String[] args) {
		try (var ctx = new AnnotationConfigApplicationContext(App05Application.class)) {
			var max = ctx.getBean(BusinessCalculationService.class).findMax();
			System.out.println(max);
		}
	}

}
