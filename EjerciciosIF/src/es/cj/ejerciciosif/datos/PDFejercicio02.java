package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir un n�mero e indicar si es positivo o negativo.//

public class PDFejercicio02 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("N�mero: ");
		int num = sc.nextInt();
		
		if(num >= 0)
			System.out.println(num + " es un n�mero positivo.");
		else
			System.out.println(num + " es un n�mero negativo.");
	sc.close();
	}
}