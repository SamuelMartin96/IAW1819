package es.cj.dao;

import java.util.List;

import es.cj.bean.Concesionario;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface ConcesionarioDAO {

	List<Concesionario> listar(Conexion c, Usuario u);
}