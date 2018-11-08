package es.cj.datos;

	/*Muestra el string en Mayúsculas. Muestra el string en Minúsculas. Mostrar los 2 primeros caracteres y
	los 2 últimos. Número de veces que aparece el último carácter.
	Reemplazar todas las veces que se repite el primer carácter por el primer carácter en mayúscula.
	Añadir por el principio y por el final la cadena "***" */

public class PDFejercicio01 {
	
	public static void main(String[] args) {
		String cadena0 = new String ("*");
		String cadena1 = new String ("PRUEBA");
		String cadena2 = new String ("prueba");
		String cadena3 = new String ("*");
		
		System.out.println(cadena2.toUpperCase()); //Mostramos el String en mayúsculas//

		System.out.println(cadena1.toLowerCase()); //Mostramos el String en minúsculas//
		
		System.out.println(cadena1.substring(0, 2)); //2 Primeros caracteres//
		
		System.out.println(cadena1.substring(4, 6)); //2 Últimos caracteres//
		
		
		//Contamos el número de veces que se repite el último caracter//
		int posicion, contador = 0;
		 posicion = cadena1.indexOf("A");
		 while (posicion != -1) {
			 contador++;
			 posicion = cadena1.indexOf("A", posicion + 1);
		 }
		 System.out.println(contador);
		 
		 //Reemplazamos el primer carácter por el primer carácter en mayúscula//
		 cadena1 = cadena2.replace("p", "P");
		 System.out.println(cadena1);
		 
		 //Añadimos al principio y al final de la cadena "*"//
		 cadena0 = cadena0.concat(cadena1); //Principio de la cadena//
		 cadena0 = cadena0.concat(cadena3); //Final de la cadena//
		 System.out.print(cadena0);
	}
}