package es.cj.dao;

import es.cj.bean.Coche;

public interface CocheDAO {

	public void insertar(Coche c);
	public void borrar(String nombre, String marca);
	public void borrarTodos();
	public Coche actualizar(Coche oldcar, Coche newcar);
	public Coche actualizarVelocidad(Coche c, int velocidad);
	public Coche buscarCochesPrecio(double precio);
	public Coche buscarCochesAnyosFabric(int anyo_ini, int anyo_fin);
	public void listar();
}