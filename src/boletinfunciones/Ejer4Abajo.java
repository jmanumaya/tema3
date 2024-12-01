package boletinfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4Abajo {

	// Defino la función esMagica1 que verifica si la tabla es mágica por las filas.
	public static boolean esMagica1(int tabla[][]) {
		// Inicializo la variable magica en true, asumiendo que la tabla es mágica al principio.
		boolean magica = true;

		// Inicializo la variable suma para almacenar la suma de los elementos de la primera fila.
		int suma = 0;

		// Defino sumaTotal para almacenar la suma de los elementos de cada fila en cada iteración.
		int sumaTotal;

		// Inicializo i en 1 para comenzar a comparar desde la segunda fila (la primera fila ya se ha sumado).
		int i = 1;

		// Defino j para usarlo en los bucles for.
		int j;

		// Utilizo un bucle for para sumar los elementos de la primera fila.
		for (j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j]; // Sumo cada elemento de la primera fila a la variable suma.
		}

		// Comienzo un bucle while que recorre todas las filas de la tabla, comenzando desde la segunda.
		while (i < tabla.length && magica) { // Continuaré mientras no se haya encontrado una fila con una suma distinta.
			sumaTotal = 0; // Reseteo sumaTotal para sumar los elementos de la fila actual.

			// Utilizo un bucle for para sumar los elementos de la fila actual.
			for (j = 0; j < tabla[i].length; j++) {
				sumaTotal += tabla[i][j]; // Sumo cada elemento de la fila actual a sumaTotal.
			}

			// Verifico si la suma de la fila actual es diferente a la suma de la primera fila.
			if (suma != sumaTotal) {
				magica = false; // Si las sumas no coinciden, la tabla no es mágica.
			}

			i++; // Paso a la siguiente fila.
		}

		// Devuelvo el valor de magica, que será true si todas las filas tienen la misma suma.
		return magica;
	}

	// Defino la función esMagica2 que verifica si la tabla es mágica por las
	// columnas.
	public static boolean esMagica2(int tabla[][]) {
		// Inicializo la variable magica en true, asumiendo que la tabla es mágica al principio.
		boolean magica = true;

		// Inicializo la variable suma para almacenar la suma de los elementos de la primera fila.
		int suma = 0;

		// Defino sumaTotal para almacenar la suma de los elementos de cada columna en cada iteración.
		int sumaTotal;

		// Inicializo i en 1 para comenzar a comparar desde la segunda columna (la primera columna ya se ha sumado).
		int i = 1;

		// Defino j para usarlo en los bucles for.
		int j;

		// Utilizo un bucle for para sumar los elementos de la primera fila.
		for (j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j]; // Sumo cada elemento de la primera fila a la variable suma.
		}

		// Comienzo un bucle while que recorre todas las columnas de la tabla.
		while (j < tabla[0].length && magica) { // Continuaré mientras no se haya encontrado una columna con una suma distinta.
			sumaTotal = 0; // Reseteo sumaTotal para sumar los elementos de la columna actual.

			// Utilizo un bucle for para sumar los elementos de la columna actual.
			for (i = 0; i < tabla.length; i++) {
				sumaTotal += tabla[i][j]; // Sumo cada elemento de la columna actual a sumaTotal.
			}

			// Verifico si la suma de la columna actual es diferente a la suma de la primera
			// fila.
			if (suma != sumaTotal) {
				magica = false; // Si las sumas no coinciden, la tabla no es mágica.
			}

			j++; // Paso a la siguiente columna.
		}

		// Devuelvo el valor de magica, que será true si todas las columnas tienen la mimsa suma.
		return magica;
	}

	public static void main(String[] args) {
		// Creo un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);

		// Declaro una matriz llamada tabla.
		int tabla[][];

		// Declaro una variable para la longitud de la tabla.
		int longitud = 0;

		// Declaro variables para almacenar las respuestas de las funciones esMagica1 y
		// esMagica2.
		boolean respuesta1;
		boolean respuesta2;

		// Solicito al usuario la longitud de la tabla NxN.
		System.out.println("Dime la longitud de la tabla NxN (N): ");
		longitud = sc.nextInt();

		// Inicializo la matriz tabla con el tamaño dado por el usuario.
		tabla = new int[longitud][longitud];

		// Solicito al usuario los valores para llenar la matriz tabla.
		System.out.println("Introduce los valores de la tabla:");
		for (int i = 0; i < longitud; i++) {
			for (int j = 0; j < longitud; j++) {
				// Pido al usuario que ingrese un valor para cada elemento de la tabla.
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				tabla[i][j] = sc.nextInt(); // Asigno el valor ingresado a la tabla.
			}
		}

		// Llamo a la función esMagica1 para verificar si la tabla es mágica por las filas.
		respuesta1 = esMagica1(tabla);

		// Llamo a la función esMagica2 para verificar si la tabla es mágica por las columnas.
		respuesta2 = esMagica2(tabla);

		// Si ambas funciones devuelven true, la tabla es mágica, de lo contrario no lo es.
		if (respuesta1 == true && respuesta2 == true) {
			System.out.println("La tabla:\n" + Arrays.deepToString(tabla) + "\nEs mágica.");
		} else {
			System.out.println("La tabla:\n" + Arrays.deepToString(tabla) + "\nNo es mágica.");
		}
		
		// Cieerro uso de escaner.
		sc.close();
	}
}
