package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Venta;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class VentaDAOImpl implements VentaDAO {

	public List<Venta> listar(Conexion c, Usuario u) {
		List<Venta> ventas = new ArrayList<Venta>();

		String sql = "select * from VENTA";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Venta auxiliar = new Venta(resultado.getString("iDVenta"), resultado.getString("iDVehiculo"), resultado.getString("dNIempleado"), resultado.getString("dNIcliente"));
				ventas.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ventas;
	}

	public void insertar(Conexion con, Venta ven) {
		String sql = "insert into VENTA values (?,?,?,?)";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(sql);
			sentencia.setString(1, ven.getIDVenta());
			sentencia.setString(2, ven.getIDVehiculo());
			sentencia.setString(3, ven.getDNIempleado());
			sentencia.setString(4, ven.getDNIcliente());
			sentencia.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}