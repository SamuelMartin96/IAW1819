package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos n�meros y decir si uno es m�ltiplo de otro.//

public class PDFejercicio03 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer N�mero :");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo N�mero :");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0)
			System.out.println(num2 + " si es m�ltimplo de " + num1);
		else
			System.out.println(num2 + " no es m�ltimplo de " + num1);	
	sc.close();
	}
}