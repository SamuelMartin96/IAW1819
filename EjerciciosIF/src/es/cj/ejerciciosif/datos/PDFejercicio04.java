package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos números e indicar cúal es el mayor o si son iguales.//

public class PDFejercicio04 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer Número :");
		double num1 = sc.nextDouble();
		
		System.out.println("Segundo Número :");
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " es mayor que " + num1);
		} else
			System.out.println("Son iguales");
	sc.close();
	}
}