package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

	/*Leer 2 tablas de n números y
	mezclarla en una tercera tabla de la siguiente forma:
	1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,...*/

public class PDFejercicio04 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[], b[], c[]; //Creamos las 3 tablas necesarias//
		
		a = new int[6];  //Tabla A con 6 elementos//
		b = new int[6];  //Tabla B con 6 elementos//
		c = new int[12]; //Tabla C con 12 elementos//
		
		//Pedimos los números de la tabla A//
		
		System.out.println("Tabla A");
		System.out.println("-------");
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Número " + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//Pedimos los números de la tabla B//
		
		System.out.println("Tabla B");
		System.out.println("-------");
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Número " + (i+1) + ": ");
			b[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//Mezclamos las dos tablas en la tabla C para crearla//
		
		int j=0;
		
		for (int i = 0; i < 6; i++) {
			c[j] = a[i]; //1ºA, 2ºA, 3ºA,...//
			j++;
			c[j] = b[i]; //1ºB, 2ºB, 3ºB,...//
			j++;
		}
		
		//Mostramos la tabla C//
		
		System.out.println("Tabla C");
		System.out.println("-------");
		for (int i = 0; i < 12; i++) {
			System.out.print(c[i] + " ");
		}
	sc.close();
	}
}