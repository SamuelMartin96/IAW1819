package es.cj.datos;

	/*Muestra el string en May�sculas. Muestra el string en Min�sculas. Mostrar los 2 primeros caracteres y
	los 2 �ltimos. N�mero de veces que aparece el �ltimo car�cter.
	Reemplazar todas las veces que se repite el primer car�cter por el primer car�cter en may�scula.
	A�adir por el principio y por el final la cadena "***" */

public class PDFejercicio01 {
	
	public static void main(String[] args) {
		String cadena0 = new String ("*");
		String cadena1 = new String ("PRUEBA");
		String cadena2 = new String ("prueba");
		String cadena3 = new String ("*");
		
		System.out.println(cadena2.toUpperCase()); //Mostramos el String en may�sculas//

		System.out.println(cadena1.toLowerCase()); //Mostramos el String en min�sculas//
		
		System.out.println(cadena1.substring(0, 2)); //2 Primeros caracteres//
		
		System.out.println(cadena1.substring(4, 6)); //2 �ltimos caracteres//
		
		
		//Contamos el n�mero de veces que se repite el �ltimo caracter//
		int posicion, contador = 0;
		 posicion = cadena1.indexOf("A");
		 while (posicion != -1) {
			 contador++;
			 posicion = cadena1.indexOf("A", posicion + 1);
		 }
		 System.out.println(contador);
		 
		 //Reemplazamos el primer car�cter por el primer car�cter en may�scula//
		 cadena1 = cadena2.replace("p", "P");
		 System.out.println(cadena1);
		 
		 //A�adimos al principio y al final de la cadena "*"//
		 cadena0 = cadena0.concat(cadena1); //Principio de la cadena//
		 cadena0 = cadena0.concat(cadena3); //Final de la cadena//
		 System.out.print(cadena0);
	}
}