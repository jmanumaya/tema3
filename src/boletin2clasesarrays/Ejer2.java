package boletin2clasesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Tabla 1.
		int tablaUno[] = new int[10];
		
		// Tabla 2.
		int tablaDos[] = new int[10];
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);

		// Indico al usuario
		System.out.println("Buenas dame 20 números");
		
		// Recojo los primeros 10 números en una tabla.
		for (int i = 0; i < tablaUno.length; i++) {
			System.out.print("Numero: ");
			tablaUno[i] = sc.nextInt();
		}
		
		// Recojo los 10 restantes en otra.
		for (int i = 0; i < tablaDos.length; i++) {
			System.out.print("Numero: ");
			tablaDos[i] = sc.nextInt();
		}
		
		// Indico al usuario lo que acaba de hacer.
		System.out.println("Acabas de crear dos tablas!");
		
		// Le muestro ambas tablas
		System.out.println("Tabla 1:");
		for (int value : tablaUno) {
			System.out.print(value + " ");
		}
		
		System.out.println("");
		
		System.out.println("Tabla 2:");
		for (int value : tablaDos) {
			System.out.print(value + " ");
		}
		System.out.println("");
		
		// Comparo ambas tablas para mostrarle al usuario si son iguales o no.
		if (Arrays.equals(tablaUno, tablaDos)) {
			System.out.println("Las tablas son iguales!!!");
		} else {
			System.out.println("Las tablas no son iguales!!!");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
