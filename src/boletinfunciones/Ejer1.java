package boletinfunciones;

public class Ejer1 {

	public static void main(String[] args) {
		
		//Creo la tabla para hacer la prueba de que la función funcione.
		int tabla[] = {1,2,3,4};
		
		// Imprimo el valor que me va a devolver la funcion.
		System.out.println(sumaTablas(tabla));
	}
	
	// Apartado de la función. donde le doy el valor de entrada tipo int como tabla.
	static int sumaTablas(int tabla[]) {
		
		// Inicializo la variable suma para ir incrementandola con los valores de la tabla.
		int suma = 0;
		
		// For-each para ir incrementando ese valor de suma con los valores de la tabla dada.
		for (int value : tabla) {
			suma += value;
		}
		
		// Devuelvo el valor de suma.
		return suma;
	}

}
