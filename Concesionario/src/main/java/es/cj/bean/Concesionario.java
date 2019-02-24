package es.cj.bean;

import java.io.Serializable;
import java.sql.Date;

public class Concesionario implements Serializable {

	private String IDConcesionario;
    private String Nombre;
    private Date FechaApertura;
    private int Cantidad;
    private String IDVehiculo;
	
    public Concesionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Concesionario(String iDConcesionario, String nombre, Date fechaApertura, int cantidad, String iDVehiculo) {
		super();
		IDConcesionario = iDConcesionario;
		Nombre = nombre;
		FechaApertura = fechaApertura;
		Cantidad = cantidad;
		IDVehiculo = iDVehiculo;
	}

	public String getIDConcesionario() {
		return IDConcesionario;
	}

	public void setIDConcesionario(String iDConcesionario) {
		IDConcesionario = iDConcesionario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombreC(String nombre) {
		Nombre = nombre;
	}

	public Date getFechaApertura() {
		return FechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		FechaApertura = fechaApertura;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public String getIDVehiculo() {
		return IDVehiculo;
	}

	public void setNombreV(String iDVehiculo) {
		IDVehiculo = iDVehiculo;
	}

	@Override
	public String toString() {
		return "Concesionario [IDConcesionario=" + IDConcesionario + ", Nombre=" + Nombre + ", FechaApertura="
				+ FechaApertura + ", Cantidad=" + Cantidad + ", IDVehiculo=" + IDVehiculo + "]";
	}
}