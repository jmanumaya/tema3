package boletin2clasesarrays;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el random.
		Random random = new Random();
		
		// Creo la tabla.
		int tabla[] = new int[30];
		
		// Genero 30 números aleatorios y los voy asignando a cada posición de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = random.nextInt(0, 10);
		}
		
		// Muestro la tabla tal cual se ha creado
		System.out.println("Tabla desordenada: ");
		for (int value : tabla) {
			System.out.print(value + " ");
		}
		
		System.out.println("");
		
		// Ordeno la tabla gracias a la clase Array y el metodo sort.
		Arrays.sort(tabla);
		
		// Muestro la tabla ya ordenada.
		System.out.println("Tabla ordenada: ");
		for (int value : tabla) {
			System.out.print(value + " ");
		}
	}
}
