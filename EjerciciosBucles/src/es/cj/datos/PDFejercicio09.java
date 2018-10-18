package es.cj.datos;

import java.util.Scanner;

	/*Leer por teclado una serie de n n�meros. La aplicaci�n debe indicarnos si los n�meros
	est�n ordenados de forma creciente, decreciente o si no est�n ordenados*/

public class PDFejercicio09 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Ind�que la cantidad de n�meros: ");
		System.out.println("-------------------------------");
		
		int totalnumeros = sc.nextInt();
		int[] numero = new int[totalnumeros];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("N�mero " + (i+1) + " : ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Los n�meros son: ");
		System.out.println("----------------");
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		
		
	sc.close();
	}
}