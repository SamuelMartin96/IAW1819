package es.cj.dao;

import java.util.List;

import es.cj.bean.Cliente;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface ClienteDAO {

	List<Cliente> listar(Conexion c, Usuario u);
	void borrar(Conexion c, String DNIcliente);
	void insertar(Conexion con, Cliente cli);
}