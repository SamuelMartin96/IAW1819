package es.cj.bean;

import java.io.Serializable;

public class Vehiculo implements Serializable {

	 String IDVehiculo;
	 String Nombre;
	 String Marca;
	 Double Velocidad;
	 Double Precio;
	 String Tipo;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String iDVehiculo, String nombre, String marca, Double velocidad, Double precio, String tipo) {
		super();
		IDVehiculo = iDVehiculo;
		Nombre = nombre;
		Marca = marca;
		Velocidad = velocidad;
		Precio = precio;
		Tipo = tipo;
	}

	public String getIDVehiculo() {
		return IDVehiculo;
	}

	public void setIDVehiculo(String iDVehiculo) {
		IDVehiculo = iDVehiculo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Double getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(Double velocidad) {
		Velocidad = velocidad;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [IDVehiculo=" + IDVehiculo + ", Nombre=" + Nombre + ", Marca=" + Marca + ", Velocidad="
				+ Velocidad + ", Precio=" + Precio + ", Tipo=" + Tipo + "]";
	}
}