package boletinfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer6 {
	
	
	static int[] suma(int valoresSuma, int[]tabla) {
		
		int valors[] = {};
		
		int longitudRepite = tabla.length - 1;
		
		for (int i = 0; i < longitudRepite; i++) {
			
			
		}
		
		
		
		
		return valors;
	}

	public static void main(String[] args) {
		
		int tabla[] = {1,2,3,4,5,6};
		int valoresSuma = 0;
		int[] tablaSumas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime de cuanto en cuanto quieres sumar los valores de la siguiente tabla.");
		System.out.println(Arrays.toString(tabla));
		System.out.print("Cada cuanto: ");
		valoresSuma = sc.nextInt();
		
		tablaSumas = suma(valoresSuma, tabla);
		
		System.out.println("Tabla con la suma de cada grupo de valores: ");
		

	}

}
