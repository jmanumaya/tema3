package boletin2clasesarrays;

import java.util.Arrays;

public class Ejer7 {

	public static void main(String[] args) {
		
		int inicio = 0;
		int[] tabla = new int[55];
		
		for (int i = 1; i<=10; i++) {
			Arrays.fill(tabla, inicio, inicio+i, i);
			inicio += i;
		}
		
		System.out.println(Arrays.toString(tabla));

	}

}
