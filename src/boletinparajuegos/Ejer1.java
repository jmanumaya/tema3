package boletinparajuegos;

import java.util.Random;
import java.util.Scanner;

public class Ejer1 {
	
	public static int[][] generacion(int tabla[][]){
		
		Random rd = new Random();
		int table[][] = tabla;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rd.nextInt(1, 11);
			}
		}
			
		return table;
	}
	
	public static boolean busqueda(int tabla[][], int valor) {
		
		boolean respuesta = false;
		int i = 0;
		int j = 0;
		
		while (i < tabla.length && respuesta) {	
			while (j < tabla[i].length && respuesta) {
				if (tabla[i][j] == valor) {
					respuesta = true;
				}
				j++;
			}
			i++;
		}
		
		return respuesta;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[][];
		int filas = 0;
		int col = 0;
		int valor = 0;
		
		boolean respuesta;
		
		System.out.println("Filas: ");
		filas = sc.nextInt();
		
		System.out.println("Columnas: ");
		col = sc.nextInt();
		
		System.out.println("Valor a buscar: ");
		valor = sc.nextInt();

		tabla = new int [filas][col];
		
//		tabla = generacion(tabla);
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = i + 1;
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		respuesta = busqueda(tabla, valor);
		
		if (respuesta == true) {
			System.out.println("Se ha encontrado el valor: " + valor + " en la tabla");
		}else {
		System.out.println("No se ha encontrado el valor: " + valor + " en la tabla");
		}
	}

}
