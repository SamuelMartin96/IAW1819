package es.cj.clases;

public class CuentaOperaciones {
	
	public static void ingresar(double cantidad, Cuenta c) {
		if (cantidad > 0) {
			c.setSaldo(c.getSaldo() + cantidad);
		}
	}
	
	public static void reintegro(double cantidad, Cuenta c) {
		if (cantidad <= c.getSaldo() && cantidad > 0) {
			c.setSaldo(c.getSaldo() - cantidad);
		}
	}
}