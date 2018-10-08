package es.cj.ejerciciosif.datos;

import java.util.Scanner;

//Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.//

public class PDFejercicio11 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Hora :");
		int hora = sc.nextInt();
		
		System.out.println("Minutos :");
		int minutos = sc.nextInt();
		
		System.out.println("Segundos :");
		int segundos = sc.nextInt();
		
		if (hora < 24 && minutos < 60 && segundos < 60) {
			if(segundos < 59 && segundos >=0) {
				System.out.println("Hora: " + hora + " Minutos: " + minutos + " Segundos: " + (segundos + 1));
			}else {
				if(segundos == 59) {
					if(minutos == 59) {
						if(hora == 23) {
							System.out.println(" Horas: 00  Minutos: 00 Segundos: 00");
						}else {
							System.out.println("Hora: " + (hora +1)  + " Minutos: 00" + " Segundos: 00");
						}
					}else {
						System.out.println("Hora: " + hora + " Minutos: " + (minutos +1) + " Segundos: 00");
					}
				}
			}
		}else {
			System.out.println("Fuera de rango");
		}
	sc.close();
	}

}
