package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	/*Se pretende desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
	Cada clase está compuesta por 10 alumnos. Se pide leer las notas del primer,
	segundo y tercer trimestre almacenándolas en una tabla. Debemos mostrar la nota
	media final de cada alumno y de cada clase en cada trimestre.
	Por último, desarrolle un método que se le pase un número de alumno y
	devuelve la media final de ese alumno*/

public class PDFejercicio07 {
	
	private static int alumnos[][];
	
	//Medias Trimestres//
	private static double mediasT[];
	
	//Medias Alumnos//
	private static double mediasA[];
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		int numAlumnos = 0;
		do {
			System.out.println("Nº Alumnos: ");
			numAlumnos = sc.nextInt();
		} while (numAlumnos <= 0);
		
		int trimestres = 0;
		do {
			System.out.println("Nº Trimestres: ");
			trimestres = sc.nextInt();
		} while (trimestres <= 0);
		
		//Datos de alumnnos (notas)//
		alumnos = new int[numAlumnos][trimestres];
		
		//Medias por trimestres//
		mediasT = new double [alumnos[0].length];
		
		//Medias por alumnos//
		mediasA = new double [alumnos.length];
		
		leerNotas();
		
		mostrarNotas();
		
		calcularMedias();
		
		mostrarMedias();
		
	sc.close();
	}

	private static void mostrarMedias() {
		System.out.println("---MEDIAS---");
		System.out.println(Arrays.toString(mediasA));
		System.out.println(Arrays.toString(mediasT));
	}

	private static void mostrarNotas() {
		System.out.println("---NOTAS---");
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.print(alumnos[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void calcularMedias() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				mediasT[j] += alumnos[i][j];
				mediasA[i] += alumnos[i][j];
			}
			mediasA[i] = Math.rint((mediasA[i] / mediasT.length)*100/100);
		}
		calculasMediasTrimestres();
	}

	private static void calculasMediasTrimestres() {
		for (int i = 0; i < mediasT.length; i++) {
			mediasT[i] = mediasA[i] = Math.rint((mediasA[i] / mediasT.length)*100/100);
		}
	}

	private static void leerNotas() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				alumnos[i][j] = new Random().nextInt(11);
			}
		}
	}
}