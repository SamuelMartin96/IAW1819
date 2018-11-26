package es.cj.main;

import es.cj.clases.Caja;

public class Principal {

	public static void main(String[] args) {
		Caja c = new Caja(1,2,3); //Ancho 1, Largo 2 y Alto 3//
		Caja c1 = new Caja(1,2,3);
		
		//c.setAlto(23);
		
		System.out.println("El alto es: " + c.getAlto());
		System.out.println("Volumen: " + c.obtenerVolumen());
		
		System.out.println(c);
		
		if (c.equals(c1) ) {
			System.out.println("Iguales.");
		} else {
			System.out.println("Distintas.");
		}
	}
}