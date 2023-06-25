package kwgh0st.springframework.app03;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Mario up!");
    }

    @Override
    public void down() {
        System.out.println("Mario down!");
    }

    @Override
    public void left() {
        System.out.println("Mario left!");
    }

    @Override
    public void right() {
        System.out.println("Mario right!");
    }
}
