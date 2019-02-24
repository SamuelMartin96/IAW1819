package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Vehiculo;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class VehiculoDAOImpl implements VehiculoDAO {

	public List<Vehiculo> listar(Conexion c, Usuario u) {
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		
		String sql = "select * from VEHICULO";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Vehiculo auxiliar = new Vehiculo(resultado.getString("IDVehiculo"), resultado.getString("Nombre"), resultado.getString("Marca"), resultado.getDouble("Velocidad"), resultado.getDouble("Precio"), resultado.getString("Tipo"));
				vehiculos.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehiculos;
	}

	public Vehiculo obtenerVehiculoPorID(Conexion con, String IDVehiculo) {
		Vehiculo vaux = new Vehiculo();
		
		String sql = "select * from VEHICULO where IDVehiculo = ?";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(sql);
			sentencia.setString(1, IDVehiculo);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				vaux  = new Vehiculo(resultado.getString("IDVehiculo"), resultado.getString("Nombre"), resultado.getString("Marca"), resultado.getDouble("Velocidad"), resultado.getDouble("Precio"), resultado.getString("Tipo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vaux;
	}

	public void modificar(Conexion con, Vehiculo veh) {
		String sql = "update VEHICULO set Nombre=?, Marca=?, Velocidad=?, Precio=?, Tipo=? where IDVehiculo=?";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(sql);
			sentencia.setString(1, veh.getNombre());
			sentencia.setString(2, veh.getMarca());
			sentencia.setDouble(3, veh.getVelocidad());
			sentencia.setDouble(4, veh.getPrecio());
			sentencia.setString(5, veh.getTipo());
			sentencia.setString(6, veh.getIDVehiculo());
			sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}