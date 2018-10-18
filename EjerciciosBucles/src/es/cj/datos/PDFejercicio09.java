package es.cj.datos;

import java.util.Scanner;

	/*Leer por teclado una serie de n números. La aplicación debe indicarnos si los números
	están ordenados de forma creciente, decreciente o si no están ordenados*/

public class PDFejercicio09 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Indíque la cantidad de números: ");
		System.out.println("-------------------------------");
		
		int totalnumeros = sc.nextInt();
		int[] numero = new int[totalnumeros];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Número " + (i+1) + " : ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Los números son: ");
		System.out.println("----------------");
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		
		
	sc.close();
	}
}