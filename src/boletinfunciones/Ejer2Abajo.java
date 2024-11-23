package boletinfunciones;
import java.util.*;

public class Ejer2Abajo {
	
    // Método para transponer la tabla generada
	public static int[][] transposicion(int[][] tabla, int filas, int col) {
		
		// Creo una nueva tabla con dimensiones inversas (filas por columnas) para crear la transpuesta.
		int[][] tablatrans = new int[col][filas];
		
		// Recorro la tabla original
		// Itero sobre las filas de la tabla original
		for (int i = 0; i < filas; i++) { 
			// Itero sobre las columnas de la tabla original
		    for (int j = 0; j < col; j++) { 
		        // Copio el valor de tabla[i][j] en la posición transpuesta tablatrans[j][i]
		        tablatrans[j][i] = tabla[i][j];
		    }
		}
		
		// Devuelvo la tabla transpuesta
		return tablatrans;
	}

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		// Creo el random.
		Random rd = new Random(); 
		
		// Variable que almacenará el número de filas
		int filas = 0;
		
		// Variable que almacenará el número de columnas
		int col = 0; 
		
		// Declaro la tabla original.
		int[][] tabla;
		
		// Solicito al usuario las dimensiones de la tabla
		System.out.println("Dame una longitud para las filas otra para las columnas para crear una tabla con numeros aleatorios.");
		System.out.print("Longitud de las filas: ");
		// Leo el número de filas
		filas = sc.nextInt(); 
		System.out.print("Longitud de las columnas: ");
		// Leo el número de columnas
		col = sc.nextInt(); 
		
		// Creo la tabla original con las dimensiones especificadas por el usuario.
		tabla = new int[filas][col];

		// Relleno la tabla con números aleatorios entre 1 y 20
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rd.nextInt(1, 21); 
			}
		}
		
		// Imprimo la tabla generada
		System.err.println("TABLA GENERADA:");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		// Creo la tabla transpuesta llamando a la función
		int[][] transpuesta = transposicion(tabla, filas, col);
		
		// Imprimo la tabla transpuesta
		System.err.println("TRANSPOSICIÓN DE LA TABLA:");
		for (int i = 0; i < col; i++) {
		    for (int j = 0; j < filas; j++) {
		        System.out.print(transpuesta[i][j] + "\t");
		    }
		    System.out.println();
		}

		// Cierro uso de escaner.
		sc.close();
	}
}

