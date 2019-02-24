package es.cj.bean;

import java.sql.Date;

public class Empleado {

	private String DNIempleado;
    private String Nombre;
    private Date FechaNacimi;
    private String IDConcesionario;
	
    public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String dNIempleado, String nombre, Date fechaNacimi, String iDConcesionario) {
		super();
		DNIempleado = dNIempleado;
		Nombre = nombre;
		FechaNacimi = fechaNacimi;
		IDConcesionario = iDConcesionario;
	}

	public String getDNIempleado() {
		return DNIempleado;
	}

	public void setDNIempleado(String dNIempleado) {
		DNIempleado = dNIempleado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Date getFechaNacimi() {
		return FechaNacimi;
	}

	public void setFechaNacimi(Date fechaNacimi) {
		FechaNacimi = fechaNacimi;
	}

	public String getIDConcesionario() {
		return IDConcesionario;
	}

	public void setConc(String iDConcesionario) {
		IDConcesionario = iDConcesionario;
	}

	@Override
	public String toString() {
		return "Empleado [DNIempleado=" + DNIempleado + ", Nombre=" + Nombre + ", FechaNacimi=" + FechaNacimi
				+ ", IDConcesionario=" + IDConcesionario + "]";
	}
}