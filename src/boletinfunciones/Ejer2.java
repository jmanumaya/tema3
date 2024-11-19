package boletinfunciones;

public class Ejer2 {

	public static void main(String[] args) {
		// Tabla default.
		int[] table = {1,6,7,1,1};
		
		// Devuelvo por consola el valor maximo obtenido con la función.
		System.out.println("Valor máximo de la tabla: " + maximo(table));
	}
	
	// Funcion que obtiene la tabla y es la encargada de realizar la busqueda del valor mayor.
	static int maximo (int table[]) {
		// Inicializo maximo a 0
		int maximo = 0;
		// For-each para recorrer cada posición e ir comparandola con el valor anterior mayor. 
		// Para asignarla o no.
		for (int value : table) {
			if (value > maximo) {
				maximo = value;
			}
		}
		// Devuelvo el valor de maximo
		return maximo;
	}
}
