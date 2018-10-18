package es.cj.datos;

import java.util.Scanner;

	/*Solicite un número y muestre el cuadrado del número.
	El cuadrado de un número se obtiene de sumar tantos números impares como indique el número*/

public class PDFejercicio11 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int cuadrado;
		
		while (numero >=0) {
			cuadrado = numero*numero;
			System.out.println("El cuadrado de " + numero + " es " + cuadrado);
			System.out.println("Nº: ");
			numero =sc.nextInt();
		}
		System.out.println("El número introducido no es correcto.");
	sc.close();
	}
}