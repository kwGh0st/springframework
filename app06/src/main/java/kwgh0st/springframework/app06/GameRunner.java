package kwgh0st.springframework.app06;

public class GameRunner {
    private Game game;

    public GameRunner(Game game) {
        this.game = game;
        game.run();
    }
}
