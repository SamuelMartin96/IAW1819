package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Cliente;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class ClienteDAOImpl implements ClienteDAO {

	public List<Cliente> listar(Conexion c, Usuario u) {
		List<Cliente> clientes = new ArrayList<Cliente>();

		String sql = "select * from CLIENTE";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Cliente auxiliar = new Cliente(resultado.getString("dNIcliente"), resultado.getString("nombre"),
						resultado.getInt("edad"));
				clientes.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}

	public void borrar(Conexion c, String DNIcliente) {
		String sql = "delete from CLIENTE where DNIcliente = ? ";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			sentencia.setString(1, DNIcliente);
			sentencia.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertar(Conexion con, Cliente cli) {
		String sql = "insert into CLIENTE values (?,?,?)";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(sql);
			sentencia.setString(1, cli.getdNIcliente());
			sentencia.setString(2, cli.getNombre());
			sentencia.setInt(3, cli.getEdad());
			sentencia.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}