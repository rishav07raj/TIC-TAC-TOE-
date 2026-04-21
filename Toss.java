import java.util.Random;

public class Toss {

    static char player1Symbol, player2Symbol;
    static int currentPlayer;

    static void decideStarter() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Player " + currentPlayer + " starts!");
        System.out.println("Player 1: " + player1Symbol);
        System.out.println("Player 2: " + player2Symbol);
    }

    public static void main(String[] args) {
        decideStarter();
    }
}