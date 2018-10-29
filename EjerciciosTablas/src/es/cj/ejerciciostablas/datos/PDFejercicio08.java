package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	//Cree una tabla de n elementos. Muestre la tabla ordenada//

public class PDFejercicio08 {

	private static Scanner sc = new Scanner (System.in);
	private static int [] numeros;
	
	public static void main(String[] args) {
		int tamayo;
		do {
			System.out.println("Nº de elemetos: ");
			tamayo = sc.nextInt();
		}while (tamayo <=0);
		
		numeros = new int [tamayo];
		
		iniciar();
		mostrar();
		ordenar();
		
	sc.close();
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
		
	}
	
	private static void ordenar() {
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
	}
}