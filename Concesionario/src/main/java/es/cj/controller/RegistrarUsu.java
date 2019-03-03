package es.cj.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;
import es.cj.dao.UsuarioDAO;
import es.cj.dao.UsuarioDAOImpl;

/**
 * Servlet implementation class registrarUsuario
 */
public class RegistrarUsu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarUsu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");

		// Voy a capturar los datos del web.xml
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

		// Crear un objeto de tipo Conexion con los datos anteriores
		Conexion con = new Conexion(usu, pass, driver, bd);

		Usuario usuario = new Usuario(Username, Password);

		UsuarioDAO uDAO = new UsuarioDAOImpl();

		if (!uDAO.existeUsername(Username, con)) {
			int filas = uDAO.insertar(usuario, con);
			if (filas == 1) {
				response.sendRedirect("jsp/Registrar.jsp?mensaje=Usuario registrado correctamente");
			} else {
				response.sendRedirect("jsp/Registrar.jsp?mensaje=Error al registrar al usuario");
			} 
		} else {
			response.sendRedirect("jsp/Registrar.jsp?mensaje=El usuario ya existe");
		}
	}
}