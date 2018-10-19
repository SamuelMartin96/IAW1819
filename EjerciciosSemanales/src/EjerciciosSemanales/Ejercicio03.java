package EjerciciosSemanales;

import java.util.Scanner;

	/*Escriba un programa que lea un número entero por el teclado y
	muestre en la pantalla si es un número abundante.
	Un número es abundante si la suma de sus divisores es mayor que él. Ejemplo:
	12 es abundante ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.*/

public class Ejercicio03 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int num, suma;
		num = sc.nextInt();
		suma = 0;
		
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				suma = suma+i;
			}
		}
		
		if (suma > num) {
			System.out.println("Es abundante");
		}else {
			System.out.println("No es abundante");
		}
	sc.close();
	}
}