package boletinparajuegos;

import java.util.Random;

public class Ejer3 {
	
	// Función que desordenará una tabla unidimensional dada.
    public static void desordenar(int[][] tabla) {
    	// Random que generará un indice aleatorio.
        Random rd = new Random();
        // Variable que usaré para guardar valores temporalmente.
        int temp;
        // Variable que serán los indices aleatorios.
        int x;
        int z;

        // Recorro la tabla.
        for (int i = 0; i < tabla.length; i++) {
        	for(int j = 0; j < tabla[i].length; j++) {
        	
            // Genero dos índices aleatorios entre 0 y la longitud total.
            x = rd.nextInt(tabla.length);
        	z = rd.nextInt(tabla.length);

            // Intercambio tabla[i][j] con tabla[x][z].
            // Guardo en temp el valor de tabla[i][j]
            temp = tabla[i][j];
            
            // Guardo en tabla[i][j] el valor de tabla[x][z]
            tabla[i][j] = tabla[x][z];
            
            // Guardo en tabla[x][z] el valor de temp
            tabla[x][z] = temp;
        	}
        }
    }

    public static void main(String[] args) {
        // Ejemplo de una tabla cualquiera.
        int[][] tabla = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};

        // Imprimo la tabla original.
        System.out.println("Tabla original:");
        for (int i = 0; i < tabla.length; i++) {
        	for (int j = 0; j < tabla[i].length; j++) {
        		System.out.print(tabla[i][j] + "\t");
        	}
        	System.out.println();
        }

        // Llamo a la función para desordenar la tabla.
        desordenar(tabla);

        // Imprimo la tabla desordenada.
        System.out.println("\nTabla desordenada:");
        for (int i = 0; i < tabla.length; i++) {
        	for (int j = 0; j < tabla[i].length; j++) {
        		System.out.print(tabla[i][j] + "\t");
        	}
        	System.out.println();
        }
    }

}
