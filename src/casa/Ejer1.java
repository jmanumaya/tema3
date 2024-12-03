package casa;

import java.util.Scanner;

public class Ejer1 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// Ejecuta el juego
		ejecutarJuego();
	}
	
	
	// Funcion de ejecutar.
	private static void ejecutarJuego() {
		
		char tablero[][] = new char[10][10];
		
		char ficha = 'X';
		
		char agua = '~';
		
		char indice = 'A';
		
		char col;
		
		int fila;
		
		int cont = 0;
		
		boolean respuesta;
		
		String respUser = "";
		
		inicializarTablero(tablero, agua);
		
		do {
			
		imprimirTablero(tablero, indice);
		
		System.out.println("Dime una posicion para colocar una ficha");
		System.out.println("Fila: ");
		fila = sc.nextInt();
		--fila;
		System.out.println("Columna: ");
		col = sc.next().toUpperCase().charAt(0);
		
		respuesta = colocarFicha(tablero, ficha, fila, col, cont, agua);
		
		if (respuesta) {
			++cont;
		}
		
		sc.nextLine();
		System.out.println("¿Quieres parar de introducir fichas? (S --> Si; N --> No)");
		respUser = sc.nextLine().toUpperCase();
		
		} while (cont < 5 && respUser.equals("N"));
		
		System.err.println("Asi ha quedado tu tablero");
		imprimirTablero(tablero, indice);
		
		System.err.println("Fin del Juego");
	}

	// Funcion para colocar ficha
	private static boolean colocarFicha(char[][] tablero, char ficha, int fila, char col, int cont, char agua) {
		
		boolean respuesta = false;
		int nuevaCol = col - 65;
		
		if(fila < tablero.length && nuevaCol < tablero.length) {
			if (tablero[fila][nuevaCol] == agua) {
				tablero[fila][nuevaCol] = ficha;
				respuesta = true;
			} else {
				System.err.println("Ya hay una ficha ocupando esta coordenada.");
			}
		} else {
			System.err.println("Coordenadas fuera de limite");
		}
		
		return respuesta;
	}

	// Funcion para imprimir el tablero
	private static void imprimirTablero(char[][] tablero, char indice) {
		
		for (int i =0; i< tablero.length;i++) {
			System.out.print("\t" + indice);
			++indice;
		}
		
		System.out.println();
		
		for (int i = 0; i < tablero.length; i++) {
			System.out.print((i+1) + "\t");
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
	// Funcion para inicializar el tablero
	private static void inicializarTablero(char[][] tablero, char agua) {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = agua;
			}
		}

	}

}
