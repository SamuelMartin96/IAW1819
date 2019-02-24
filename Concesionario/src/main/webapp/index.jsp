<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">

<title>Registro</title>
</head>
<body class="text-center" background="Imagenes/FondoLogin.png">
	<div class="container">
		<div class="row justify-content-center"></div>
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
		<div class="row justify-content-center">
			<form role="form" method="POST" action="ValidarUsuario">
				<img class="mb-4" src="Imagenes/LogoLogin.png" alt="" width="100"
					height="100">
				<h1 class="h3 mb-3 font-weight-normal">Iniciar Sesión</h1>
				<div class="form-group">
					<label for="usuario"></label> <input type="text"
						class="form-control" placeholder="Usuario" id="usuario"
						name="usuario" aria-describedby="usuarioHelp" autofocus
						required="required">
				</div>
				<div class="form-group">
					<label for="password"></label> <input type="password"
						class="form-control" placeholder="Password" id="password"
						name="password" required="required">
				</div>
				<button type="submit" class="btn btn-primary">
					<i class="fas fa-share-square"></i> Entrar
				</button>
				<button type="button" class="btn btn-secondary"
					onclick="location.href='jsp/Registrar.jsp'">
					<i class="fas fa-user-plus"></i> Registrar
				</button>
				<p class="mt-4 mb-3 text-muted">&copy; 2019-2020</p>
			</form>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.3.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>