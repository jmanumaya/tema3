package boletinfunciones;

public class Ejer3Abajo {
	
	// Función que comprueba si una tabla (matriz) es simétrica
	public static boolean simetrica(int[][] tabla) {
		
		// Variable booleana que indicará si la matriz es simétrica o no.
		// Se inicializa en true porque asumimos que es simétrica hasta que se demuestre lo contrario.
		boolean simetrica = true;
		
		// Variables que representarán las filas (i) y columnas (j) durante los bucles.
		int i = 0;
		int j = 0;
		
		// Bucle while para recorrer las filas mientras 'i' sea menor que la longitud de la matriz
		// y no se haya encontrado un caso que invalide la simetría (simetrica sigue siendo true).
		while (i < tabla.length && simetrica) {
			
			// Empiezo a comparar desde la columna siguiente a la diagonal principal (j = i + 1)
			j = i + 1;
			
			// Bucle while para recorrer las columnas mientras 'j' sea menor que la longitud
			// de la fila actual y no se haya invalidado la simetría.
			while (j < tabla[i].length && simetrica) { 
				
				// Si el elemento en la posición [i][j] es diferente al de [j][i], 
				// significa que la matriz no es simétrica.
				simetrica = (tabla[i][j] == tabla[j][i]);
				
				// Incremento el valor de 'j' para pasar a la siguiente columna.
				j++;
			}
			
			// Incremento el valor de 'i' para pasar a la siguiente fila.
			i++;
		}
		
		// Devuelvo el valor final de 'simetrica', que será true si la matriz es simétrica, 
		// o false si se encontró algún caso que lo contradiga.
		return simetrica;
	}

	public static void main(String[] args) {
		
		// Variable que almacenará la respuesta obtenida de la función.
		boolean respuesta;
		
		// PARA COMPROBAR EL RESULTADO, DESCOMENTA UNA TABLA Y COMENTA LA OTRA (Ctrl + Shift + /).
		
		// Tabla con valores simétricos.
		int tabla[][] = {
		    {1, 2, 3}, // Fila 0
		    {2, 4, 5}, // Fila 1
		    {3, 5, 6}  // Fila 2
		};
		
		// Tabla con valores no simétricos.
//		int tabla[][] = {
//		    {1, 2, 3}, // Fila 0
//		    {0, 4, 5}, // Fila 1
//		    {3, 0, 6}  // Fila 2
//		};
		
		// Llamo a la función 'simetrica' y almaceno el resultado en la variable 'respuesta'.
		respuesta = simetrica(tabla);
		
		// Imprimo el resultado: true si la matriz es simétrica, false si no lo es.
		System.out.println(respuesta);
	}
}
