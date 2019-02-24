package es.cj.bean;

import java.io.Serializable;

public class Usuario implements Serializable {

	private String Username;
	private String Password;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String username, String password) {
		super();
		Username = username;
		Password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Usuario [Username=" + Username + ", Password=" + Password + "]";
	}
}