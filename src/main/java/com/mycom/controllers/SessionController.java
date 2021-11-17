/**
 * 
 */
package com.mycom.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mycom.dto.UsuarioDTO;

/**
 * @author Vintagestep
 * Clase que se encarga de mantener la información del usuario que ingresa a la aplicación
 * en sesión.
 */


@ManagedBean
@SessionScoped
public class SessionController {
	
	// Usuario que se mantendra en sesion

	private UsuarioDTO usuarioDTO;

	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}


	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
