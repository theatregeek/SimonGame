package slw.game;

import slw.game.model.Game;

public class SimonGame {

    private Game game;

    private SimonGame() {
        System.out.println("Sammie is awesome");
        game = new Game();
        System.out.println(game);
    }

    public static void main(String[] args) {
        SimonGame sg = new SimonGame();
    }
}
