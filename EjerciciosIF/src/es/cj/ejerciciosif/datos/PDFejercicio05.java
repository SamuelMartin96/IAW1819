package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos n�meros y mostrarlos ordenados de mayor a menor.//

public class PDFejercicio05 {

		private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer N�mero :");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo N�mero :");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(num1 + " es mayor que " + num2);
		else
			System.out.println(num2 + " es mayor que "+ num1);
	sc.close();
	}
}