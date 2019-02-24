package es.cj.bean;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String DNIcliente;
    private String Nombre;
    private int Edad;
	
    public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String dNIcliente, String nombre, int edad) {
		super();
		DNIcliente = dNIcliente;
		Nombre = nombre;
		Edad = edad;
	}

	public String getdNIcliente() {
		return DNIcliente;
	}

	public void setDNIcliente(String dNIcliente) {
		DNIcliente = dNIcliente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [DNIcliente=" + DNIcliente + ", Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}
}