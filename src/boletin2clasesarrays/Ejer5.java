package boletin2clasesarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		//Tabla con 1000 posiciones.
		int tabla[] = new int[1000];
		
		//Creo el generador.
		Random random = new Random();
		
		//Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		//Respuesta del user.
		int numero;
		
		//Respuesta del user comprobación.
		String respuesta;
		
		// Contador de veces que existe.
		int cont = 0;
		
		// Genero todos los números aleatorios en cada posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = random.nextInt(0, 100);
		}

		// Indico al usuario que tiene que hacer y que hace el programa.
		System.out.println("Buenas, hay generada una tabla con 1000 números aleatorios entre 0 y 99. "
				+ "Dame un valor y te diré si existe en la tabla y cuantas veces existe.");
		numero = sc.nextInt();
		
		// Compruebo si existe el valor en alguna de las posiciones.
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numero) {
				++cont;
			}
		}
		
		// If para saber si imprimir un resultado u otro según si existe el valor.
		if (cont > 0) {
			System.out.println("Existe el valor " + numero + " en la tabla " + cont + " veces.");
		} else {
			System.out.println("No existe el valor " + numero + " en la tabla.");
		}
		
		// Pregunto si quiere revisar la tabla para comprobarlo.
		System.out.println("¿Quieres comprobarlo? ('S' para si 'N' para no)");
		respuesta = sc.next().toUpperCase();
		
		if (respuesta.equals("S")) {
			System.out.println(Arrays.toString(tabla));
		}
		
		System.err.println("Fin del programa.");
		
		// Cierro uso de escaner.
		sc.close();
	}
}
