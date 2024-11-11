package boletin2clasesarrays;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Tabla para almacenar las puntuaciones de 8 participantes.
		int table[] = new int[8];
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);
		
		// Indico al usuario lo que tiene que hacer.
		System.out.println("Introduce las puntuaciones de cada jugador.");
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Puntuación del jugaro " + (i + 1) + ":");
			table[i] = sc.nextInt();
		}
		
		Arrays.
		
		
		// Cierro uso de escaner.
		sc.close();
	}
}
