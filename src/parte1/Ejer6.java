package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		// Variable que obtendrá cada valor del usuario.
		int num;
		
		// Tabla que contendrá los valores introducidos por el usuario.
		int numbers[] = new int[8];

		// Indico al usuario que tiene que hacer.
		System.out.println("Buenas, necesito que me des 8 números enteros y te diré cuales son pares y cuales impares.");

		// For para recorrer cada posición del Array para poder ir asignandole los
		// valores introducidos por el user.
		for (int i = 0; i < numbers.length; i++) {

			// Le pido al usuario un número.
			System.out.print("Número: ");
			num = sc.nextInt();

			// Voy asignando a cada posición del array numbers, el número que asigna el
			// usuario.
			numbers[i] = num;

		}

		// For que va a recorrer cada posición del array para luego comprobar si es par o impar y mostrarlo.
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				System.out.println("\n" + numbers[i] + " par");
			} else {
				System.out.println("\n" + numbers[i] + " impar");
			}

		}

		// Cierro uso de escaner.
		sc.close();

	}

}
