package es.cj.datos;

import java.util.Scanner;

	//Pedir un número y calcular su factorial//

public class PDFejercicio05 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		
		while (numero != 0) {
			factorial = factorial * numero;
			numero--;
		}
		System.out.println("El factorial es: " + factorial);
	sc.close();
	}
}