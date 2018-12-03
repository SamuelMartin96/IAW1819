package es.cj.clases;

public class libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public boolean incrementarAtributos( ) {
		boolean LibroPrestado = true;
        if (prestados < ejemplares) {
            prestados++;
            ejemplares--;
        } else {
            LibroPrestado = false;
            
        }
        return LibroPrestado;
	}
	
	 public boolean decrementarAtributos() {
		 boolean LibroDevuelto = true;
	     if (prestados == 0) {
	    	 LibroDevuelto = false;
	     } else {
	    	prestados--;
	    	ejemplares++;
	     }
	     return LibroDevuelto;
	  }

	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
}