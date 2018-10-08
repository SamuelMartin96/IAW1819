package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pida al usuario día, mes y año y compruebe que la fecha es correcta.//

public class PDFejercicio08 {

		private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Día :");
		int dia = sc.nextInt();
		
		System.out.println("Mes :");
		int mes = sc.nextInt();
		
		System.out.println("Año :");
		int anyo = sc.nextInt();
		
		boolean FechaCorrecta = false;
		
		if(anyo >= 0) {
			if(mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if (dia >= 1 && dia <= 29)
						FechaCorrecta = true;
					else if (dia >= 1 && dia <= 28)
						FechaCorrecta = true;
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia >= 1 && dia <= 31)
						FechaCorrecta = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia >=1 && dia <= 30)
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