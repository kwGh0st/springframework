package kwgh0st.springframework.app03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ContraQualifier")
public class Contra implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Contra up!");
    }

    @Override
    public void down() {
        System.out.println("Contra down!");
    }

    @Override
    public void left() {
        System.out.println("Contra left!");
    }

    @Override
    public void right() {
        System.out.println("Contra right!");
    }
}
