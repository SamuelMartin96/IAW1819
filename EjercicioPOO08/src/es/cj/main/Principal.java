package es.cj.main;

import es.cj.bean.Coche;
import es.cj.dao.CocheDAO;
import es.cj.dao.CocheDAOListas;

public class Principal {

	public static void main(String[] args) {
		CocheDAO cDAO = new CocheDAOListas();
		
		Coche c1 = new Coche(2018, 200, 12000, "Pepe", "Ford");
		Coche c2 = new Coche(2013, 150, 210.500, "Adrian", "BMW");
		Coche c3 = new Coche(2016, 120, 90.000, "Antonio", "Toyota");
		
		cDAO.insertar(c1);
		cDAO.insertar(c2);
		cDAO.insertar(c3);
		
		cDAO.borrar("Antonio", "Toyota");
		
		cDAO.actualizarVelocidad(c1, 250);
		
		System.out.println(cDAO.buscarCochesPrecio(12000));
		
		System.out.println(cDAO.buscarCochesAnyosFabric(2012, 2013));
		
		cDAO.listar();
	}
}