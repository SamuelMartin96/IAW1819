package es.cj.main;

import java.util.Scanner;

import es.cj.clases.NIF;

public class Principal {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		int DNI;
		do {
			System.out.println("DNI: ");
			DNI = sc.nextInt();
		} while (String.valueOf(DNI).length() !=8);
		
		NIF n = new NIF(DNI);
		
		System.out.println(n);
		
		mostrarLetras();
	sc.close();
	}

	private static void mostrarLetras() {
		int DNI = 0;
		do {
			System.out.println("DNI: ");
			DNI = sc.nextInt();
			if (String.valueOf(DNI).length()==8) {
				System.out.println(DNI + " - " + NIF.leer(DNI));
			}
		} while (DNI !=0);
	}
}