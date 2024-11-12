package boletin2clasesarrays;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int ganadora[] = {12, 23, 29, 30, 45, 47};
		int tusNumeros[] = new int[6];
		int cont = 0;
		int num = 0;
		int busqueda;
		int contAciertos = 0;
		
		while (cont < 6) {
			num = random.nextInt(1, 50);
			Arrays.sort(tusNumeros);
			busqueda = Arrays.binarySearch(tusNumeros, num);
			if (busqueda < 0) {
				tusNumeros[0] = num;
				cont++;
			}
		}
		System.out.println("Apuesta ganadora: " + Arrays.toString(ganadora));
		System.out.println("Tus números generados: " + Arrays.toString(tusNumeros));
		
		for(int value : ganadora) {
			busqueda = Arrays.binarySearch(ganadora, value);
			if (busqueda>=0) {
				contAciertos++;
			}
		}
		
		System.out.println("Número de aciertos: " + contAciertos);

	}

}
