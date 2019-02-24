/**
 * 
 */

function validarFormulario() {
	var username = document.getElementById("username");
	if (username.value == null || username.value.trim().length == 0) {
		document.getElementById("spUsername").innerHTML = "Debe rellenar el campo";
		return false;
	} else {
		document.getElementById("spUsername").innerHTML = "";
	}
	
	var password = document.getElementById("password");
	if (password.value == null || password.value.trim().length == 0) {
		document.getElementById("spPassword").innerHTML = "Debe rellenar el campo";
		return false;
	} else {
		document.getElementById("spPassword").innerHTML = "";
	}
}