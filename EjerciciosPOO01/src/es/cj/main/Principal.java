package es.cj.main;

import es.cj.clases.Cuenta;
import es.cj.clases.CuentaOperaciones;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Yo", "123456789", 2000, 2.1);
		
		c1.setNombre("Tu");
		
		CuentaOperaciones.ingresar(100, c1);
		CuentaOperaciones.reintegro(50, c2);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}