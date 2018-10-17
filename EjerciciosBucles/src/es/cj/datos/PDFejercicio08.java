package es.cj.datos;

import java.util.Arrays;
import java.util.Scanner;

	//Pida al usuario n n�meros y mu�strele ordenados.//

public class PDFejercicio08 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Ind�que la cantidad de n�meros a ordenar: ");
		System.out.println("-----------------------------------------");
		
		int totalnumeros = sc.nextInt();
		int[] numero = new int[totalnumeros];
		int ordenado;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("N�mero " + (i+1) + " : ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Los n�meros son: ");
		System.out.println("----------------");
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		Arrays.sort(numero);
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Ordenados de mayor a menor: " + numero[i]);
		}
	sc.close();
	}
}