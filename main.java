package tareaMatrices;

public class main {
	
	public static void main(String[]args) {

	int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 },{ 7, 8, 9 } };
	int[][] matriz2 = { { 10, 11, 12 }, { 13, 14, 15 },{ 16, 17, 18 } };
	int escalar = 5;
	
	operacionMatrices matrizResult = new operacionMatrices(matriz1, matriz2);
	
	int[][] result = matrizResult.multiplicaMatrices(matriz1, matriz2);
	
	matrizResult.imprimirMatriz(result);
	System.out.println();
	
	int[][] transpuesta = matrizResult.transponerMatriz(matriz1);
	
	matrizResult.imprimirMatriz(transpuesta);
	System.out.println();
	
	int sumaDiagonal = matrizResult.sumaDiagonal(matriz1);
	
	System.out.println("La suma de la diagonal de la matriz es:  " + sumaDiagonal);
	System.out.println();
	
	int valorMasGrande = matrizResult.encontrarValorMasGrande(matriz1);

	System.out.println("El valor más grande en la matriz es: " + valorMasGrande);
	System.out.println();
	
	int[][] suma = matrizResult.sumaMatrices(matriz1, matriz2);

	matrizResult.imprimirMatriz(suma);
	System.out.println();
	
	int[][] multiplicacionEscalar = matrizResult.multiplicacionMatrizEscalar(matriz1, escalar);
	
	matrizResult.imprimirMatriz(multiplicacionEscalar);
	System.out.println();
	
	}
}