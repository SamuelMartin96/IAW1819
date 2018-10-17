package es.cj.datos;

import java.util.Scanner;

	/*Escribir un programa que lea un número desde el teclado y
	realice la suma de los 100 números siguientes, mostrando el resultado en pantalla*/

public class PDFejercicio04 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		int suma = 0;
		
		for (int i = numero; i <= numero + 100; i++) {
			if (numero > 0) {
				suma = suma + numero;
			}
		}
		System.out.println("Suma final: " + suma);
	sc.close();
	}
}