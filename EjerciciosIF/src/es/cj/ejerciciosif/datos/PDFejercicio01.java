package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos números y decir si son iguales o no.//

public class PDFejercicio01 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer Número :");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo Número :");
		int num2 = sc.nextInt();
		
		if(num1 == num2)
			System.out.println(num1 + " es igual que " + num2);
		else
			System.out.println(num1 + " no es igual que " + num2);
	sc.close();
	}
}