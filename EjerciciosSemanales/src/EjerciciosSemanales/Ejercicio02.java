package EjerciciosSemanales;

import java.util.Scanner;

	/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
	  Si trabaja 40 horas o menos se le paga 16€ por hora.
	  Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.
	*/

public class Ejercicio02 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Número de horas: ");
		int horas = sc.nextInt();
		
		if(horas <=40) {
			System.out.println("Sueldo por hora: " + horas * 16);
		}else if(horas >=40) {
			System.out.println("Sueldo por hora extra: " + (40 * 16 + (horas - 40) * 20));
		}else {
			System.out.println("Supera las horas.");
		}
	sc.close();
	}
}