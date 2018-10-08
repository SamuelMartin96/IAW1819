package es.cj.fundamentos.datos;

import java.util.Scanner;

//Pida al usuario una cantidad de segundos e imprima la cantidad de horas, minutos y segundos que son.//

public class EjercicioCuatro {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("SegundosT: ");
		int SegundosT = sc.nextInt();
		int Horas = (SegundosT / 3600);
		int Minutos = (SegundosT % 3600) / 60;
		int SegundosF = (SegundosT % 60);
		System.out.println("SegundosT: " + SegundosT);
		System.out.println("Horas: " + Horas);
		System.out.println("Minutos: " + Minutos);
		System.out.println("SegundosF: " + SegundosF);
	sc.close();
	}
}