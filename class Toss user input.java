import java.util.Random;

public class Toss {

    static char player1Symbol, player2Symbol;
    static int currentPlayer;

    // UC2: Toss logic
    static void decideStarter() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

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
    }

    // UC4: Slot → Row & Column
    static int[] convertSlot(int slot) {
        slot--; // zero-based

        int row = slot / 3;
        int col = slot % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        decideStarter(); // toss

        int slot = 7; // example move

        int[] pos = convertSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + pos[0]);
        System.out.println("Col: " + pos[1]);
    }
}