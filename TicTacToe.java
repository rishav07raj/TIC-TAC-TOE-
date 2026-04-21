import java.util.Scanner;

public class TicTacToe {

    // Method to create and initialize the board
    public static char[][] createBoard() {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';             // initialize empty cells
            }
        }
        return board;
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        System.out.println("Current Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to get user input (UC3)
    public static int getPlayerMove(Scanner scanner) {
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");

            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid input. Enter number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Enter an integer.");
                scanner.next(); // clear invalid input
            }
        }
    }

    // Main method (Flow execution)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create & initialize board
        char[][] board = createBoard();

        // Step 2: Display board
        printBoard(board);

        // Step 3: Get user input
        int move = getPlayerMove(scanner);

        // Step 4: Return control to game logic (for now just print)
        System.out.println("You selected slot: " + move);

        scanner.close();
    }
}