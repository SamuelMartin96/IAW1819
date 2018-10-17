package es.cj.datos;

import java.util.Scanner;

	//Programa que muestre y calcule el producto de los n primeros números impares.//

public class PDFejercicio03 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		long producto = 1;
		
		for (int i = 1; i <= 10; i+=2) {
			producto = producto * i;
		}
		System.out.println("Producto total: " + producto);
	sc.close();
	}
}