package boletinfunciones;

import java.util.*;

public class Ejer4 {

	// Funcion que va a buscar el valor que queremos en la tabla para devolvernos el indice
	static int buscar(int[] tabla, int clave) {
		
		// Inicializo las dos variables que vamos a usar para hacer la busqueda
		int indice = 0;
		boolean encontrado = false;
		
		// While que va a realizar la busqueda donde mientras el indice sea menor que el maximo de la longitud
		// de la tabla y encontrado sea falso.
		while (indice < tabla.length && !encontrado) {
		
			// Comprobamos si en el dicho indice de la tabla se encuentra el valor que buscamos. 
			if (tabla[indice] == clave) {
				// Si es así le damos valor a encontrado con true para poder salir y dar el resultado al usuario.
				encontrado = true;
			// Si no lo ha encontrado en la vuelta, incrementamos el indice para seguir con el siguiente si procede.
			} else {
				++indice;
			}
		}
		
		// Si no lo ha encontrado le damos a indice el valor de -1 para luego informarselo al usuario.
		if (encontrado == false) {
			indice = -1;
		}
		
		// Devolvemos el valor de indice
		return indice;
	}
	
	public static void main(String[] args) {
		
		// Creo la tabla, la variable del valor clave y la del indice para recoger ahi lo que nos de la función.
		int[] tabla = {2,3,4,5,1,7,9};
		int clave = 0;
		int indice = 0;
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Informo al usuario y recojo el valor clave.
		System.out.println("Dame un valor que buscar en la tabla y te dire en que posición está "
				+ "si se encuentra en ella.");
		System.out.print("Valor a buscar: ");
		clave = sc.nextInt();
		
		// Le doy a indice el valor que me devuelve la función
		indice = buscar(tabla, clave);
		
		// If para imprimir un resultado u otro segun si lo ha encontrado o no.
		if (indice >= 0) {
			System.out.println("Se encuentra en la posición: " + indice);
		} else {
			System.err.println("No se encuentra en la tabla...");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}

}
