package com.mycom.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mycom.entity.Empleado;
import com.mycom.services.EmpleadoService;

/**
 * 
 * @author Vintagestep
 * Clase controller que se encarga de procesar la información
 * de la pantalla principal.xhtml
 */

@ManagedBean
@ViewScoped
public class MainController implements Serializable {

	private static final long serialVersionUID = 668608648621500003L;
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	/**
	 * Método que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	/**
	 * Servicio con los métodos que realizan la lógica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	/**
	 *  Método que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}
	/**
	 * Getters y Setters, necesarios para que JSF funcione
	 * @return
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
