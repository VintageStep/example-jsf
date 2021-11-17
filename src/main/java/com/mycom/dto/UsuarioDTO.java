/**
 * 
 */
package com.mycom.dto;

/**
 * @author VintageStep
 * Clase que permitira contener la informacion del usuario en sesion
 *
 */
public class UsuarioDTO {
	
	private String usuario;
	private String password;
	
	
	public UsuarioDTO() {
		super();
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
