package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	/*Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1.
	Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el hueco vacío*/

public class PDFejercicio06 {
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[] tabla;
	
	public static void main(String[] args) {
		int tamanyo = 0;
				
		do {
			System.out.println("Nº Elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		tabla = new int[tamanyo];
		
		inicializarTabla();
		mostrarTabla();
		
		int posicion;
		do {
			System.out.println("Valor: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > tamanyo);
		
		eliminarPosicion(posicion);
		
		mostrarTabla();
		
	sc.close();
	}

	private static void eliminarPosicion(int posicion) {
		for (int i = posicion; i < tabla.length - 1; i++) {
			tabla[i] = tabla[i+1];
		}
		tabla[tabla.length -1] = 0;
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(tabla));
		
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10);
		}
	}
}