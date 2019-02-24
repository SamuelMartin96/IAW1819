package es.cj.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cj.bean.Conexion;
import es.cj.bean.Venta;
import es.cj.dao.VentaDAO;
import es.cj.dao.VentaDAOImpl;

/**
 * Servlet implementation class altaventa
 */
public class altaventa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public altaventa() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String IDVenta = request.getParameter("IDVenta");
		String IDVehiculo = request.getParameter("IDVehiculo");
		String DNIempleado = request.getParameter("DNIempleado");
		String DNIcliente = request.getParameter("DNIcliente");
		
		Venta ven = null;
		
		ven = new Venta(IDVenta, IDVehiculo, DNIempleado, DNIcliente);
		VentaDAO vDAO = new VentaDAOImpl();
		
		// Voy a capturar los datos del web.xml
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

		// Crear un objeto de tipo Conexion con los datos anteriores
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		vDAO.insertar(con, ven);
		response.sendRedirect("jsp/listadoventa.jsp");
		
		doGet(request, response);
	}
}