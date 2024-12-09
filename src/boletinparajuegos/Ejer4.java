package boletinparajuegos;

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {
        
        // Creo el escaner
        Scanner sc = new Scanner(System.in);
        
        // Creo el tablero como char.
        char tablero[][];
        
        // Declaro variables para la fila y la columna de la posición de la pieza.
        int fila;
        int col;
        
        // variable para identificar la pieza ingresada por el usuario.
        char pieza;
        
        // Doy la bienvenida y explico que hará el programa
        System.out.println("Bienvenido al asistente de movimientos de ajedrez.");
        System.out.println("Indica una pieza y su posición para conocer sus posibles movimientos.");
        
        // Solicito al usuario que indique qué pieza quiere consultar
        System.out.println("¿Qué pieza quieres consultar? (C -> Caballo, A -> Alfil, T -> Torre, D -> Dama)");
        System.out.print("Pieza: ");
        pieza = sc.next().toUpperCase().charAt(0);
        
        // Solicito la fila en la que está posicionada la pieza.
        System.out.println("Ahora dime en qué fila está: (1 al 8)");
        System.out.print("Fila: ");
        fila = sc.nextInt();
        // Resto uno ya que realmente va de 0 a 7 (si indica 1 realmente es 0)
        --fila;
        
        // Solicito la columna en la que está posicionada la pieza.
        System.out.println("Ahora dime en qué columna está: (1 al 8)");
        System.out.print("Columna: ");
        col = sc.nextInt();
        // Resto uno ya que realmente va de 0 a 7 (si indica 1 realmente es 0)
        --col;
        
        // Según la pieza indicada, llamo a la función correspondiente.
        if (pieza == 'C') {
            // Si la pieza es un Caballo, llamo a la función movCab
            tablero = movCab(fila, col, pieza);
        } else if (pieza == 'A') {
            // Si la pieza es un Alfil, llamo a la función movAlf
            tablero = movAlf(fila, col, pieza);
        } else if (pieza == 'T') {
            // Si la pieza es una Torre, llamo a la función movTor
            tablero = movTor(fila, col, pieza);
        } else {
            // Si la pieza es una Dama, llamo a la función movDam
            tablero = movDam(fila, col, pieza);
        }
        
        // Imprimo el tablero con los posibles movimientos
        System.out.println("Posibles movimientos:");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
        // Cierro el escáner
        sc.close();
    }

    // Función para calcular los movimientos del Caballo
    private static char[][] movCab(int fila, int col, char pieza) {
        // Creo el tablero y lo inicializo con '-'
        char tablero[][] = new char[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        
        // Marco la posición inicial de la pieza en el tablero
        tablero[fila][col] = pieza;
        
        // Defino los posibles movimientos del Caballo.
        int[] movFilas = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] movColumnas = {1, 2, 2, 1, -1, -2, -2, -1};
        
        // Recorro todos los posibles movimientos
        for (int i = 0; i < movFilas.length; i++) {
            int nuevaFila = fila + movFilas[i];
            int nuevaCol = col + movColumnas[i];
            
            // Verifico que el movimiento esté dentro de los límites del tablero
            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaCol >= 0 && nuevaCol < 8) {
                // Marco la casilla válida con una 'X'
                tablero[nuevaFila][nuevaCol] = 'X';
            }
        }
        
        // Devuelvo tablero
        return tablero;
    }

    // Función para calcular los movimientos del Alfil
    private static char[][] movAlf(int fila, int col, char pieza) {
        // Creo el tablero y lo inicializo con '-'
        char tablero[][] = new char[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        
        // Marco la posición inicial de la pieza en el tablero
        tablero[fila][col] = pieza;
        
        // Recorro todas las diagonales posibles
        for (int i = 1; i < 8; i++) {
            if (fila + i < 8 && col + i < 8) tablero[fila + i][col + i] = 'X'; // Diagonal abajo-derecha
            if (fila + i < 8 && col - i >= 0) tablero[fila + i][col - i] = 'X'; // Diagonal abajo-izquierda
            if (fila - i >= 0 && col + i < 8) tablero[fila - i][col + i] = 'X'; // Diagonal arriba-derecha
            if (fila - i >= 0 && col - i >= 0) tablero[fila - i][col - i] = 'X'; // Diagonal arriba-izquierda
        }
        
        // Devuelvo tablero
        return tablero;
    }

    // Función para calcular los movimientos de la Torre
    private static char[][] movTor(int fila, int col, char pieza) {
        // Creo el tablero y lo inicializo con '-'
        char tablero[][] = new char[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        
        // Marco la posición inicial de la pieza en el tablero
        tablero[fila][col] = pieza;
        
        // Marco los movimientos verticales y horizontales
        for (int i = 0; i < 8; i++) {
            if (i != fila) tablero[i][col] = 'X'; // Vertical
            if (i != col) tablero[fila][i] = 'X'; // Horizontal
        }
        
        // Devuelvo tablero.
        return tablero;
    }

    // Función para calcular los movimientos de la Dama
    private static char[][] movDam(int fila, int col, char pieza) {
        // Creo el tablero y lo inicializo con '-'
        char tablero[][] = new char[8][8];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        
        // Marco la posición inicial de la pieza en el tablero
        tablero[fila][col] = pieza;
        
        // Combino los movimientos de la Torre y el Alfil
        for (int i = 0; i < 8; i++) {
            if (i != fila) tablero[i][col] = 'X'; // Vertical
            if (i != col) tablero[fila][i] = 'X'; // Horizontal
        }
     // Recorro todas las diagonales posibles en el tablero
        for (int i = 1; i < 8; i++) {
            // Compruebo si puedo moverme hacia la diagonal abajo-derecha
            if (fila + i < 8 && col + i < 8) 
                // Marco la casilla como válida ('X') si está dentro del tablero
                tablero[fila + i][col + i] = 'X';
            
            // Compruebo si puedo moverme hacia la diagonal abajo-izquierda
            if (fila + i < 8 && col - i >= 0) 
                // Marco la casilla como válida ('X') si está dentro del tablero
                tablero[fila + i][col - i] = 'X';
            
            // Compruebo si puedo moverme hacia la diagonal arriba-derecha
            if (fila - i >= 0 && col + i < 8) 
                // Marco la casilla como válida ('X') si está dentro del tablero
                tablero[fila - i][col + i] = 'X';
            
            // Compruebo si puedo moverme hacia la diagonal arriba-izquierda
            if (fila - i >= 0 && col - i >= 0) 
                // Marco la casilla como válida ('X') si está dentro del tablero
                tablero[fila - i][col - i] = 'X';
        }

        
        // Devuelvo tablero
        return tablero;
    }
}
