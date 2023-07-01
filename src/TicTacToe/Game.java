package TicTacToe;

public class Game {
    private Player player1;
    private Player player2;
    private Board board = new Board();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void go() {
        board.selectPosition(player1.getName(), player2.getName());
    }

}
