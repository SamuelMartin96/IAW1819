package es.cj.clases;

public class Circulo {

	private double radio;
	private Punto centro;
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	public Circulo(double radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}
	
	public Circulo(double radio, double x, double y) {
		this.centro = new Punto(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	public double calcularDistanciaDesde(Punto p) {
		return this.centro.calcularDistanciaDesde(p);
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcularPerimetro() {
		return 2* Math.PI * radio;
	}
}