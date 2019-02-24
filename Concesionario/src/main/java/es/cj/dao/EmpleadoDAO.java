package es.cj.dao;

import java.util.List;

import es.cj.bean.Empleado;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface EmpleadoDAO {

	List<Empleado> listar(Conexion c, Usuario u);
}