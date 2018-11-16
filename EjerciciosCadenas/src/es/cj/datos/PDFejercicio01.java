package es.cj.datos;

	/*Muestra el string en Mayúsculas. Muestra el string en Minúsculas. Mostrar los 2 primeros caracteres y
	los 2 últimos. Número de veces que aparece el último carácter.
	Reemplazar todas las veces que se repite el primer carácter por el primer carácter en mayúscula.
	Añadir por el principio y por el final la cadena "***" */

public class PDFejercicio01 {
	
	public static void main(String[] args) {
		String cadena1 = new String ("PRUEBA");
		String cadena2 = new String ("prueba");
		
		System.out.println(cadena2.toUpperCase()); //Mostramos el String en mayúsculas//

		System.out.println(cadena1.toLowerCase()); //Mostramos el String en minúsculas//
		
		if (cadena1.length() >= 2) {
			System.out.println(cadena1.substring(0, 2)); //2 Primeros caracteres//
			System.out.println(cadena1.substring(cadena1.length()-2, cadena1.length())); //2 Últimos caracteres//
		}
		
		//Contamos el número de veces que se repite el último caracter//
		String ultimo = cadena1.substring(cadena1.length()-1);
		int contador = 0;
		for (int i = 0; i < cadena1.length(); i++) {
			if (cadena1.substring(i, i+1).equalsIgnoreCase(ultimo)) {
				contador++;
			}
		}
		System.out.println(contador);
		 
		//Reemplazamos el primer carácter por el primer carácter en mayúscula//
		String primero = cadena2.substring(0, 1);
		cadena2 = cadena2.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		System.out.println(cadena2);
		 
		//Añadimos al principio y al final de la cadena "***"//
		StringBuffer sb = new StringBuffer(cadena1);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
	}
}