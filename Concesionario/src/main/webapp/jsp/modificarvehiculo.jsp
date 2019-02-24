<!DOCTYPE html>
<%@page import="es.cj.bean.Vehiculo"%>
<%@page import="es.cj.dao.VehiculoDAOImpl"%>
<%@page import="es.cj.dao.VehiculoDAO"%>
<%@page import="es.cj.bean.Conexion"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<html lang="en">
<head>
    <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">   
</head>
  <body class="bg-white">
    <header></header>
 <br>
 <%
	if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
		response.sendRedirect("../index.jsp?mensaje=Error de sesión");
	} else {
		// Voy a capturar los datos del web.xml
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

	// Crear un objeto de tipo Conexion con los datos anteriores
	Conexion con = new Conexion(usu, pass, driver, bd);
	
	VehiculoDAO vDAO = new VehiculoDAOImpl();
	Vehiculo vaux = vDAO.obtenerVehiculoPorID(con,(String)request.getParameter("IDVehiculo"));
	%>
  <h1 style="text-align:center;"> MODIFICACIÓN DE VEHÍCULO </h1>
        <br>
      <center>
        	<form class="form" method="post" action="../modificarvehiculo">
        	<input type="hidden" name="IDVehiculo" id="IDVehiculo" value="<%=vaux.getIDVehiculo()%>">
        		<div class="form-group">
        			<label class="control-label" for="Nombre">Nombre</label>
        			<input type="text" id="Nombre" name="Nombre" class="form-control" value="<%=vaux.getNombre()%>">
        		</div>
        		<div class="form-group">
        			<label class="control-label" for="Marca">Marca</label>
        			<input type="text" id="Marca" name="Marca" class="form-control" value="<%=vaux.getMarca()%>">
        		</div>
        		<div class="form-group">
        			<label class="control-label" for="Velocidad">Velocidad</label>
        			<input type="number" id="Velocidad" name="Velocidad" class="form-control" value="<%=vaux.getVelocidad()%>">
        		</div>
        		<div class="form-group">
        			<label class="control-label" for="Precio">Precio</label>
        			<input type="text" id="Precio" name="Precio" class="form-control" value="<%=vaux.getPrecio()%>">
        		</div>
        		<div class="form-group">
        			<label class="control-label" for="Tipo">Tipo</label>
        			<input type="text" id="Tipo" name="Tipo" class="form-control" value="<%=vaux.getTipo()%>">
        		</div>
        		<br>
				<button type="submit" class="btn btn-lg btn-success">Modificar</button>
            </fieldset>
            </form>
        <br>
        <form action="<%=request.getContextPath()%>" method="post" style="display:inline">
            <button type="button" class="btn btn-secondary btn-block"
					onclick="location.href='listadovehiculo.jsp'">Volver</button>
        </form>
         <% } %>
         	</form>
        </center>
        <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </body>
</html>