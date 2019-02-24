package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Concesionario;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class ConcesionarioDAOImpl implements ConcesionarioDAO {

	public List<Concesionario> listar(Conexion c, Usuario u) {
		List<Concesionario> concesionarios = new ArrayList<Concesionario>();

		String sql = "select * from CONCESIONARIO";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Concesionario auxiliar = new Concesionario(resultado.getString("iDConcesionario"), resultado.getString("nombre"), resultado.getDate("fechaApertura"), resultado.getInt("cantidad"), resultado.getString("idvehiculo"));
				concesionarios.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return concesionarios;
	}
}