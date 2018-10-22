package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

public class Explicacion {

	public static void main(String[] args) {
		
		/* int tabla [][] = new int [10][6]; //Definición de una tabla de enteros//
		
		tabla[2][1] = 3; //Columna 2 Fila 1//
		
		int tabla2 [] = {1,2,3}; //Tabla Vector (Unidimensional)//
		System.out.println(tabla2.length);
		
		System.out.println(); //Salto de línea//
		
		int tabla3[][] = {{1,2,3}, {4,5}, {6,7,8,9}};
		for (int i = 0; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3[i].length; j++) {
				System.out.print(tabla3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(); //Salto de línea//
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}
		
		System.out.println(); //Salto de línea//
		System.out.println(); //Salto de línea//
		
		String cadena [] = {"Hola", "que", "tal"}; //Tabla de cadena//
		for (int i = 0; i < cadena.length; i++) {
			System.out.print(cadena[i] + " ");
		}
		
		System.out.println(); //Salto de línea//
		
		for (int i = 0; i < tabla.length; i++) {  //Tabla bidimensional//
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = new Random().nextInt(100);
			}
		}
		
		System.out.println(); //Salto de línea//
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		} */
		
		int [] numeros = new int [10];
		for (int i = 0; i < numeros.length; i++) { //Inicializar una tabla de 10 con números aleatorios//
			numeros[i] = new Random().nextInt(10);
		}
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros); //Solo ordena arrays unidimensionales//
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("El 6 se encuentra en la posición: " + Arrays.binarySearch(numeros, 6));
		
		//Arrays.fill(numeros, 99);//
		System.out.println(Arrays.toString(numeros));
		
		int [] auxiliar = Arrays.copyOfRange(numeros, 0, 5);
		System.out.println(Arrays.toString(auxiliar));
		
		System.out.println(bucarPosiciones(numeros, 6));
	}

	private static String bucarPosiciones(int[] numeros, int valor) {
		String posiciones = "";
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				posiciones += i + " ";
			}
		}
		
		return posiciones;
	}
}