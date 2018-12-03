package es.cj.clases;

import java.util.UUID;

	/* Haz una clase llamada Password que siga las siguientes condiciones:
	
	Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
	Los constructores serán los siguiente:
	
		Un constructor por defecto.
		
	Un constructor con la longitud que nosotros le pasemos.
	Generará una contraseña aleatoria con esa longitud (Clase java util UUID).
	
	Los métodos que implementa serán:
		esFuerte(): devuelve un booleano si es fuerte o no,
			para que sea fuerte debe tener 2 mayúsculas, 1 minúscula y 5 números.
		generarPassword():  genera la contraseña del objeto con la longitud que tenga.
		Método get para contraseña y longitud.
		Método set para longitud. */

public class Password {

	private int longitud = 8;
	private String contrasena;
	
	public Password() {
		super();
		this.contrasena = UUID.randomUUID().toString().substring(0, longitud);
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public boolean esFuerte() {
		int mayus = 0, minus = 0, numeros = 0;
		for (int i = 0; i < contrasena.length(); i++) {
			char letra = contrasena.charAt(i);
			//Mayus//
			if (Character.isUpperCase(letra)) {
				mayus++;
			} else if (Character.isLowerCase(letra)) {
				minus++;
			} else if (Character.isDigit(letra)) {
				numeros++;
			}
		}
		return (mayus >= 2) && (minus >=1 ) && (numeros >=5 );
	}
	
	public String generarPassword() {
		return  UUID.randomUUID().toString().substring(0, longitud);
	}
}