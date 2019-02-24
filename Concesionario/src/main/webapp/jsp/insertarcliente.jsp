<!DOCTYPE html>
<%@page import="es.cj.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="es.cj.dao.ClienteDAOImpl"%>
<%@page import="es.cj.dao.ClienteDAO"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="es.cj.bean.Conexion"%>
<%@ page import="es.cj.bean.Cliente"%>
<%@ page import="java.sql.ResultSet"%>
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
	<h1 style="text-align: center;">ALTA DE CLIENTES</h1>
	<div class="row justify-content-center">
		<div class="container">
			<div class="row vertical-offset-100">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div align="center">
							<%
								if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
									response.sendRedirect("../index.jsp?mensaje=Error de sesión");
								} else {
							%>
							<form class="form" method="post" action="../altacliente">
								<fieldset>
									<div class="row cold-md-12 text-center"></div>
									<label>DNI</label> <input class="form-control"
										placeholder="DNIcliente" name="DNIcliente" type="text">
									<br> <label>NOMBRE</label> <input class="form-control"
										placeholder="Nombre" name="Nombre" type="text"> <br>
									<label>EDAD</label> <input class="form-control"
										placeholder="Edad" name="Edad" type="number"> <br>
									<button type="submit" class="btn btn-lg btn-success"
										onclick="location.href='listadocliente.jsp'">Enviar</button>
								</fieldset>
							</form>
							<br>
							<form action="<%=request.getContextPath()%>" method="post"
								style="display: inline">
								<button type="button" class="btn btn-secondary btn-block"
									onclick="location.href='../MenuPrincipal.jsp'">Volver</button>
							</form>
							<%
								}
							%>
						</div>
					</div>
				</div>
			</div>
		</div>
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