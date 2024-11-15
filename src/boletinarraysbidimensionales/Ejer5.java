package boletinarraysbidimensionales;

import java.util.Random;

public class Ejer5 {

	public static void main(String[] args) {

		// Creo una tabla con dimensiones 4x5.
	    int tabla[][] = new int[4][5];  
	    
	    // Creo el random para luego generar números aleatorios en un rango.
	    Random random = new Random();  
	    
	    // Variable para almacenar la suma de los elementos de cada fila.
	    int suma = 0;
	    
	    // Variable para almacenar la suma de los elementos de cada columna.
	    int suma1 = 0;
	    
	    // Variable para almacenar la suma total de todos los elementos de la tabla.
	    int sumaTotal = 0;  
	    
	    // Lleno la tabla con números aleatorios entre 100 y 999.
	    for (int i = 0; i < tabla.length; i++) {
	        for (int j = 0; j < tabla[i].length; j++) {
	            tabla[i][j] = random.nextInt(100, 1000);
	        }
	    }
	    
	    // Imprimo los elementos de la tabla y sumo los elementos de cada fila.
	    for (int i = 0; i < tabla.length; i++) {
	        for (int j = 0; j < tabla[i].length; j++) {
	            System.out.print(tabla[i][j] + "\t");
	            // Añado el elemento actual a la suma de la fila.
	            suma += tabla[i][j];  
	        }
	        // Imprimo la suma de la fila.
	        System.out.println(suma);
	        // Reseteo la suma para la siguiente fila.
	        suma = 0;
	    }
	    
	    // Imprimo las sumas de las columnas y la suma total.
	    for (int j = 0; j < tabla[0].length; j++) {
	    	
	    	// Reseto la suma para cada columna.
	        suma1 = 0;  
	        for (int i = 0; i < tabla.length; i++) {
	        	// Añado el número actual a la suma de la columna.
	            suma1 += tabla[i][j];  
	        }
	        // Añado la suma de la columna a la suma total.
	        sumaTotal += suma1;
	        // Imprimo la suma de la columna.
	        System.out.print(suma1 + "\t");  
	    }
	    // Imprimo la suma total de todos los elementos en la matriz.
	    System.out.println(sumaTotal);  
	}
}
