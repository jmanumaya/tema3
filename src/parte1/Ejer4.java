package parte1;

public class Ejer4 {

	public static void main(String[] args) {

		// Creo el array.
		int num[] = new int[12];

		// Asigno valores a posiciones concretas.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// MUestro los valores con un for-each
		for (int value : num) {
			System.out.print(value + " ");
		}
		
		// Los valores que no han sido inicializados se asignan a 0 por defecto.
	}

}
