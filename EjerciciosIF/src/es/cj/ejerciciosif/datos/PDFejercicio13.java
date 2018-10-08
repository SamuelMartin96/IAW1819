package es.cj.ejerciciosif.datos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
	 Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m])
	 e indique el estado en el que se encuentra esa persona en función del valor de IMC: 
	 Valor de IMC Diagnóstico:
	 < 16 Criterio de ingreso en hospital 
	 de 16 a 17 infrapeso 
	 de 17 a 18 bajo peso 
	 de 18 a 25 peso normal (saludable) 
	 de 25 a 30 sobrepeso (obesidad de grado I) 
	 de 30 a 35 sobrepeso crónico (obesidad de grado II) 
	 de 35 a 40 obesidad premórbida (obesidad de grado III) 
	 >40 obesidad mórbida (obesidad de grado IV) 
	 Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
	 Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
	*/

public class PDFejercicio13 {

	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		double IMC = peso / (altura*altura);
		
		if(IMC <16) {
			System.out.println("Criterio de ingreso en hospital.");
		}else if(IMC >=16 && IMC <=17) {
			System.out.println("Infrapeso.");
		}else if(IMC >=17 && IMC <=18) {
			System.out.println("Bajo peso.");
		}else if(IMC >=18 && IMC <=25) {
			System.out.println("Peso normal (Saludable)");
		}else if(IMC >=25 && IMC <=30) {
			System.out.println("Sobrepeso (Obesidad de grado I)");
		}else if(IMC >=30 && IMC <=35) {
			System.out.println("Sobrepeso crónico (Obesidad de grado II)");
		}else if(IMC >=35 && IMC <=40) {
			System.out.println("Obesidad premórbida (Obesidad de grado III)");
		}else if(IMC >40) {
			System.out.println("Obesidad mórbida (Obesidad de grado IV)");
		}else {
			System.out.println("Corre un grave riesgo, comience a perder peso.");
		}
	sc.close();
	}
}