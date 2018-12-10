package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Palabra;
import es.cj.dao.PalabraDAO;

public class PalabraDAOListas implements PalabraDAO {

	private List<Palabra> diccionario = new ArrayList<>();
	
	@Override
	public void anadir(Palabra p) {
		if (!diccionario.contains(p)) {
			diccionario.add(p);
		}
	}

	@Override
	public boolean borrar(Palabra p) {
		return diccionario.remove(p);
	}

	@Override
	public boolean buscar(Palabra p) {
		return diccionario.contains(p);
	}

	@Override
	public String obtenerDefinicion(String palabra) {
		for (Palabra pal : diccionario) {
			if (pal.getPalabra().equalsIgnoreCase(palabra)) {
				return pal.getDefinicion();
			}
		}
		return "";
	}

	@Override
	public void listar() {
		for (Palabra palabra : diccionario) {
			System.out.println(palabra);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diccionario == null) ? 0 : diccionario.hashCode());
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
		PalabraDAOListas other = (PalabraDAOListas) obj;
		if (diccionario == null) {
			if (other.diccionario != null)
				return false;
		} else if (!diccionario.equals(other.diccionario))
			return false;
		return true;
	}
}