package es.cj.datos;

	/*Muestra el string en May�sculas. Muestra el string en Min�sculas. Mostrar los 2 primeros caracteres y
	los 2 �ltimos. N�mero de veces que aparece el �ltimo car�cter.
	Reemplazar todas las veces que se repite el primer car�cter por el primer car�cter en may�scula.
	A�adir por el principio y por el final la cadena "***" */

public class PDFejercicio01 {
	
	public static void main(String[] args) {
		String cadena1 = new String ("PRUEBA");
		String cadena2 = new String ("prueba");
		
		System.out.println(cadena2.toUpperCase()); //Mostramos el String en may�sculas//

		System.out.println(cadena1.toLowerCase()); //Mostramos el String en min�sculas//
		
		if (cadena1.length() >= 2) {
			System.out.println(cadena1.substring(0, 2)); //2 Primeros caracteres//
			System.out.println(cadena1.substring(cadena1.length()-2, cadena1.length())); //2 �ltimos caracteres//
		}
		
		//Contamos el n�mero de veces que se repite el �ltimo caracter//
		String ultimo = cadena1.substring(cadena1.length()-1);
		int contador = 0;
		for (int i = 0; i < cadena1.length(); i++) {
			if (cadena1.substring(i, i+1).equalsIgnoreCase(ultimo)) {
				contador++;
			}
		}
		System.out.println(contador);
		 
		//Reemplazamos el primer car�cter por el primer car�cter en may�scula//
		String primero = cadena2.substring(0, 1);
		cadena2 = cadena2.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		System.out.println(cadena2);
		 
		//A�adimos al principio y al final de la cadena "***"//
		StringBuffer sb = new StringBuffer(cadena1);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
	}
}