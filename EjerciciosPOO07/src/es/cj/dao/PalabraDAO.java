package es.cj.dao;

import es.cj.bean.Palabra;

public interface PalabraDAO {

	public void anadir(Palabra p);
	public boolean borrar(Palabra p);
	public boolean buscar(Palabra p);
	public String obtenerDefinicion(String palabra);
	public void listar();
}