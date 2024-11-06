package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		// Variable que obtendrá cada valor del usuario.
		double num;

		// Tabla que albergará todos los valores introducido.
		double numbers[] = new double[5];

		// Indico al usuario que tiene que hacer.
		System.out.println("Buenas, necesito que me des 5 números decimales.");

		// For para recorrer cada posición del Array para poder ir asignandole los
		// valores introducidos por el user.
		for (int i = 0; i < numbers.length; i++) {

			// Le pido al usuario un número.
			System.out.print("Número: ");
			num = sc.nextDouble();

			// Voy asignando a cada posición del array numbers el número que asigna el
			// usuario.
			numbers[i] = num;

		}

		// Indico que voy a mostrar los números introducidos.
		System.out.println("Numeros introducidos:");

		// for para recorrer cada posición del array desde el ultimo valor introducido hasta el primero.
		for (int i = 4; i >= 0; --i) {
			// Muestro cada valor de cada posición del array.
			System.out.println(numbers[i]);
		}

		// Cierro uso de escaner.
		sc.close();

	}

}
