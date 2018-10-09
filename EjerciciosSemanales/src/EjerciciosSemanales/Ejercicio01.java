package EjerciciosSemanales;

import java.util.Scanner;

//Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras//

public class Ejercicio01 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Número: ");
		int numero = sc.nextInt();
		
		if(numero >0 && numero <10) {
			System.out.println("El número es: " + numero + " tiene 1 cifra.");
		}else if(numero >=10 && numero <100) {
			System.out.println("El número es: " + numero + " tiene 2 cifra.");
		}else if(numero >=100 && numero <1000) {
			System.out.println("El número es: " + numero + " tiene 3 cifras.");
		}else if(numero >=1000 && numero <10000) {
			System.out.println("El número es: " + numero + " tiene 4 cifras.");
		}else if(numero >=10000) {
			System.out.println("El número supera las 4 cifras.");
		}else {
			System.out.println("Número incorrecto.");
		}
	sc.close();
	}
}