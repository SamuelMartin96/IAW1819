package es.cj.datos;

	/*Aplicar las operaciones básicas de modificación de Strings a la cadena “Uno dosuno”,
	añadiendo caracteres al final, cambiando la “o” por “e” y pasándola a mayúscula.*/

public class PDFejercicio03 {

	public static void main(String[] args) {
		String cadena1 = new String ("Uno dosuno");
		
		System.out.println(cadena1);
		
		StringBuffer sb = new StringBuffer(cadena1);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());

		//Cambiamos la o por la E//
		cadena1 = cadena1.replace("o", "E");
		System.out.println(cadena1);
	}
}