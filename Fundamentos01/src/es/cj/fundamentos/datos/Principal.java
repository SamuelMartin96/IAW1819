package es.cj.fundamentos.datos;

public class Principal {
	public static void main(String[] args) {
		//TIPOS DE VARIABLES//
		
		//TIPOS ENTEROS//
		byte b; //-128 a +127 (8 bits)//
		short sh; //-32768 a +32767 (16 bits)//
		int i; //(32 bits)//
		long l; //(64 bits)//
		
		char c; //0 a 65535//
		char ch = 71;
		System.out.println(ch);
		
		//TIPOS REALES//
		float f = 3.1416F; //(32 bits)//
		double d = 3.1416; //(64 bits)//
		
		double pi = Math.PI;
		System.out.println(pi);
		
		//TIPO LÓGICO//
		boolean bol = true;
		
		//TIPOS COMPLEJOS//
		Byte by;
		Integer ii;
		Short sho;
		Long ll;
		Character cha;
		Boolean bool;
		
		//TIPO CADENA//
		String cadena = "LO QUE SEA";
		System.out.println(cadena);
	}
}