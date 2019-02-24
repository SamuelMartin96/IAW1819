package es.cj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	public Usuario comprobarUsuario(String Username, String Password, Conexion c) {
		Usuario u = null;

		String query = "SELECT * FROM USUARIO WHERE Username = ? AND Password = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			sentencia.setString(1, Username);
			sentencia.setString(2, Password);
			// Ejecutamos la consulta//
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				u = new Usuario(resultado.getString("Username"), resultado.getString("Password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public boolean existeUsername(String Username, Conexion c) {
		boolean existe = false;

		String sql = "SELECT * FROM USUARIO WHERE Username = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			sentencia.setString(1, Username);
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return existe;
	}

	public int insertar(Usuario usuario, Conexion con) {
		int filas = 0;
		String sql = "insert into USUARIO values (?, ?)";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(sql);
			sentencia.setString(1, usuario.getUsername());
			sentencia.setString(2, usuario.getPassword());
			filas = sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}
}