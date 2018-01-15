package slw.game.model;

public class Game {
    private Player player;
    private Score high;
    private Score current;

    public Game() {
        player = new Player();
        high = new Score();
        current = new Score();
    }


    @Override
    public String toString() {
        return "Player: " + player + "\n" +
                "High Score: " + high + "\n" +
                "Current Score: " + current + "\n";
    }
}
