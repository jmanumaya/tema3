package boletinfunciones;

import java.util.Arrays;

public class Ejer4Abajo {
	
	// LO QUIERE CON WHILE, QUIERE QUE SEA UNA TABLA GENERICA ES DECIR QUE SEA DE CUALQUIER LONGITUD
	// IDEA: HACER LA SUMA DE LA PRIMERA FILA Y LUEGO IR COMPARANDO PARA SI DA DISTINTO SALIR Y DECIR
	// DIRECTAMENTE QUE NO ES MAGICA

	public static boolean esMagica1(int tabla[][]) {
		boolean respuesta = true;

		int sumario1 = 0;
		int sumario2 = 0;
		int sumario3 = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				if (i == 0)
					sumario1 += tabla[i][j];
				else if (i == 1)
					sumario2 += tabla[i][j];
				else
					sumario3 += tabla[i][j];
			}
		}

		if (sumario1 != sumario2 || sumario1 != sumario3 || sumario2 != sumario3)
			respuesta = false;

		return respuesta;
	}

	public static boolean esMagica2(int tabla[][]) {
		boolean respuesta = true;

		int sumario1 = 0;
		int sumario2 = 0;
		int sumario3 = 0;

		for (int j = 0; j < tabla[0].length; j++) {
			for (int i = 0; i < tabla.length; i++) {

				if (j == 0)
					sumario1 += tabla[i][j];
				else if (j == 1)
					sumario2 += tabla[i][j];
				else
					sumario3 += tabla[i][j];
			}
		}

		if (sumario1 != sumario2 && sumario1 != sumario3 && sumario2 != sumario3)
			respuesta = false;

		return respuesta;
	}

	public static void main(String[] args) {

		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		boolean respuesta1;
		boolean respuesta2;

		respuesta1 = esMagica1(tabla);
		respuesta2 = esMagica2(tabla);

		if (respuesta1 == respuesta2) {
			System.out.println("La tabla:\n" + Arrays.deepToString(tabla) + "\nEs mágica.");
		} else {
			System.out.println("La tabla:\n" + Arrays.deepToString(tabla) + "\nNo es mágica.");
		}
	}

}
