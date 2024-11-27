package boletinfunciones;

public class Ejer5Abajo {
	
	public static int[][] gira90(int tablaInicio[][]){
		int tabla[][] = new int[4][4];
		int aux = 0;
		int i = 4;
		int j = 4;
		

		for (int x = 0; x < tabla.length; x++) {			
			for (int z = 0; z < tabla[x].length; z++) {		
				aux = tabla[i][j];
				tabla[i][j] = tabla[x][j];		
				j--;
			}		
			--i;
		}	
		
		return tabla;
	}

	public static void main(String[] args) {
	
		int tabla[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int respuesta[][] = gira90(tabla);
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println(respuesta[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
