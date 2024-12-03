package boletinparajuegos;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// tablero
		char tablero[][];
		
		// Variable pos fila.
		int fila;
		
		// Variable pos col.
		int col;
		
		// Variable pieza.
		char pieza;
		
		// Doy la bienvenida.
		System.out.println("Buenas, soy un asistente de movimientos de ajedrez.\nIndicame una pieza y donde está hubicada y te diré"
				+ " sus posibles movimientos.");
		
		// Pido la pieza.
		System.out.println("¿Que pieza quieres consultar? (Pon: C -> Caballo; A -> Alfil; T -> Torre; D -> Dama)");
		System.out.print("Pieza: ");
		pieza = sc.next().toUpperCase().charAt(0);
		
		// Pido la fila
		System.out.println("Ahora dime en que fila está: (1 al 8)");
		System.out.println("Fila: ");
		fila = sc.nextInt();
		--fila;
		
		// Pido la columna
		System.out.println("Ahora dime en que columna está: (1 al 8)");
		System.out.println("Columna: ");
		col = sc.nextInt();
		--col;
		
		// Llamo a la función que corresponda segun la pieza indicada.
		if (pieza == 'C') {
			tablero = movCab(fila, col, pieza);
		} else if (pieza == 'A') {
			tablero = movAlf(fila, col, pieza);
		} else if (pieza == 'T') {
			tablero = movTor(fila, col, pieza);
		} else {
			tablero = movDam(fila, col, pieza);
		}
		
		// Imprimo los posibles movimientos despues de haberlos optenido con la función indicada.
		System.out.println("Posibles movimientos:\n");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		
		// Cierro uso de escaner.
		sc.close();
	}

	// Función para el movimiento de la dama
	private static char[][] movDam(int fila, int col, char pieza) {
		
		char tablero[][] = new char[8][8];
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = '-';
			}
		}
		
		tablero[fila][col] = pieza;
		
		return tablero;
	}

	// Función para el movimiento de la torre
	private static char[][] movTor(int fila, int col, char pieza) {
			
			char tablero[][] = new char[8][8];
			
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero.length; j++) {
					tablero[i][j] = '-';
				}
			}
			
			tablero[fila][col] = pieza;
			
			return tablero;
		}

	// Función para el movimiento del Alfil
	private static char[][] movAlf(int fila, int col, char pieza) {
		
		char tablero[][] = new char[8][8];
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = '-';
			}
		}
		
		tablero[fila][col] = pieza;
		
		return tablero;
	}

	// Función para el movimiento del Caballo
	private static char[][] movCab(int fila, int col, char pieza) {
		
		char tablero[][] = new char[8][8];
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = '-';
			}
		}
		
		tablero[fila][col] = pieza;
		
		for (int i = fila; i > 0; i--) {
			for (int j = col; j > 0; j--) {
				tablero[i][--j] = 'X';
			}
		}
		
		return tablero;
	}

}
