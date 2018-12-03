package es.cj.main;

import java.util.Random;
import java.util.Scanner;

import es.cj.clases.Password;

	/* Ahora, crea una clase clase ejecutable:

	Crea un array de Passwords con el tamaño que tu le indiques por teclado.
	Crea un bucle que cree un objeto para cada posición del array.
	Indica también por teclado la longitud de los Passwords (antes de bucle).
	Crea otro array de booleanos donde se almacene
		si el password del array de Password es o no fuerte (usa el bucle anterior).
	Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato: 
	
	contraseña1 valor_booleano1
	contraseña2 valor_bololeano2 */

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	private static Password p [];
	
	public static void main(String[] args) {
		System.out.println("Nº de Password: ");
		int numpass = sc.nextInt();
		
		p = new Password[numpass];
		
		crearPassword();
		
		mostrarPasswords();
		
		comprobarFuerte();
		
	sc.close();
	}

	private static void comprobarFuerte() {
		for (int i = 0; i < p.length; i++) {
			if (p[i].esFuerte()) {
				System.out.println("La contraseña " + p[i].getContrasena() + " es fuerte.");
			}else {
				System.out.println("La contraseña " + p[i].getContrasena() + " no es fuerte.");
			}
		}
	}

	private static void crearPassword() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Password(new Random().nextInt(15) + 8);
		}
	}

	private static void mostrarPasswords() {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getContrasena());
		}
	}
}