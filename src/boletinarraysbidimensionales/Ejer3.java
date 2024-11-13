package boletinarraysbidimensionales;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		//Variable que va a almacenar las filas
		int x;
		
		//Variablre que va a almacenar las columnas.
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Crea una tabla, me tienes que dar las filas y columnas y el programa la rellenara sola");
		System.out.print("Dime cuantas filas quieres: ");
		x = sc.nextInt();
		System.out.println("Dime cuantas columnas quieres: ");
		y = sc.nextInt();
		
		int tablero[][] = new int[x][y];
		
		for (int i=0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = 10 * i + j;
			}
		}
		
		// Imprimo dichas notas o la tabla en sí.
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + "|");
			}
			System.out.println();
		}

	}

}
