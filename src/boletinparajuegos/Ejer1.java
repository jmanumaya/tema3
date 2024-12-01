package boletinparajuegos;

import java.util.*;
import java.util.Scanner;

public class Ejer1 {
	
    // Función que genera una tabla con valores aleatorios entre los valores mínimo y máximo dados.
    public static int[][] gen(int[][] tabla, int min, int max) {
        
        Random rd = new Random();

        // Recorro cada celda de la tabla para asignarle un valor aleatorio en el rango especificado.
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = rd.nextInt(min, max + 1); // Genero números entre 'min' y 'max' (inclusive).
            }
        }

        // Devuelvo la tabla generada.
        return tabla;
    }
    
    // Función que busca un valor específico dentro de la tabla bidimensional.
    public static boolean busqueda(int[][] tabla, int valor) {
        
        // Variable que indica si se encontró el valor.
        boolean respuesta = false;
        int i = 0; // Índice para las filas.
        int j = 0; // Índice para las columnas.

        // Recorro la tabla mientras no haya encontrado el valor.
        while (i < tabla.length && !respuesta) {
            while (j < tabla[i].length && !respuesta) {
                // Si el valor actual es igual al buscado, actualizo la respuesta a true.
                if (tabla[i][j] == valor) {
                    respuesta = true;
                } else {
                    ++j; // Avanzo en la misma fila.
                }
            }
            ++i; // Cambio a la siguiente fila.
            j = 0; // Reseteo el índice de las columnas.
        }

        // Devuelvo si el valor fue encontrado o no.
        return respuesta;

        /* Alternativa más directa usando bucles 'for'
           Esto lo veo mas directo pero como no se si lo quieres pues te lo he hecho como lo has explicado siempre.
           
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == valor) {
                    return true; // Salgo inmediatamente al encontrar el valor.
                }
            }
        }
        return false; // Si no se encuentra, devuelvo false.
        */
        
    }

    // Método principal donde se ejecuta el programa.
    public static void main(String[] args) {

        // Creo el escaner.
        Scanner sc = new Scanner(System.in);
        
        // Variables que almacenarán la tabla y los datos ingresados.
        int tabla[][];
        // Tamaño de la tabla (NxN).
        int n = 0;
        // Valor a buscar.
        int valor = 0; 
        // Valor mínimo para generar los números aleatorios.
        int min = 0; 
        // Valor máximo para generar los números aleatorios.
        int max = 0;
        // Resultado de la búsqueda.
        boolean respuesta; 

        // Solicito al usuario el tamaño de la tabla.
        System.out.print("Dime la longitud (n) de una tabla NxN: ");
        n = sc.nextInt();

        // Inicializo la tabla con las dimensiones especificadas por el usuario.
        tabla = new int[n][n];

        // Solicito al usuario el rango de valores para los números aleatorios.
        System.out.println("Desde qué número quieres generar los valores?");
        System.out.print("Número: ");
        min = sc.nextInt();

        System.out.println("Hasta qué número quieres generar los valores?");
        System.out.print("Número: ");
        max = sc.nextInt();

        // Genero la tabla con valores aleatorios en el rango indicado.
        tabla = gen(tabla, min, max);

        // Solicito al usuario un número para buscar en la tabla.
        System.out.println("He generado la tabla de longitud dada con números aleatorios entre " + min + " y " + max 
                + ". Indícame un número a buscar en la tabla y te diré si se encuentra.");
        
        do {
            System.out.print("Número: ");
            valor = sc.nextInt();

            // Si el número está fuera del rango, muestro un mensaje de error.
            if (valor < min || valor > max) {
                System.err.println("Recuerda, la tabla ha sido generada con números del " + min + " al " + max);
            }
        // Repito hasta que el valor esté dentro del rango.
        } while (valor < min || valor > max);

        // Busco el valor en la tabla llamando a la función que lo hace y le paso los datos necesarios para ello.
        respuesta = busqueda(tabla, valor);

        // Muestro si el valor fue encontrado o no.
        if (respuesta == true) {
            System.out.println("El valor " + valor + " se encuentra en la tabla.");
        } else {
            System.out.println("El valor " + valor + " no se encuentra en la tabla.");
        }

        // Imprimo la tabla generada.
        System.out.println("\nTabla:");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }

        // Cierro uso de escaner.
        sc.close();
    }
}
