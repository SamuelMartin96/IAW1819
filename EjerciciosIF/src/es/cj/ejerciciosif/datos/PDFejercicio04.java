package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos n�meros e indicar c�al es el mayor o si son iguales.//

public class PDFejercicio04 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer N�mero :");
		double num1 = sc.nextDouble();
		
		System.out.println("Segundo N�mero :");
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