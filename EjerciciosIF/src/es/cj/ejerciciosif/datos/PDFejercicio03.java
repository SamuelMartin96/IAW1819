package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos números y decir si uno es múltiplo de otro.//

public class PDFejercicio03 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer Número :");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo Número :");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0)
			System.out.println(num2 + " si es múltimplo de " + num1);
		else
			System.out.println(num2 + " no es múltimplo de " + num1);	
	sc.close();
	}
}