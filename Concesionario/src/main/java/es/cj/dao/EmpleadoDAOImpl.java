package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Empleado;
import es.cj.bean.Concesionario;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class EmpleadoDAOImpl implements EmpleadoDAO {

	public List<Empleado> listar(Conexion c, Usuario u) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		String sql = "select * from EMPLEADO";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Empleado auxiliar = new Empleado(resultado.getString("dNIempleado"), resultado.getString("nombre"), resultado.getDate("fechaNacimi"), resultado.getString("iDConcesionario"));
				empleados.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleados;
	}
}