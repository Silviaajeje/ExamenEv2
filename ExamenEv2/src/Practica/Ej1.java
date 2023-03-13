package Practica;

public class Ej1 {

	public static void main(String[] args) {
		int [][] almacenes = {{31,40,20},{ 21, 10, 30}, {2, 26, 15},{10, 36, 20}};
		double [] precioPieza = {19.61, 23, 86.04};
		
		int numPieza = 0;
		calcularValorTotalPoPieza(almacenes, precioPieza, numPieza);
	}

	private static void calcularValorTotalPoPieza(int[][] almacenes, double[] precioPieza, int numPieza) {
		System.out.println("**********VALOR POR PIEZA*********");
		do {
		double valorTotalPieza = 0.0;
		for (int i = 0; i < almacenes.length; i++){
				valorTotalPieza += almacenes[i][numPieza] * precioPieza[numPieza];
		}
		System.out.println("El valor total de la pieza " + numPieza + " es de " + valorTotalPieza + "€\n");
		numPieza ++; 
		}while(numPieza != 3);
		
	}

}
