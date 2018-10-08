package es.cj.ejerciciosif.datos;

import java.util.Scanner;

	//Pedir una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien, notable y sobresaliente//

public class PDFejercicio07 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Nota :");
		double nota = sc.nextDouble();
		
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