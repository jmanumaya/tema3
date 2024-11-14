package boletinarraysbidimensionales;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		//Variable que va a almacenar las filas
		int x;
		
		//Variablre que va a almacenar las columnas.
		int y;
		
		//Creo el escaner para poder usarlo
		Scanner sc = new Scanner(System.in);
		
		// Creo el tablero.
		int[][] tablero;
		
		//Indico al usuario que debe hace y que hará el programa.
		System.out.println("Crea una tabla, me tienes que dar las filas y columnas y el programa la rellenara sola");
		
		//Pido al usuario el número de las filas y columnas
		System.out.print("Dime cuantas filas quieres: ");
		x = sc.nextInt();
		System.out.println("Dime cuantas columnas quieres: ");
		y = sc.nextInt();
		
		// Asigno los valores al tablero.
		tablero = new int[x][y];
		
		// For para ir recorriendo cada posición, ir asignando su correspondiente valor e ir imprimiendo.
		for (int i=0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = 10 * i + j;
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
		// Aquí había hecho otro for para imprimir pero he visto que era igual que este anterior asi que lo he aprobechado 
		//para a la vez que se asigna, se muestre.
		
		// Cierro uso de escaner.
		sc.close();
	}
}
