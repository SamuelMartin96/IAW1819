package es.cj.dao;

import java.util.List;

import es.cj.bean.Vehiculo;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface VehiculoDAO {

	List<Vehiculo> listar(Conexion c, Usuario u);
	Vehiculo obtenerVehiculoPorID(Conexion con, String IDVehiculo);
	void modificar(Conexion con, Vehiculo veh);
}