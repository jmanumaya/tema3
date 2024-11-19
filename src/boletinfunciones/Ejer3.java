package boletinfunciones;
import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Variable que contendrá la longitud dada y el fin dado.
		int longitud = 0;
		int fin = 0;
		
		// Creo el escaner.
		Scanner sc = new Scanner(System.in);
		
		// Pregunto por los dos valores.
		System.out.println("Dame una longitud:" );
		longitud = sc.nextInt();
		System.out.println("Dame un fin:" );
		fin = sc.nextInt();
		
		// Imprimo la tabla llamando a la función dandole los valores que requiere saber.
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		// Cierro uso de escaner.
		sc.close();
	}
	
	// Función que realizará el relleno de la tabla con esos valores pares y longitud dada por el user.
	static int[] rellenaPares(int longitud, int fin) {
		
		// Creo la tabla con dicha longitud dada.
		int valor[] = new int[longitud];
		// Creo el random.
		Random rd = new Random();
		
		// For para recorrer cada posición de la tabla e ir asignando los valores. 
		for (int i = 0; i < valor.length; i++) {
			
			// Doy valor a par con un número aleatorio entre 2 y el fin que da el usuario.
			int  par = rd.nextInt(2, fin + 1);
			
			// Compruebo si se ha generado un número aleatorio y lo asigno, 
			// si no es el caso asigno el número menos 1 para asegurar el par.
			if (par % 2 == 0) {
				valor[i] = par;
			} else {
				valor[i] = par - 1;
			}
		}
		
		// Devuelvo la tabla.
		return valor;
	}

}
