package boletinarraysbidimensionales;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo la tabla.
		int tabla[][] = new int [11][11];
		
		// Indico al usuario que va a hacer el programa.
		System.out.println("Aquí tienes la tabla de multiplicar.");
		
		// Inicio los for que van a recorrer i y j.
		for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
            	// Si i es igual a 0 relleno la primera fila de encabezados.
                if (i == 0) {
                    tabla[i][j] = j;
                // Si i j es igual a 0 relleno la primera columna de encabezados.
                } else if (j == 0) {
                    tabla[i][j] = i;
                // Si no es ninguno de lo anterior relleno la tabla con las respectivas multiplicaciones.
                } else {
                    tabla[i][j] = i * j;
                }
                // Imprimo el valor de cada posición despues de asignar para ahorrarme otro for.
                System.out.print(tabla[i][j] + "\t");
            }
            // Salto de linea en consola.
            System.out.println();
        }
		
		// Eso que he hecho es lo mismo que si lo hago así que creo que es como lo pide el ejercicio 
		// pero arriba lo he querido hacer mejor a la hora de imprimirla nose...
		
		/*
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
        */
		
	}
}
