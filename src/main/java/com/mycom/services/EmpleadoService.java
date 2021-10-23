/**
 * 
 */
package com.mycom.services;

import java.util.ArrayList;
import java.util.List;

import com.mycom.entity.Empleado;

/**
 * @author Tom
 *	Clase que permite realizar la lógica de negocio para empleados
 *	@return {@link Empleado} Lista de empleados.
 */
public class EmpleadoService {
	
	// Método que permite consultar la lista de empleados
	
	public List<Empleado> consultarEmpleados(){
		
		// Instanciar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado("Alberto","Garcia","Pelayo","consultor BBDD",true);
		Empleado empleadoMicro = new Empleado("German","Fernandez","Torres","supervisor de redes y equipos",true);
		Empleado empleadoApple = new Empleado("Maria","Garcia","Paredes","programador senior",true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicro);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
