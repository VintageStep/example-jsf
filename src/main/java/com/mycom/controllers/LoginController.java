/**
 * 
 */
package com.mycom.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.mycom.dto.UsuarioDTO;

/**
 * @author Tom
 * Clase que permite controlar el funcionamiento de la pantqalla de login.xhtml
 */
@ManagedBean
public class LoginController {

	// Atributos
	
	private String usuario;
	private String password;
	
	// Bean que mantiene la informacion en sesion
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	// Constructores
	
	public LoginController() {
		super();
	}
	
	// Método que permite ingresar a la pantalla principal del proyecto.
	
	public void ingresar() {
		if (usuario.equals("tom")&& password.equals("12345")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));
		}
	}
	
	private void redireccionar (String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	// Getters y Settrers
	
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

	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
	
}
