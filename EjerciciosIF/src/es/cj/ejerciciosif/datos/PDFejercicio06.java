package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir tres números y mostrarlos ordenados de mayor a menor.//

public class PDFejercicio06 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer Número :");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo Número :");
		int num2 = sc.nextInt();
		
		System.out.println("Tercer Número :");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if (num2 > num3)
				System.out.println("Orden: " + num1 + "," + num2 + "," + num3);
			else
				System.out.println("Orden: " + num1 + "," + num3 + "," + num2);
			} else if (num2 > num1 && num2 > num3) {
				if (num1 > num3)
					System.out.println("Orden: " + num2 + "," + num1 + "," + num3);
				else
					System.out.println("Orden: " + num2 + "," + num3 + "," + num1);
			} else if (num3 > num1 && num3 > num2) {
				if (num1 > num2)
					System.out.println("Orden: " + num3 + "," + num1 + "," + num2);
				else
					System.out.println("Orden: " + num3 + "," + num2 + "," + num1);
			} else
				System.out.println("Iguales");
	sc.close();
	}
}