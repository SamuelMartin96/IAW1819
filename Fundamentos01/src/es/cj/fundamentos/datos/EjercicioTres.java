package es.cj.fundamentos.datos;

import java.util.Scanner;

//Pedir el r�dio de un c�rculo y calcular su �rea y su longitud//

public class EjercicioTres {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Radio: ");
		double Radio = sc.nextDouble();
		double Area = Math.PI * Math.pow(Radio, 2);
		double Longitud = (2 * Math.PI * Radio);
		System.out.println("Area: " + Area);
		System.out.println("Longitud: " + Longitud);
	sc.close();
	}
}