package englishexercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		// Here we store the length of the array
		int length = 10;

		// Variable to store the position of the fly
		int position;

		// User's input to guess the number
		int guess = 0;

		// Boolean that will stay true until the game ends
		boolean play = true;

		// Array with 10 positions
		int[] table = new int[length];

		// Random number generator
		Random rnd = new Random();

		// The position where the fly is located
		position = rnd.nextInt(length);

		// Where put a 1 on the array to determine that the fly is there (The rest is
		// filled with 0).
		table[position] = 1;

		// Create a Scanner.
		Scanner sc = new Scanner(System.in);

		// Create a do-while that will continue until the game is over.
		do {

			// Ask the user where he thinks the fly is.
			System.out.println("Where do you think the fly is?");

			// Read user's input.
			guess = sc.nextInt();

			// If the user's input is above or under the length of the array, it will ask
			// the user to add a correct value.
			while (guess < 0 || guess >= length) {

				// Tell the user to introduce a correct value.
				System.out.println("Introduce a value between 0 and " + (length - 1));

				// Read user's input.
				guess = sc.nextInt();
			}
			// If the user guessed the position on the fly, then it will enter the if.
			if (guess == position) {

				// Print that you won.
				System.out.println("You Won!");

				// Set play to false (end the loop).
				play = false;

				// If the guess is above or under the position of the fly, it will enter the if.
			} else if (guess == position - 1 || guess == position + 1) {

				// Tell the user that the fly was in a contiguous position.
				System.out.println("The fly was in a contiguous position but it flew away.");

				// Set the position of the fly to 0 (It isn't there anymore)
				table[position] = 0;

				// Generate a random position between 0 and the length.
				position = rnd.nextInt(length);

				// Set to 1 the value (The fly is there)
				table[position] = 1;

				// If the if statement is false, then it will enter the else statement
			} else {

				// Print that the fly is far away.
				System.out.println("The fly is far away.");
			}

			// Do-while
		} while (play);

		// Close the Scanner.
		sc.close();
	}
}