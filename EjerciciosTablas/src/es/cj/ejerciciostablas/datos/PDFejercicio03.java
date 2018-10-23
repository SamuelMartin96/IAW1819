package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

//Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares//

public class PDFejercicio03 {
	
	public static void main(String[] args) {
		int [] numeros = new int [10];
		int contP = 0, contI = 0;
		
		//Generamos los números del array, los mostramos y contamos cuáles son pares y cuáles impares//
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
			
			if (numeros[i]%2==0) {
				contP++;
			}else {
				contI++;
			}
		}
		System.out.println("Números del Array");
		System.out.println("-----------------");
		System.out.println(Arrays.toString(numeros));
		
		int par[] = new int[contP];
		int impar[] = new int[contI];
		
		int recorridoPar = 0;
		int recorridoImpar = 0;
		
		//Almacenamos los números pares en una tabla y los impares en otra//
		
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
		
		//Mostramos cada array con sus números correspondientes//
		
		System.out.println("Números Pares");
		System.out.println("-------------");
		
		for (int i = 0; i < recorridoPar; i++) {
			System.out.print(par[i] + " - ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Números Impares");
		System.out.println("---------------");
		
		for (int i = 0; i < recorridoImpar; i++) {
			System.out.print(impar[i] + " - ");
		}
	}
}