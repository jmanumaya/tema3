package parte1;

import java.util.Random;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Variable que va a contener una tabla de logitud 10 con números aleatorios.
		int numbers[] = new int[10];
		
		// Creo random para poder generar números aleatorios.
		Random random = new Random();
		
		// Variable que va a tener cada número random generado.
		int num;
		
		// Indico por pantalla lo que se va a mostrar.
		System.out.println("Tabla con números randoms");

		// for para ir pasando por todas las posiciones e ir asignando numeros aleatorios a cada una.
		for (int i = 0; i < numbers.length; i++) {
			
			num = random.nextInt(1, 101);
			numbers[i] = num;
			
			// Muestro cada número de cada posición.
			System.out.print(numbers[i] + " ");
			
		}

	}

}
