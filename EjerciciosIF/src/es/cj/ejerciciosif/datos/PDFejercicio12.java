package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.//

public class PDFejercicio12 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Día1: ");
		int dia1 = sc.nextInt();
		
		System.out.println("Mes1: ");
		int mes1 = sc.nextInt();
		
		System.out.println("Año1: ");
		int anyo1 = sc.nextInt();
		
		System.out.println("Día2: ");
		int dia2 = sc.nextInt();
		
		System.out.println("Mes2: ");
		int mes2 = sc.nextInt();
		
		System.out.println("Año2: ");
		int anyo2 = sc.nextInt();
		
		int TotalDias = 0;
		
		boolean FechaCorrecta = false;
		
		if(anyo1 >=0 && anyo2 >=0) {
			if(mes1 >=1 && mes1 <=12 && mes2 >=1 && mes2 <=12) {
				switch (mes1) {
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
					if(dia1 >=1 && dia1 <=30)
						FechaCorrecta = true;
					break;
				default:
					break;
				}
				switch (mes2) {
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
					if(dia2 >=1 && dia2 <=30)
						FechaCorrecta = true;
					break;
				default:
					break;
				}
			}
		} if(TotalDias == (dia2 - dia1 + 30) * (mes2 - mes1 + 365) * (anyo2 - anyo1)) {
			System.out.println("Diferencia de días: " + TotalDias);
		}else {
			System.out.println("Incorrecto");
		}
	sc.close();
	}
}