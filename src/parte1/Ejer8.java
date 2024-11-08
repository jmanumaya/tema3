package parte1;
import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		
		//Tabla que va a contener 100 posiciones donde estaran números aleatorios en cada una.
		int numeros[] = new int[100];

		// Creo el generador de números aleatorios.
		Random random = new Random();
		
		//Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);
		
		// Valor de entrada del usuario.
		int num;
		
		// Valor de la posición donde se encuentra el número buscado.
		int indice = -1;
		
		// Genero todos los números que contiene el array.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1, 11);
		}
		
		// Le digo al usuario que tiene que hacer y que hará el programa.
		System.out.println("dime un número y te diré en que posiciones se "
				+ "encuentra en una tabla con valores aleatorios de 1 a 10.");
		// Recojo el dato que se le pide
		num = sc.nextInt();
		
		// Construyo la salida por pantalla para que se le mueste luego el resultado que se busca.
		System.out.println("El número " + num + " se encuentra en las posiciones:");
		
		// For para recorrer cada posición e ir comparando cada valor con el que buscamos para guardar dicha posición en la que se encuentre.
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				indice = i;
				System.out.print(indice + ", ");
			}
		}
		
		// Esto es un comprobante para verificar que nos dá las posiciones que buscamos.
		System.out.println("\n\nTabla con todos los números: ");
		
		for (int value : numeros) {
			System.out.print(value + " ");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}
}
