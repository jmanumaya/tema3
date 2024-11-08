package parte1;
import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		
		//Tabla que va a contener 100 posiciones donde estaran números aleatorios en cada una.
		int numeros[] = new int[100];

		// Creo el generador.
		Random random = new Random();
		
		//Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);
		
		// Valor de entrada del usuario.
		int num;
		
		// Valor de entrada del usuario.
		int indice;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1, 11);
		}
		
		System.out.println("dime un número y te diré en que posiciones se "
				+ "encuentra en una tabla con valores aleatorios de 1 a 10.");
		num = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				
			}
		}
		
	}
}
