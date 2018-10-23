package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

	/*Leer 2 tablas de n n�meros y
	mezclarla en una tercera tabla de la siguiente forma:
	1� de A, 1� de B, 2� de A, 2� de B, 3� de A, 3� de B,...*/

public class PDFejercicio04 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[], b[], c[]; //Creamos las 3 tablas necesarias//
		
		a = new int[6];  //Tabla A con 6 elementos//
		b = new int[6];  //Tabla B con 6 elementos//
		c = new int[12]; //Tabla C con 12 elementos//
		
		//Pedimos los n�meros de la tabla A//
		
		System.out.println("Tabla A");
		System.out.println("-------");
		
		for (int i = 0; i < 6; i++) {
			System.out.print("N�mero " + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//Pedimos los n�meros de la tabla B//
		
		System.out.println("Tabla B");
		System.out.println("-------");
		
		for (int i = 0; i < 6; i++) {
			System.out.print("N�mero " + (i+1) + ": ");
			b[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//Mezclamos las dos tablas en la tabla C para crearla//
		
		int j=0;
		
		for (int i = 0; i < 6; i++) {
			c[j] = a[i]; //1�A, 2�A, 3�A,...//
			j++;
			c[j] = b[i]; //1�B, 2�B, 3�B,...//
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