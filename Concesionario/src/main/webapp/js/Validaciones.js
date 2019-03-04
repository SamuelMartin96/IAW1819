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
	
	function validarFormularioCliente() {
		var dNIcliente = document.getElementById("dNIcliente");
		if (dNIcliente.value == null || dNIcliente.value.trim().length == 0) {
			document.getElementById("spDNI").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spDNI").innerHTML = "";
		}
		
		var nombre = document.getElementById("nombre");
		if (nombre.value == null || nombre.value.trim().length == 0) {
			document.getElementById("spNombre").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spNombre").innerHTML = "";
		}
		
		var edad = document.getElementById("edad");
		if (edad.value == null || edad.value.trim().length == 0) {
			document.getElementById("spEdad").innerHTML = "Debe rellenar el campo";
			return false;
		} else {
			document.getElementById("spEdad").innerHTML = "";
		}
	}
	
	function validarFormularioVentas() {
		var iDVenta = document.getElementById("iDVenta");
		if (iDVenta.value == null || iDVenta.value.trim().length == 0) {
			document.getElementById("spiDVenta").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spiDVenta").innerHTML = "";
		}
		
		var iDVehiculo = document.getElementById("iDVehiculo");
		if (iDVehiculo.value == null || iDVehiculo.value.trim().length == 0) {
			document.getElementById("spiDVehiculo").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spiDVehiculo").innerHTML = "";
		}
		
		var dNIempleado = document.getElementById("dNIempleado");
		if (dNIempleado.value == null || dNIempleado.value.trim().length == 0) {
			document.getElementById("spdNIempleado").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spdNIempleado").innerHTML = "";
		}
		
		var dNIcliente = document.getElementById("dNIcliente");
		if (dNIcliente.value == null || dNIcliente.value.trim().length == 0) {
			document.getElementById("spdNIcliente").innerHTML = "Debe rellenar el campo";
		} else {
			ocument.getElementById("spdNIcliente").innerHTML = "";
		}
	}
}