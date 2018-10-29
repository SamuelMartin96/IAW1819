package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	/*Crear una tabla de n números y desplazarla una posición hacia abajo, es decir,
	el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.
	El último pasa a ser el primero*/

public class PDFejercicio05 {

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
		
		desplazar();
		
		mostrar();
		
	sc.close();
	}

	private static void desplazar() {
		int aux = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[0] = aux;
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
		
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}
}