package es.cj.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;
import es.cj.bean.Vehiculo;
import es.cj.dao.VehiculoDAO;
import es.cj.dao.VehiculoDAOImpl;

/**
 * Servlet implementation class modificarvehiculo
 */
public class modificarvehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarvehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String IDVehiculo = request.getParameter("IDVehiculo");
		String Nombre = request.getParameter("Nombre");
		String Marca = request.getParameter("Marca");
		double Velocidad = Double.parseDouble(request.getParameter("Velocidad"));
		double Precio =  Double.parseDouble(request.getParameter("Precio"));
		String Tipo = request.getParameter("Tipo");
		
		HttpSession session = request.getSession();
		String Username = ((Usuario) session.getAttribute("usuarioWeb")).getUsername();
		
		Vehiculo veh = new Vehiculo (IDVehiculo, Nombre, Marca, Velocidad, Precio, Tipo);
		
		VehiculoDAO vDAO = new VehiculoDAOImpl();
		
		// Voy a capturar los datos del web.xml
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

		// Crear un objeto de tipo Conexion con los datos anteriores
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		vDAO.modificar(con, veh);
		response.sendRedirect("jsp/listadovehiculo.jsp");
		
		doGet(request, response);
	}
}