package boletin2clasesarrays;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		//valor que introducirá el usuario para la longitud.
		int longitud;
		
		//Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		//Indico al usuario que debe hacer.
		System.out.println("Buenas, voy a crear una tabla, dame el valor de longitud que quieres que tenga.");
		System.out.println("Valor de longitud: ");
		longitud = sc.nextInt();
		
		// Creo la tabla con esa longitud dada.
		int tabla[] = new int [longitud];
		
		System.out.println("Ahora añade los valores a la tabla");
		
		// For para recorrer cada posición he ir asignado valores.
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Valor: ");
			tabla[i] = sc.nextInt();
		}
		
		// Muestro la tabla con sus valores en cada posición con un for-each.
		System.out.println("Tabla creada: ");
		for (int value : tabla) {
			System.out.print(value + " ");
		}
		
		// Cierro uso de escaner.
		sc.close();

	}

}
