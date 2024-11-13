package boletinarraysbidimensionales;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el tablero.
		int tablero[][] = new int[3][6];
		
		// Añado los valores del tablero en cada posición
		tablero[0][0] = 0;
		tablero[0][1] = 30;
		tablero[0][2] = 2;
		tablero[0][5] = 5;
		tablero[1][0] = 75;
		tablero[1][4] = 0;
		tablero[2][2] = -2;
		tablero[2][3] = 9;
		tablero[2][5] = 11;
		
		// For para imprimir el tablero
		for (int i= 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero [i][j] + "|");
			}
			System.out.println();
		}
		
	}

}
