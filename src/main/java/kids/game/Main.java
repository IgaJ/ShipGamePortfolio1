package kids.game;

public class Main {

    public static void main(String[] args) {

        Display display = new Display("KidsGame");
        Gameplay gameplay = new Gameplay();
        GameEngine engine = new GameEngine(display, gameplay);

        engine.start();



    }


}