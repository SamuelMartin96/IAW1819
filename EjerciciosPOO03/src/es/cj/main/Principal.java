package es.cj.main;

import es.cj.clases.Alumno;
import es.cj.clases.Asignatura;
import es.cj.clases.Profesor;

public class Principal {

	public static void main(String[] args) {
		Asignatura iaw = new Asignatura(1234);
		Asignatura asgbd = new Asignatura(5678);
		Asignatura aso = new Asignatura(2244);
		
		Alumno yo = new Alumno(iaw, asgbd, aso);
		
		Profesor.ponerNotas(yo);
		
		System.out.println("Media: " + Profesor.calcularMedia(yo));
	}
}