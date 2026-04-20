public class TicTacToeBoard {

    public static void main(String[] args) {

        // 1. Create a 3x3 board
        char[][] board = new char[3][3];

        // 2. Initialize the board with '-'
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }

        // 3. Print the board
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}