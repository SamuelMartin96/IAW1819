package es.cj.datos;

	/*Aplicar las operaciones b�sicas de modificaci�n de Strings a la cadena �Uno dosuno�,
	a�adiendo caracteres al final, cambiando la �o� por �e� y pas�ndola a may�scula.*/

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