package boletinarraysbidimensionales;

import java.util.Random;

public class Ejer5 {

	public static void main(String[] args) {
		
		int tabla[][]= new int[4][5];
		
		Random random = new Random();
		
		int suma = 0;
		int suma1 = 0;
		int sumaTotal = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = random.nextInt(100, 1000);
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
				suma += tabla[i][j];
			}
			System.out.println(suma);
			suma = 0;
			System.out.println();
		}
		
		for (int j = 0; j < tabla[0].length; j++) {
			suma1 = 0;
			for (int i = 0; i < tabla.length; i++) {
				suma1 += tabla[i][j];
			}
			sumaTotal += suma1;
			System.out.print(suma1 + "\t");
		}
		
		System.out.println(sumaTotal);
			

	}

}
