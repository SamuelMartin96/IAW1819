<%@page import="es.cj.bean.Empleado"%>
<%@page import="es.cj.dao.EmpleadoDAOImpl"%>
<%@page import="es.cj.dao.EmpleadoDAO"%>
<%@page import="es.cj.bean.Vehiculo"%>
<%@page import="es.cj.dao.VehiculoDAOImpl"%>
<%@page import="es.cj.dao.VehiculoDAO"%>
<%@page import="es.cj.dao.ClienteDAO"%>
<%@page import="es.cj.dao.ClienteDAOImpl"%>
<%@page import="es.cj.bean.Cliente"%>
<%@page import="es.cj.bean.Usuario"%>
<%@page import="es.cj.dao.VentaDAOImpl"%>
<%@page import="es.cj.bean.Venta"%>
<%@page import="java.util.List"%>
<%@page import="es.cj.dao.VentaDAO"%>
<%@page import="es.cj.bean.Conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body class="bg-white">
	<header></header>
	<br>
	<h1 style="text-align: center;">LISTADO DE VENTAS</h1>
	<div class="col-md-1"></div>
	<div class="col-md-14">
		<table class="table table-striped table-white table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>VEHICULO</th>
					<th>EMPLEADO</th>
					<th>CLIENTE</th>
				</tr>
			</thead>
			<%
				if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
					response.sendRedirect("../index.jsp?mensaje=Error de sesi�n");
				} else {
					// Voy a capturar los datos del web.xml
					ServletContext sc = getServletContext();
					String usu = sc.getInitParameter("usuario");
					String pass = sc.getInitParameter("password");
					String driver = sc.getInitParameter("driver");
					String bd = sc.getInitParameter("database");

					// Crear un objeto de tipo Conexion con los datos anteriores
					Conexion con = new Conexion(usu, pass, driver, bd);

					VentaDAO vDAO = new VentaDAOImpl();
					List<Venta> ventas = vDAO.listar(con, (Usuario) session.getAttribute("usuarioWeb"));	
			%>
			<div class="row cold-md-12 text-center">
				<%
					for (Venta v:ventas) {
				%>
				<tr>
					<td><%=v.getIDVenta()%></td>
					<td><%=v.getIDVehiculo()%></td>
					<td><%=v.getDNIempleado()%></td>
					<td><%=v.getDNIcliente()%></td>
				</tr>
				<%
					}
				%>
			</div>
			<%
				}
			%>
		</table>
		<center>
			<form action="<%=request.getContextPath()%>" method="GET"
				style="display: inline">
				<button type="button" class="btn btn-secondary btn-block"
					onclick="location.href='../MenuPrincipal.jsp'">Volver</button>
			</form>
		</center>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>
</html>