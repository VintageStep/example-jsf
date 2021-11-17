package com.mycom.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import org.primefaces.model.FilterMeta;
import org.primefaces.model.MatchMode;

import com.mycom.entity.Empleado;
import com.mycom.entity.Estado;
import com.mycom.services.EmpleadoService;

/**
 * 
 * @author Tom
 * Clase controller que se encarga de procesar la información
 * de la pantalla principal.xhtml
 */

@ManagedBean
@ViewScoped
public class MainController implements Serializable {

	private static final long serialVersionUID = 668608648621500003L;
	
	private EmpleadoService servicio = new EmpleadoService();
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	private List<Empleado> empleadosFiltadros;
	
	private List<FilterMeta> filterBy;
	
	private Estado[]estado = {Estado.ACTIVO,Estado.INACTIVO};
	/**
	 * Método que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.empleados = this.servicio.consultarEmpleados();
		filterBy = new ArrayList<>();
        filterBy.add(FilterMeta.builder()
                .field("estado")
                .filterValue(estado)
                .matchMode(MatchMode.EQUALS)
                .build());
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

	public EmpleadoService getServicio() {
		return servicio;
	}

	public void setServicio(EmpleadoService servicio) {
		this.servicio = servicio;
	}

	public List<FilterMeta> getFilterBy() {
		return filterBy;
	}

	public void setFilterBy(List<FilterMeta> filterBy) {
		this.filterBy = filterBy;
	}

	public Estado[] getEstado() {
		return estado;
	}

	public void setEstado(Estado[] estado) {
		this.estado = estado;
	}

	public List<Empleado> getEmpleadosFiltadros() {
		return empleadosFiltadros;
	}

	public void setEmpleadosFiltadros(List<Empleado> empleadosFiltadros) {
		this.empleadosFiltadros = empleadosFiltadros;
	}
}
