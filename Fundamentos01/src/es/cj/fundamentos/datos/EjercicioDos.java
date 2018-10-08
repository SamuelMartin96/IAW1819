package es.cj.fundamentos.datos;

import java.util.Scanner;

//Defina 2 variables de tipo entero para describir las longitudes de los lados de un rectángulo.//
//El programa debe calcular y mostrar las longitudes de los lagos, el perímetro y el área del rectangulo.//

public class EjercicioDos {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Alto: ");
		System.out.println("Ancho: ");
		int AL = sc.nextInt();
		int AN = sc.nextInt();
		int P = (2 * AL) + (2 * AN);
		int AR = (AL + AN);
		System.out.println("Alto: " + AL);
		System.out.println("Ancho: " + AN);
		System.out.println("Area: " + AR);
		System.out.println("Perimetro: " + P);
	sc.close();
	}
}