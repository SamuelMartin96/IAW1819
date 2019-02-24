package es.cj.dao;

import java.sql.SQLException;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface UsuarioDAO {

	public Usuario comprobarUsuario(String Username, String Password, Conexion c);
	public boolean existeUsername(String Username, Conexion c);
	public int insertar(Usuario usuario, Conexion con);
}