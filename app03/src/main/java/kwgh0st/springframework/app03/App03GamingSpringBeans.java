package kwgh0st.springframework.app03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kwgh0st.springframework.app03")
public class App03GamingSpringBeans {

    @Bean
    public GameRunner gameRunner(@Qualifier("ContraQualifier") GamingConsole game) {
        System.out.println("Game: " + game);

        return new GameRunner(game);
    }
}
