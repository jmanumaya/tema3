package boletinparajuegos;
import java.util.Random;

public class Ejer2 {

	// Función que desordenará una tabla unidimensional dada.
    public static void desordenar(int[] tabla) {
    	// Random que generará un indice aleatorio.
        Random rd = new Random();
        // Variable que usaré para guardar valores temporalmente.
        int temp;
        
        // Variable que alojará un índice aleatorio.
        int j;

        // Recorro la tabla desde el inicio.
        for (int i = 0; i < tabla.length; i++) {
        	
            // Genero un índice aleatorio entre 0 y la longitud total.
            j = rd.nextInt(tabla.length);

            // Intercambio tabla[i] con tabla[j].
            // Guardo en temp el valor de tabla[i]
            temp = tabla[i];
            
            // Guardo en tabla[i] el valor de tabla[j]
            tabla[i] = tabla[j];
            
            // Guardo en tabla[j] el valor de temp
            tabla[j] = temp;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de una tabla cualquiera.
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Imprimo la tabla original.
        System.out.println("Tabla original:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }

        // Llamo a la función para desordenar la tabla.
        desordenar(tabla);

        // Imprimo la tabla desordenada.
        System.out.println("\nTabla desordenada:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
    }
}

