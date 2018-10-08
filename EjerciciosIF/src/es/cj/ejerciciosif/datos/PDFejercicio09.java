package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir d�a, mes y a�o y mostrar la fecha del d�a siquiente. Suponer que todos los meses son de 30 d�as.//

public class PDFejercicio09 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("D�a :");
		int dia = sc.nextInt();
		
		System.out.println("Mes :");
		int mes = sc.nextInt();
		
		System.out.println("A�o :");
		int anyo = sc.nextInt();
		
		boolean FechaCorrecta = false;
		
		if(anyo >= 0) {
			if(mes >1 && mes <=12) {
				switch (mes) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
					if (dia >=1 && dia <=30)
						FechaCorrecta = true;
					break;
				default:
					break;
				}
			}
		}
		if (FechaCorrecta)
			System.out.println("Fecha Correcta: " + dia + "/" + mes + "/" + anyo);
		else
			System.out.println("Fecha Incorrecta");
	sc.close();
	}
}