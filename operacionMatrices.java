package tareaMatrices;

public class operacionMatrices {
	
	int[][]matriz1;
	int[][]matriz2;
	
	public operacionMatrices(int[][] matriz1, int[][] matriz2) {

	   }
	
	public int[][] multiplicaMatrices(int[][] matriz1, int[][] matriz2) {
	    int fil1 = matriz1.length;
	    int col1 = matriz1[0].length;
	    int fil2 = matriz2.length;
	    int col2 = matriz2[0].length;

	    if (col1 != fil2) {
	        System.out.println("Matrices are not compatible for multiplication");
	    }

	    int[][] result = new int[fil1][col2];

	    for (int i = 0; i < fil1; i++) {
	        for (int j = 0; j < col2; j++) {
	            for (int k = 0; k < col1; k++) {
	                result[i][j] += matriz1[i][k] * matriz2[k][j];
	            }
	        }
	    }

	    return result;
	}

	public int[][] transponerMatriz(int[][] matriz) {
	    int fil = matriz.length;
	    int col = matriz[0].length;

	    int[][] transponer = new int[col][fil];

	    for (int i = 0; i < fil; i++) {
	        for (int j = 0; j < col; j++) {
	            transponer[j][i] = matriz[i][j];
	        }
	    }

	    return transponer;
	}

	public int sumaDiagonal(int[][] matriz) {
	    
		int suma = 0;

	    for (int i = 0; i < matriz.length; i++) {
	        suma += matriz[i][i];
	    }

	    return suma;
	}

	public int encontrarValorMasGrande(int[][] matriz) {
	    int valorM = Integer.MIN_VALUE;

	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[0].length; j++) {
	            if (matriz[i][j] > valorM) {
	            	valorM = matriz[i][j];
	            }
	        }
	    }

	    return valorM;
	}

	public int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
	    int fil = matriz1.length;
	    int col = matriz1[0].length;

	    int[][] sum = new int[fil][col];

	    for (int i = 0; i < fil; i++) {
	        for (int j = 0; j < col; j++) {
	            sum[i][j] = matriz1[i][j] + matriz2[i][j];
	        }
	    }

	    return sum;
	}

	public int[][] multiplicacionMatrizEscalar(int[][] matriz, int escalar) {
	    int fil = matriz.length;
	    int col = matriz[0].length;


	    int[][] result = new int[fil][col];

	    
	    for (int i = 0; i < fil; i++) {
	        for (int j = 0; j < col; j++) {
	            result[i][j] = matriz[i][j] * escalar;
	        }
	    }

	    return result;
	}

	public void imprimirMatriz(int[][] matriz) {
		
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[0].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
