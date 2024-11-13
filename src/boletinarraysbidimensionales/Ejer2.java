package boletinarraysbidimensionales;

import java.util.*;

public class Ejer2 {
	
	public static void main(String[] args) {
		
		// Creo la tabla que almacenará cada nota
		double notas[][] = new double [4][5];
		
		// Creo el escaner para poder usarlo
		Scanner sc = new Scanner(System.in);
		
		// Inicializo estas variables para poder usarlas luego para la media.
		double suma = 0.0;
		double media = 0.0;
		
		// Primer for para introducir las notas de cada alumno (cada alumno es una fila y cada asignatura una columna)
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + (i + 1) + " introduce tus notas.");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.println("Nota " + (j + 1) + ":");
				notas[i][j] = sc.nextDouble();
			}
		}
		
		// Imprimo dichas notas o la tabla en sí.
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Alumno " + (i + 1) + ":\t");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print(notas[i][j] + "|");
			}
			System.out.println();
		}
		
		// Ordeno la tabla para obtener luego la máxima (última) y la mínima (primera).
		Arrays.sort(notas[0]);
		Arrays.sort(notas[1]);
		Arrays.sort(notas[2]);
		Arrays.sort(notas[3]);
		
		System.out.println();
		
		// Imprimo la nota mínima, máxima y la nota media.
		for (int i = 0; i < notas.length;i++) {
			System.out.println("La nota mínima del Alumno " + (i + 1) +": " + notas[i][0]);
			System.out.println("La nota máxima del Alumno " + (i + 1) +": " + notas[i][notas[i].length - 1]);
				
				// for para imprimir la nota media.
		        for (int j = 0; j < notas[i].length; j++) {
		        	// Sumo cada nota de cada fila empezando en 0 como la i del for del principio.
		            suma += notas[i][j];
		        }
		    // Una vez obtenido la suma, hago la media dividiendo dicha suma entre el largo de cada fila [i]
		    media = suma / notas[i].length;
		    // Imprimo la nota media una vez calculada.
		    System.out.println("La media del Alumno " + (i + 1) +": " + media+"\n");
		    // Reseteo dichos valores para la siguiente.
		    suma = 0;
		    media = 0;
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
