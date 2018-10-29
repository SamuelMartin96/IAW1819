package EjerciciosSemanales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	/*Rellena una tabla de 20 números positivos de manera aleatoria. Pida números al usuario
	(0 para finalizar el bucle) y muestra cuántas veces se repite el número en la tabla y
	cuál es la primera posición en la que aparece
	(-1 si no se encuentra en la tabla)*/

public class Ejercicio04 {

	private static Scanner sc = new Scanner (System.in);
	private static int [] numeros;
	private static int numeroFinal;
	private static int contador = 0;
	
	public static void main(String[] args) {
			int tamayo;
			do {
				System.out.println("Nº de elemetos: ");
				tamayo = sc.nextInt();
			}while (tamayo <=0);
			
			numeros = new int [tamayo];
		
			iniciar();
			mostrar();
			
			System.out.println("Indique un número: ");
			int numeroFinal = sc.nextInt();
			System.out.println("El " + numeroFinal + " se encuentra en la posición: " + Arrays.binarySearch(numeros, numeroFinal));
			
	sc.close();
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(20) + 1;
		}
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
	}
}