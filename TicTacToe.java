import java.util.Scanner;

public class TicTacToe {
    // Create a 3x3 game board as a multi-dimensional array
    char[][] board = new char[3][3];

    // Initialize the game board with empty spaces
    public void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    // Print the current state of the game board
    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }

    // Ask a player to enter a row and column to place their mark (X or O)
    public boolean makeMove(char player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + player + ", enter row (1, 2, or 3): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Player " + player + ", enter column (1, 2, or 3): ");
        int col = scanner.nextInt() - 1;

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid input. Row and column must be between 1 and 3.");
            return false;
        }

        if (board[row][col] == ' ') {
            board[row][col] = player;
            return true;
        } else {
            System.out.println("The selected location is already occupied.");
            return false;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.initializeBoard();

        char currentPlayer = 'X';

        while (true) {
            game.printBoard();
            if (game.makeMove(currentPlayer)) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            // Check for a full board to end the game
            boolean isBoardFull = true;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (game.board[row][col] == ' ') {
                        isBoardFull = false;
                        break;
                    }
                }
            }

            if (isBoardFull) {
                System.out.println("The board is full");
                break;
            }
        }

        // Print the final board state
        game.printBoard();
    }
}