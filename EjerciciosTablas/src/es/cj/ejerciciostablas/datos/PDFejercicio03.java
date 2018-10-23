package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

//Leer tabla de n n�meros y guardar en otra tabla los pares y en otra tabla los impares//

public class PDFejercicio03 {
	
	public static void main(String[] args) {
		int [] numeros = new int [10];
		int contP = 0, contI = 0;
		
		//Generamos los n�meros del array, los mostramos y contamos cu�les son pares y cu�les impares//
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
			
			if (numeros[i]%2==0) {
				contP++;
			}else {
				contI++;
			}
		}
		System.out.println("N�meros del Array");
		System.out.println("-----------------");
		System.out.println(Arrays.toString(numeros));
		
		int par[] = new int[contP];
		int impar[] = new int[contI];
		
		int recorridoPar = 0;
		int recorridoImpar = 0;
		
		//Almacenamos los n�meros pares en una tabla y los impares en otra//
		
		for (int i = 0; i < 10; i++) {
			if (numeros[i]%2==0) {
				par[recorridoPar] = numeros[i];
				recorridoPar++;
			}else {
				impar[recorridoImpar] = numeros[i];
				recorridoImpar++;
			}
		}
		
		System.out.println();
		
		//Mostramos cada array con sus n�meros correspondientes//
		
		System.out.println("N�meros Pares");
		System.out.println("-------------");
		
		for (int i = 0; i < recorridoPar; i++) {
			System.out.print(par[i] + " - ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("N�meros Impares");
		System.out.println("---------------");
		
		for (int i = 0; i < recorridoImpar; i++) {
			System.out.print(impar[i] + " - ");
		}
	}
}