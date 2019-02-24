package es.cj.bean;

import java.io.Serializable;

public class Venta implements Serializable {
	private String IDVenta;
    private String IDVehiculo;
    private String DNIempleado;
    private String DNIcliente;
	
    public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(String iDVenta, String iDVehiculo, String dNIempleado, String dNIcliente) {
		super();
		IDVenta = iDVenta;
		IDVehiculo = iDVehiculo;
		DNIempleado = dNIempleado;
		DNIcliente = dNIcliente;
	}

	public String getIDVenta() {
		return IDVenta;
	}

	public void setIDVenta(String iDVenta) {
		IDVenta = iDVenta;
	}

	public String getIDVehiculo() {
		return IDVehiculo;
	}

	public void setIDVehiculo(String iDVehiculo) {
		IDVehiculo = iDVehiculo;
	}

	public String getDNIempleado() {
		return DNIempleado;
	}

	public void setDNIempleado(String dNIempleado) {
		DNIempleado = dNIempleado;
	}

	public String getDNIcliente() {
		return DNIcliente;
	}

	public void setDNIcliente(String nombreC) {
		DNIcliente = nombreC;
	}

	@Override
	public String toString() {
		return "Venta [IDVenta=" + IDVenta + ", IDVehiculo=" + IDVehiculo + ", DNIempleado=" + DNIempleado + ", DNIcliente=" + DNIcliente + "]";
	}
}