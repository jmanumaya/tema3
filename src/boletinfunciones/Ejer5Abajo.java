package boletinfunciones;

import java.util.Scanner;

public class Ejer5Abajo {

    // Función que gira la matriz 90 grados.
    public static int[][] girar90(int tablaInicio[][]) {
    	// Tamaño de la matriz.
        int n = tablaInicio.length; 
        int[][] resultado = new int[n][n];

        // Rotar la matriz
        // Recorro las filas de la matriz original
        for (int i = 0; i < n; i++) { 
        	// Recorro las columnas de la matriz original
            for (int j = 0; j < n; j++) { 
            	// Rotación de 90 grados
                resultado[j][n - 1 - i] = tablaInicio[i][j]; 
            }
        }
        // Devuelvo la matriz rotada.
        return resultado; 
    }

    public static void main(String[] args) {
    	// Creo el escaner.
        Scanner scanner = new Scanner(System.in);

        // Pido al usuario el tamaño de la matriz.
        System.out.print("Introduce el tamaño de la matriz NxN (N): ");
        int n = scanner.nextInt();

        // Creo la matriz
        int[][] tabla = new int[n][n];

        // Rellenamos la matriz con los datos del usuario.
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                tabla[i][j] = scanner.nextInt();
            }
        }

        // Mostramos la matriz original.
        System.out.println("\nMatriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }

        // Llamamos a la función para girar la matriz.
        int[][] respuesta = girar90(tabla);

        // Mostramos la matriz rotada.
        System.out.println("\nMatriz rotada 90 grados:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(respuesta[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Cierro uso de escáner.
        scanner.close(); 
    }
}

