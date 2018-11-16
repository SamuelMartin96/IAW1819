package es.cj.datos;

	/*Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos que hay en ella.
	Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10.*/

public class PDFejercicio04 {

	private static int total= 0;

	public static void main(String[] args) {
		String cadena = new String ("abc12de3f4");
		
		System.out.println("El total es: " + sumarNumeros(cadena));
	}

	private static int sumarNumeros(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i)) ) {
				total = total + Character.getNumericValue(cadena.charAt(i));
			}
		}
		return total;
	}
}