package es.cj.datos;

import java.util.Scanner;

	/*Dados dos números introducidos por teclado, indique si son amigos o no
	Dos números son amigos si la suma de los divisores propios de uno de ellos es igual al otro
	(la unidad se considera divisor propio, pero no lo es el mismo número)*/

public class PDFejercicio10 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Primer Número: ");
		int num1, num2, suma;
		num1 = sc.nextInt();
		suma = 0;
		
		for (int i = 1; i < num1; i++) {
			if (num1%i==0) {
				suma = suma+i;
			}
		}
		
		System.out.println("Segundo Número: ");
		num2 = sc.nextInt();
		
		if (suma == num2) {
			suma = 0;
			for (int i = 1; i < num2; i++) {
				if (num2%i==0) {
					suma = suma+i;
				}
			}
		}
		
		if (suma == num1) {
			System.out.println("Son amigos.");
		}else {
			System.out.println("Son enemigos.");
		}
	sc.close();
	}
}