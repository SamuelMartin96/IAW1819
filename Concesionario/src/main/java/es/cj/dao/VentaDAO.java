package es.cj.dao;

import java.util.List;

import es.cj.bean.Venta;
import es.cj.bean.Cliente;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface VentaDAO {

	List<Venta> listar(Conexion c, Usuario u);
	void insertar(Conexion con, Venta ven);
}