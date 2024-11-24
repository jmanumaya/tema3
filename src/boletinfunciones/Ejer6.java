package boletinfunciones;

import java.util.Arrays;

public class Ejer6 {
	
	// Función que va a realizar esos cálculos con respecto a los valores de la tabla dada.
	public static int[] suma(int t[], int numElementos) {
		
	    // Calculo cuántas sumas debo realizar. Será igual al tamaño de la tabla t menos 
	    // el número de elementos que voy a agrupar más 1, porque las sumas son consecutivas.
	    int[] resultado = new int[t.length - numElementos + 1];
	    int suma;
	    
	    // Recorro la tabla para calcular cada suma consecutiva.
	    for (int i = 0; i < resultado.length; i++) {
	        suma = 0; // Inicializo la suma para el grupo actual.
	        
	        // Recorro los elementos consecutivos que corresponden a esta suma.
	        for (int j = 0; j < numElementos; j++) {
	            suma += t[i + j]; // Sumo el elemento correspondiente.
	        }
	        
	        // Guardo el resultado de la suma en la tabla resultado.
	        resultado[i] = suma;
	    }
	    
	    // Devuelvo la tabla con las sumas calculadas.
	    return resultado;
	}


	public static void main(String[] args) {
		
		//Puedes tocar los elementos de esas dos variables si quieres para hacer pruebas.
		
		// Tabla que usaré.
	    int[] t = {10, 1, 5, 8, 9, 2};
	    // Número que será el que diga cada cuantos números son los que se suman.
	    int numElementos = 3;

	    // LLamo a la función suma para guardarla en la variable resultado.
	    int[] resultado = suma(t, numElementos);

	    // Imprimo el resultado almacenado en la variable resultado.
	    System.out.println(Arrays.toString(resultado));
	}
}
