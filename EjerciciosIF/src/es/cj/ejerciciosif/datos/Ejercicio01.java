package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien, notable y sobresaliente.//

public class Ejercicio01 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Nota : ");
		double nota = sc.nextDouble();
		
		if(nota >= 0 && nota < 5)
			System.out.println("Insuficiente");
		else if (nota >= 5 && nota < 6)
			System.out.println("Subiciente");
		else if (nota >= 6 && nota <7)
			System.out.println("Bien");
		else if (nota >= 7 && nota < 9)
			System.out.println("Notable");
		else if (nota >= 9 && nota <=10)
			System.out.println("Sobresaliente");
		else
			System.out.println("Valor incorrecto");
		
		//---SWITCH---//
		
		switch ((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Valor incorrecto");
			break;
		}
	sc.close();
	}
}