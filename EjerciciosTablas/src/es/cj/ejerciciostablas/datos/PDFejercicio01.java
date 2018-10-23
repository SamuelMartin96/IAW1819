package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

	/*Leer n números enteros,
	guardarlos en la tabla y mostrar la media de los positivos, media negativos y el número de ceros*/

public class PDFejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Indique cuantos números enteros");
		System.out.println("-------------------------------");
		int totalnumeros = sc.nextInt();
		int [] numero = new int[totalnumeros];
		int contP = 0, contN = 0, contC = 0;
		
		System.out.println();
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Número " + (i+1) + " : ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Los números son: ");
		System.out.println("----------------");
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
			
			if (numero[i] < 0) {
				contN++;
			}
			
			if (numero[i] > 0) {
				contP++;
			}
			
			if (numero[i] == 0) {
				contC++;
			}
		}
		
		System.out.println();
		
		System.out.println("Cantidad de negativos: " + contN);
		System.out.println("Cantidad de positivos: " + contP);
		System.out.println("Cantidad de ceros: " + contC);
	sc.close();
	}
}