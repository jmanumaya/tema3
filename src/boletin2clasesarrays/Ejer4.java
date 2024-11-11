package boletin2clasesarrays;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Tabla para almacenar las puntuaciones de 8 participantes.
		int table[] = new int[8];
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);
		
		// Variable que almacenará la posición cuando vayamos a invertir el orden.
		int temp;
		
		// Indico al usuario lo que tiene que hacer.
		System.out.println("Introduce las puntuaciones de cada jugador.");
		
		// For para recoger la puntuacion de cada jugador en cada posición de la tabla.
		for (int i = 0; i < 8; i++) {
			System.out.println("Puntuación del jugaro " + (i + 1) + ":");
			table[i] = sc.nextInt();
		}
		
		// Ordeno la tabla para empear de menor a mayor.
		Arrays.sort(table);
		
		// Reinvierto el orden para que sea de mayor a menor.
        for (int i = 0; i < table.length / 2; i++) {
        	
        	// Guardo temporalmente el valor de la posición i
            temp = table[i];
            
            // copio el valor de la posicion opuesta (desde el final) en la posición i.
            table[i] = table[table.length - 1 - i];
            
            // clooco el valor temporal en la posición opuesta, completando el intercambio
            table[table.length - 1 - i] = temp;
        }
        
        // Imprimo el array ordenado de mayor a menor
        System.out.println("Puntuaciones de mayor a menor:");
        for (int score : table) {
            System.out.println(score);
        }
		
		
		// Cierro uso de escaner.
		sc.close();
	}
}
