package es.cj.datos;

import java.util.Scanner;

	/*Solicite un n�mero y muestre el cuadrado del n�mero.
	El cuadrado de un n�mero se obtiene de sumar tantos n�meros impares como indique el n�mero*/

public class PDFejercicio11 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int cuadrado;
		
		while (numero >=0) {
			cuadrado = numero*numero;
			System.out.println("El cuadrado de " + numero + " es " + cuadrado);
			System.out.println("N�: ");
			numero =sc.nextInt();
		}
		System.out.println("El n�mero introducido no es correcto.");
	sc.close();
	}
}