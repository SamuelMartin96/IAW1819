package es.cj.bean;

public class Coche {

	private int anyo_fabricacion;
	private int velocidad;
	private double precio;
	private String nombre;
	private String marca;
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(int anyo_fabricacion, int velocidad, double precio, String nombre, String marca) {
		super();
		this.anyo_fabricacion = anyo_fabricacion;
		this.velocidad = velocidad;
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
	}

	public int getAnyo_fabricacion() {
		return anyo_fabricacion;
	}

	public void setAnyo_fabricacion(int anyo_fabricacion) {
		this.anyo_fabricacion = anyo_fabricacion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [anyo_fabricacion=" + anyo_fabricacion + ", velocidad=" + velocidad + ", precio=" + precio
				+ ", nombre=" + nombre + ", marca=" + marca + "]";
	}
}