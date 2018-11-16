package es.cj.datos;

	/*Realizar un programa que reciba dos cadenas de caracteres
	y cuente el número de apariciones de la primera en la segunda*/

public class PDFejercicio02 {

	public static void main(String[] args) {
		String cadena1 = new String ("Hola");
		String cadena2 = new String ("Hola que tal. Hola como estas. Hola.");
		
		int posicion, contador = 0;
		posicion = cadena1.indexOf("Hola");
		while (posicion != -1) {
			contador++;
			posicion = cadena2.indexOf("Hola", posicion + 1);
		}
		System.out.println(contador);
	}
}