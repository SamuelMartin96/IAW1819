package es.cj.datos;

public class Explicacion {

	public static void main(String[] args) {
		String cadena1 = new String ("hola");
		String cadena2 = new String ("HOLA");
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Iguales");
		}else {
			System.out.println("Distintas");
		}
		
		cadena1 = cadena1.concat(cadena2);
		System.out.println(cadena1);
		
		if (cadena1.contains("lala")) {
			System.out.println("Lo tiene");
			
			System.out.println(cadena1.toLowerCase().lastIndexOf("a"));
		}
		
		if (cadena1.equals("") || cadena1.length() == 0 || cadena1.isEmpty()) {
			System.out.println("Cadena vacía");
		}else {
			System.out.println("No está vacía");
		}
		
		cadena1 = cadena1.replace("h", "P");
		System.out.println(cadena1);
		
		System.out.println(cadena1.substring(0, 3));
	}
}