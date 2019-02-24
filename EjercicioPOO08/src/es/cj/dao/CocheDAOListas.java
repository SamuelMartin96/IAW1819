package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Coche;

public class CocheDAOListas implements CocheDAO {

	private List<Coche> coches = new ArrayList<>();
	
	@Override
	public void insertar(Coche c) {
		if (!coches.contains(c)) {
			coches.add(c);
		}
	}

	@Override
	public void borrar(String nombre, String marca) {
		for (int i = 0; i < coches.size(); i++) {
			if (coches.get(i).getNombre().equals(nombre) && coches.get(i).getMarca().equals(marca)) {
				coches.remove(i);
			}
		}
	}

	@Override
	public void borrarTodos() {
		coches.clear();
	}

	@Override
	public Coche actualizar(Coche oldcar, Coche newcar) {
		for (Coche coc : coches) {
			if (coc.equals(oldcar)) {
				coc.setAnyo_fabricacion(newcar.getAnyo_fabricacion());
				coc.setVelocidad(newcar.getVelocidad());
				coc.setPrecio(newcar.getPrecio());
				coc.setNombre(newcar.getNombre());
				coc.setMarca(newcar.getMarca());
			}
		}
		return null;
	}

	@Override
	public Coche actualizarVelocidad(Coche c, int velocidad) {
		for (Coche coc : coches) {
			if (coc.equals(c)) {
				coc.setVelocidad(velocidad);
				return coc;
			}
		}
		return null;
	}

	@Override
	public Coche buscarCochesPrecio(double precio) {
		for (int i = 0; i < coches.size(); i++) {
			if (coches.get(i).getPrecio() == precio) {
				return coches.get(i);
			}
		}
		return null;
	}

	@Override
	public Coche buscarCochesAnyosFabric(int anyo_ini, int anyo_fin) {
		for (Coche coc : coches) {
			if (coc.getAnyo_fabricacion()>=anyo_ini && coc.getAnyo_fabricacion()<=anyo_fin ) {
				return coc;
			}
		}
		return null;
	}

	@Override
	public void listar() {
		for (Coche coc : coches) {
			System.out.println(coc);
		}
	}
}