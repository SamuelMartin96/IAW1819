package es.cj.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.cj.bean.Cliente;
import es.cj.bean.Conexion;
import es.cj.bean.Usuario;
import es.cj.dao.ClienteDAO;
import es.cj.dao.ClienteDAOImpl;

/**
 * Servlet implementation class altacliente
 */
public class altacliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public altacliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String DNIcliente = request.getParameter("DNIcliente");
		String Nombre = request.getParameter("Nombre");
		int Edad = Integer.parseInt(request.getParameter("Edad"));
		
		Cliente cli = null;
		
		cli = new Cliente(DNIcliente, Nombre, Edad);
		ClienteDAO cDAO = new ClienteDAOImpl();

		// Voy a capturar los datos del web.xml
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

		// Crear un objeto de tipo Conexion con los datos anteriores
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		cDAO.insertar(con, cli);
		response.sendRedirect("jsp/listadocliente.jsp");
		
		doGet(request, response);
	}
}