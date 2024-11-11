package englishexercise;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {

		// Create a table.
		int table[] = new int[10];

		// Variable for value of the switch.
		String value;

		// Variable for the input values
		int position;

		// Variable for break menu when the user put "c" in the menu.
		int exit = 0;

		// Create a Scanner.
		Scanner sc = new Scanner(System.in);

		// Do-while for tell to user at least one value and one pass.
		do {

			// I tell the user what are should doing in the exercise
			System.out.println("You have next menu, give me one option (a, b or c)");
			System.out.println("Main Menu:\n a) Show Values\n b) Introduce a Values\n c) Exit");
			value = sc.next();

			// Do a switch for menu.
			switch (value) {

			// If the user put "a" the program print the table
			case "a" -> {
				System.out.print(Arrays.toString(table));
				System.out.println("");
			}

			// If the user put "b" the program tell a position and new value.
			case "b" -> {

				System.out.println("Give me a position that you wana put a value");
				position = sc.nextInt();

				System.out.println("Now, Give me a value that you wana put");
				table[position] = sc.nextInt();
			}

			// If the user put "c" the program print end of the program and the will end.
			case "c" -> {
				System.out.println("End of the Program");
				++exit;
			}
			}

		// When exit value is different that 0, the program exit of the do-while.
		} while (exit == 0);

		// Close Scanner.
		sc.close();
	}
}
