package boletinfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	
	// función para saber de que tamaño será la tabla que contendrá la respuesta
	static int tamaño (int[] tabla, int clave) {
		
		// Contador para contar cuantas veces se encuenta el valor clave.
		int cont = 0;
		
		// For para pasar por cada posición y saber si incrementar el contador o no si lo encuentra.
		for (int valor : tabla) {
			if (valor == clave) {
				++cont;
			}
		}
		// devuelvo el valor del contador que será mi nueva longitud de la tabla respuesta.
		return cont;
	} 
	

	// Funcion que va a buscar el valor que queremos en la tabla para devolvernos los indices 
	// donde se encuentra en una tabla nueva donde estará vacía si no lo encuentra.
	static int[] buscarTodos(int[] tabla, int clave, int longitud) {
		
		// tabla que vamos a obtener como respuesta con longitud la longitud calculada en la función 'tamaño'
		int tablaRespuesta[] = new int[longitud];
		// Posición para actuar como i en un for pero para que no se pase con mi nueva tabla.
		int posicion = 0;
		
		// For para buscar el valor clave y que me vaya almacenando el indice en la nueva tabla si lo encuentra
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == clave) {
				tablaRespuesta[posicion] = i;
				++posicion;
			}
		}
		
		// Devolvemos el valor de tablaRespuesta
		return tablaRespuesta;
	}
	
	public static void main(String[] args) {
		
		// Creo la tabla, la variable del valor clave, la del indice para recoger ahi lo que nos de la función
		// y tambien la de longitud para luego almacenar lo que nos de la función 'tamaño'.
		int[] tabla = {2,3,4,2,3,7};
		int clave = 0;
		int indice[];
		int longitud;
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Informo al usuario y recojo el valor clave.
		System.out.println("Dame un valor que buscar en la tabla y te dire en que posiciones está "
				+ "si se encuentra en ella en una tabla totalmente nueva.");
		System.out.print("Valor a buscar: ");
		clave = sc.nextInt();
		
		// Almaceno lo que me da la función tamaño en mi variable longitud para luego darsela a la función que
		// buscará el valor clave.
		longitud = tamaño(tabla, clave);
		
		// Le doy a indice el valor que me devuelve la función buscarTodos (una tabla con los indices o vacía).
		indice = buscarTodos(tabla, clave, longitud);
		
		// Imprimo el resultado
		System.out.println(Arrays.toString(indice));
		
		// Cierro uso de escaner.
		sc.close();
	}
}
