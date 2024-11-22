package boletinfunciones;
import java.util.*;

public class Ejer1Abajo {

	public static void main(String[] args) {
		
		// Tabla que contiene los valores a analizar luego para buscar el valor menor y mayor.
		int tabla [][] = new int [6][10];
		
		// Variable que almacenará la respuesta por parte de la función.
		int respuesta[];
		
		// Creo el random.
		Random rd = new Random();
		
		// Recorro cada posición de la tabla para asignarle un valor aleatorio
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rd.nextInt(0, 1001);
			}
		}
		
		// Doy el valor de la funcion a la variable respuesta.
		respuesta = menorMayor(tabla);
		
		// Quita el comentario para comprobar la tabla generada y comprobar que el menor y mayor son correctos.
		// System.out.println(Arrays.deepToString(tabla));
		
		// Imprimo la tabla que me devuelve la función (el resultado que buscamos)
		System.out.println(Arrays.toString(respuesta));
	}
	
	// Función que me va a buscar de la tabla dada creada en el main el valor menor y mayor.
	static int[] menorMayor(int[][] tabla) {
		
		// Tabla que va a contener el valor mayor y el menor.
		int mayorMenor[] = new int [2];
		
		// Variable que contendrá el valor menor y mayor.
		int menor = 1001;
		int mayor = -1;
		
		// For para recorrer cada posición y luego con el if comprobar si el valor de dicha posición es mayor o menor
		// del que tengamos almacenado en cada variable (mayor y menor) y asignarle dicho valor si procede.
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				
				if (tabla[i][j] < menor) {
					menor = tabla[i][j];
				}
				if (tabla[i][j] > mayor) {
					mayor = tabla[i][j];
				}
			}
		}
		
		// Doy el valor de la posición 0 a el valor menor y la 1 al valor mayor.
		mayorMenor[0] = menor; 
		mayorMenor[1] = mayor; 
		
		// Devuelvo de esta función la tabla que contiene el valor menor y mayor.
		return mayorMenor;
	} 

}
