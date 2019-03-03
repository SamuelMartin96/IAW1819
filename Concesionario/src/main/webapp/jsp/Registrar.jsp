<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../css/bootstrap.min.css">

<script type="text/javascript" src="../js/Validaciones.js"></script>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

<title>Registro</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<h1>Registro</h1>
		</div>
		<div class="row justify-content-center">
			<%
				String error = request.getParameter("mensaje");
				if (error != null) {
			%>
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<%
					out.print(error);
				%>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<%
				}
			%>
		</div>
		<hr>
		<form class="form" method="post" action="../RegistrarUsu" onsubmit="return validarFormulario()">
			<div class="form-group">
				<label class="control-label" for="Username">Username</label>
				<input type="text" id="Username" name="Username" class="form-control">
				<span id="spUsername" style="color: red"></span>
			</div>
			<div class="form-group">
				<label class="control-label" for="Password">Password</label>
				<input type="Password" id="Password" name="Password" class="form-control">
				<span id="spPassword" style="color: red"></span>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary btn-block" value="Registrar">
			</div>
			<button type="button" class="btn btn-secondary btn-block"
					onclick="location.href='../index.jsp'"> Volver
				</button>
		</form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="../js/jquery-3.3.1.slim.min.js"></script>
	<script src="../js/popper.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>