package es.cj.clases;

public class NIF {

	private static int DNI;
	private char letra;
	
	private static char [] codigos = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	public NIF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NIF(int dni) {
		super();
		this.DNI = dni;
		this.letra = calcularLetra(DNI);
	}
	
	private static char calcularLetra(int dNI2) {
		int resto = DNI%23;
		return codigos[resto];
	}

	public static char leer(int DNI) {
		return calcularLetra(DNI);
	}

	@Override
	public String toString() {
		return this.DNI + " - " + Character.toUpperCase(this.letra);
	}
}