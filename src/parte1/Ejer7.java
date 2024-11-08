package parte1;

import java.util.*;

public class Ejer7 {
	public static void main(String[] args) {

		// Creo el escaner.
		Scanner sc = new Scanner(System.in);

		// Tabla que contendrá las temperaturas indicadas.
		int numbers[] = new int[12];

		// Le digo que tiene que hacer el usuario y que hará el programa.
		System.out.println("Dame la temperatura media de cada mes y te mostraré un gráfico.");

		// For para recorrer cada posición de la tabla e ir poniendole cada dato que introduzca el user.
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print("Temperatura del mes " + (i + 1) + ": ");
			numbers[i] = sc.nextInt();
		}
		
		// For-each para recorrer cada posición recogiendo su valor
		for (int value : numbers) {
			// For para usar ese valor recogido donde voy a imprimir tantos asteriscos valga el valor.
			for (int i = 0; i < value; i++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		// Ciero uso de escaner.
		sc.close();
	}
}