package es.cj.bean;

public class Palabra {

	private String palabra;
	private String definicion;
	
	public Palabra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Palabra(String palabra, String definicion) {
		super();
		this.palabra = palabra;
		this.definicion = definicion;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + ", definicion=" + definicion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((definicion == null) ? 0 : definicion.hashCode());
		result = prime * result + ((palabra == null) ? 0 : palabra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabra other = (Palabra) obj;
		if (definicion == null) {
			if (other.definicion != null)
				return false;
		} else if (!definicion.equals(other.definicion))
			return false;
		if (palabra == null) {
			if (other.palabra != null)
				return false;
		} else if (!palabra.equals(other.palabra))
			return false;
		return true;
	}
}