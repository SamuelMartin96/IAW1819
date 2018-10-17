package es.cj.datos;

import java.util.Scanner;

	/*Dise�e una aplicaci�n que muestre las tablas de multiplicar del 1 al 10.
	Adem�s, solicite al usuario que tabla quiere mostrar*/

public class PDFejercicio06 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Tablas de multiplicar");
		System.out.println("---------------------");
		
		for (int i = 1; i <= 10 ; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
			}
		}
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		System.out.println("Tabla del " + numero);
		System.out.println("------------");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + numero*i);
		}
	sc.close();
	}
}