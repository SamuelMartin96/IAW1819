package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir un número e indicar si es positivo o negativo.//

public class PDFejercicio02 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Número: ");
		int num = sc.nextInt();
		
		if(num >= 0)
			System.out.println(num + " es un número positivo.");
		else
			System.out.println(num + " es un número negativo.");
	sc.close();
	}
}