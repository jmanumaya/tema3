package boletin2clasesarrays;

import java.util.Arrays;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Sí, lo admito, lo iba a hacer con el fill a lo guarro.
		
		// Empiezo con la variable 'inicio' en 0. La voy a usar como punto de inicio para llenar partes de la tabla.
	    int inicio = 0;
	    
	    // Creo la tabla de tamaño 55.
	    int[] tabla = new int[55];  

	    // Ahora uso un bucle que va de 1 a 10, para ir llenando la tabla.
	    for (int i = 1; i <= 10; i++) {
	        // Llamo al metodo fill de la clase Arrays para llenar una sección de 'tabla' con el valor de la'i'.
	        // Lleno desde el índice 'inicio' hasta 'inicio + i', poniendo en cada posición el valor actual de 'i'.
	        Arrays.fill(tabla, inicio, inicio + i, i);
	        
	        // Luego, incremento 'inicio' sumándole 'i'. Así, en la próxima iteración, empiezo a llenar desde donde terminé.
	        inicio += i;
	    }
	    
	    // imprimo la ttabla completa para comprobar que ha quedado bien.
	    System.out.println(Arrays.toString(tabla));
	}

}
