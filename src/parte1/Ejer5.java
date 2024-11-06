package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		// Variable que obtendrá cada valor del usuario.
		double num;

		// Tabla que albergará todos los valores introducido.
		double numbers[] = new double[10];

		// Variable que recoje la suma de la tabla.
		double suma = 0;

		// Variable que recoje el valor mayor ultimo encontrado.
		double mayor = Double.MIN_VALUE;

		// Variable que recoje el valor menor ultimo encontrado.
		double menor = Double.MAX_VALUE;

		// Indico al usuario que tiene que hacer.
		System.out.println("Buenas, necesito que me des 10 números reales y te daré "
				+ "la suma de ellos, el minimo y el maximo introducido");

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

		// for que recorro cada posición del array para poder ir sumando cada valor introducido en dichas posiciones.
		for (int i = 0; i < numbers.length; i++) {

			suma += numbers[i];

		}

		// Mismo for que el anterior pero ahora para comprobar cual es el valor menor y mayor.
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > mayor) {
				mayor = numbers[i];

			} else if (numbers[i] < menor) {
				menor = numbers[i];
			}

		}

		// Le muestro al usuario lo que espera del programa: suma, el mayor y el menor.
		System.out.println("Suma de todos los números: " + suma);
		System.out.println("El valor mayor introducido: " + mayor);
		System.out.println("El valor menor introducido: " + menor);

		// Cierro uso de escaner.
		sc.close();
	}

}
