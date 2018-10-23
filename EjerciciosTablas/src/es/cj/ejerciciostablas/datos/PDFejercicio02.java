package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	/*Leer n números ordenados crecientemente. Pedir al usuario un número y buscarlo en la tabla.
	Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con un mensaje*/

public class PDFejercicio02 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
		}
		
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		System.out.println();
		
		System.out.println("Indíque un número mostrado en el array: ");
		int numeroFinal = sc.nextInt();
		
		System.out.println("El " + numeroFinal + " se encuentra en la posición: " + Arrays.binarySearch(numeros, numeroFinal));
	sc.close();
	}
}