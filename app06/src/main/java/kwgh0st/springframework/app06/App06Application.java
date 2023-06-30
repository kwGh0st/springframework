package kwgh0st.springframework.app06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App06Application {

	public static void main(String[] args) {
		try (var ctx = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(ctx.getBean("name"));
			System.out.println(ctx.getBean("age"));
		}
	}

}
