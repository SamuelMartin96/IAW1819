package es.cj.clases;

import java.util.Random;

public class Profesor {

	public static void ponerNotas(Alumno a) {
		a.getA1().setCalificacion(new Random().nextDouble() * 10);
		a.getA2().setCalificacion(new Random().nextDouble() * 10);
		a.getA3().setCalificacion(new Random().nextDouble() * 10);
	}
	
	public static double calcularMedia(Alumno a) {
		return (a.getA1().getCalificacion() + a.getA2().getCalificacion() + a.getA3().getCalificacion()) / 3;
	}
}