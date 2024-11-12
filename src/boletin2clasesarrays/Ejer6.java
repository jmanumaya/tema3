package boletin2clasesarrays;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {

		Random random = new Random();
		// Tabla de la combinación ganadora
		int[] ganadora = { 12, 23, 29, 30, 45, 47 };

		// Tabla para los números de la apuesta del usuario
		int[] tusNumeros = new int[6];

		// Contador de números generados sin repetir
		int cont = 0;

		// Asigno en cada momento un número aleatorio para comparar y asignar.
		int num;

		// Contador de aciertos.
		int contAciertos = 0;

		// Ordenamos la combinación ganadora como pide el enunciado con el metodo sort.
		Arrays.sort(ganadora);

		// Generamos 6 números únicos aleatorios para la apuesta
		while (cont < 6) {
			// Genero un número entre 1 y 49
			num = random.nextInt(49) + 1;
			// Comprobamos si el número ya existe en la apuesta o nuestro números.
			if (Arrays.binarySearch(tusNumeros, 0, cont, num) < 0) {
				// Añado el número a la siguiente posición
				tusNumeros[cont] = num;
				// Incrementa el contador de números generados
				cont++;
				// Ordeno los números hasta donde se han generado
				Arrays.sort(tusNumeros, 0, cont);
			}
		}

		// Imprimimos los resultados
		System.out.println("Apuesta ganadora: " + Arrays.toString(ganadora));
		System.out.println("Tus números generados: " + Arrays.toString(tusNumeros));

		// Contamos los aciertos
		for (int numero : tusNumeros) {
			// Si el número está en la combinación ganadora
			if (Arrays.binarySearch(ganadora, numero) >= 0) {
				// Incremeno el contador de aciertos
				contAciertos++;
			}
		}

		// Muestro dichos aciertos al usuario.
		System.out.println("Número de aciertos: " + contAciertos);
	}

}
