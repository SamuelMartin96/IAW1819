package es.cj.datos;

import java.util.Scanner;

	/*Un número natural se dice perfecto si es igual a la suma de sus divisores propios.
	Pedir un número e indicar si es perfecto*/

public class PDFejercicio12 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		int sumanumero = 0;
		
		for (int i = 1; i < numero; i++) {
			if (numero%i==0) {
				sumanumero=sumanumero+i;
			}
		}
		
		if (sumanumero==numero) {
			System.out.println("Es perfecto.");
		}else {
			System.out.println("No es perfecto.");
		}
	sc.close();
	}
}