package twodimensionsgames;

import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a 3x3 panel for the Tic Tac Toe game
        char panel[][] = new char[3][3];
        
        // Initialize the first player to Player 1
        int turn = 1;

        // Variable to check if there's a winner
        boolean winner = false;

        // Variable to count the total moves made
        int moves = 0;

        // Display a welcome message
        System.out.println("Hi! Welcome to Tic Tac Toe Game");

        // Explain the game rules
        System.out.println("For playing this game, you have a panel with a 3x3 size...\n");

        // Initialize and display the panel
        generatePanel(panel);

        // Main game loop, runs until there is a winner or 9 moves are made (draw)
        while (!winner && moves < 9) {

            // Handle the current player's turn
            turn(panel, turn);

            // Increment the move counter after a valid turn
            moves++;

            // Display the updated panel
            printPanel(panel);

            // Check if the current player has won
            winner = checkThreeInARow(panel);

            // Announce the winner if found
            if (winner) {
                System.out.println("Congrats Player " + turn + "!!! You are the winner.");
            } 
            // If all moves are made and no winner, announce a draw
            else if (moves == 9) {
                System.out.println("OHH, we have a draw.");
            }

            // Switch the turn between Player 1 and Player 2
            if (!winner) {
                turn = turn == 1 ? 2 : 1;
            }
        }
    }

    // Print the current state of the game panel
    private static void printPanel(char[][] panel) {
        // Loop through each row
        for (int i = 0; i < panel.length; i++) {
            // Loop through each column
            for (int j = 0; j < panel.length; j++) {
                // Print each cell with a separator
                System.out.print(panel[i][j] + " | ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    // Check if there is a winning line (three in a row)
    public static boolean checkThreeInARow(char[][] panel) {
        // Variable to store if there is a winning line
        boolean threeInARow = false;

        // Check all rows for a winning line
        for (int i = 0; i < 3; i++) {
            // A row is a winning line if all three cells are the same and not empty
            if (!threeInARow && panel[i][0] != '-' && panel[i][0] == panel[i][1] && panel[i][1] == panel[i][2]) {
                threeInARow = true;
            }
        }

        // Check all columns for a winning line
        for (int j = 0; j < 3; j++) {
            // A column is a winning line if all three cells are the same and not empty
            if (!threeInARow && panel[0][j] != '-' && panel[0][j] == panel[1][j] && panel[1][j] == panel[2][j]) {
                threeInARow = true;
            }
        }

        // Check the main diagonal for a winning line
        if (!threeInARow && panel[0][0] != '-' && panel[0][0] == panel[1][1] && panel[1][1] == panel[2][2]) {
            threeInARow = true;
        }

        // Check the secondary diagonal for a winning line
        if (!threeInARow && panel[0][2] != '-' && panel[0][2] == panel[1][1] && panel[1][1] == panel[2][0]) {
            threeInARow = true;
        }

        // Return whether a winning line was found
        return threeInARow;
    }

    // Handle a player's turn
    private static void turn(char[][] panel, int turn) {
        // Variable to ensure the player enters a valid move
        boolean validMove = false;
        int line, col;

        // Announce which player's turn it is
        System.out.println("Your turn Player " + turn);

        // Loop until the player provides a valid move
        while (!validMove) {
            // Ask the player for the row position
            System.out.print("Give me a position line (0-2): ");
            line = sc.nextInt();

            // Ask the player for the column position
            System.out.print("Now, give me a position column (0-2): ");
            col = sc.nextInt();

            // Ensure the move is within bounds
            if (line >= 0 && line < 3 && col >= 0 && col < 3) {
                // Check if the selected cell is empty
                if (panel[line][col] != 'X' && panel[line][col] != 'O') {
                    // Mark the cell with the player's symbol
                    panel[line][col] = turn == 1 ? 'X' : 'O';
                    validMove = true;
                } else {
                    // Notify the player if the cell is already occupied
                    System.out.println("This position is already used. Try again...");
                }
            } else {
                // Notify the player if the input is out of bounds
                System.out.println("Invalid position. Please enter values between 0 and 2.");
            }
        }
    }

    // Initialize the panel with empty cells
    private static void generatePanel(char[][] panel) {
        // Loop through each row
        for (int i = 0; i < panel.length; i++) {
            // Loop through each column
            for (int j = 0; j < panel[i].length; j++) {
                // Set each cell to the empty character '-'
                panel[i][j] = '-';
            }
        }
        // Display the initial empty panel
        printPanel(panel);
    }
}

