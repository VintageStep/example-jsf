/**
 * 
 */
package com.mycom.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.mycom.entity.Empleado;
import com.mycom.entity.Estado;

/**
 * @author Tom
 *	Clase que permite realizar la lógica de negocio para empleados
 *	@return {@link Empleado} Lista de empleados.
 */

@ManagedBean
@ApplicationScoped
public class EmpleadoService {
	
	// List that will store the data.
	private List<Empleado> empleados;

	// 
	@PostConstruct
	public List<Empleado> consultarEmpleados() {
		// Fill a list with the data and preload it.
		empleados = new ArrayList<Empleado>();
		
		Empleado employee1 = new Empleado("Alberto","Moralez","García","consultor BBDD",Estado.ACTIVO);
		Empleado employee2 = new Empleado("German","Fernandez","Martín","supervisor de redes y equipos",Estado.ACTIVO);
		Empleado employee3 = new Empleado("Maria","García","Muñoz","programador senior",Estado.ACTIVO);
		Empleado employee4 = new Empleado("Trinidad","González","Torres","programador senior",Estado.ACTIVO);
		Empleado employee5 = new Empleado("Moreno","Dominguez","Sánchez","programador senior",Estado.INACTIVO);
		Empleado employee6 = new Empleado("Mauricio","Basurto","Gómez","programador senior",Estado.INACTIVO);
		Empleado employee7 = new Empleado("Marcelino","Valiente","Martín","programador senior",Estado.ACTIVO);
		Empleado employee8 = new Empleado("Tania","Garcia","López","programador senior",Estado.ACTIVO);
		Empleado employee9 = new Empleado("Beatriz","Nieves","Sánchez","programador senior",Estado.INACTIVO);
		Empleado employee10 = new Empleado("Cristina","Rubio","García","programador senior",Estado.INACTIVO);
		Empleado employee11 = new Empleado("Néstor","Rojas","Ortega","programador senior",Estado.INACTIVO);
		Empleado employee12 = new Empleado("Esperanza","Salcedo","Fernández","programador senior",Estado.INACTIVO);
		Empleado employee13 = new Empleado("Enrique","Asís","Gómez","programador senior",Estado.INACTIVO);
		Empleado employee14 = new Empleado("Reyes"," Oleastro","Luna","programador senior",Estado.ACTIVO);
		Empleado employee15 = new Empleado("Gracia","Banderas","López","programador senior",Estado.ACTIVO);
		
		empleados.add(employee1);
		empleados.add(employee2);
		empleados.add(employee3);
		empleados.add(employee4);
		empleados.add(employee5);
		empleados.add(employee6);
		empleados.add(employee7);
		empleados.add(employee8);
		empleados.add(employee9);
		empleados.add(employee10);
		empleados.add(employee11);
		empleados.add(employee12);
		empleados.add(employee13);
		empleados.add(employee14);
		empleados.add(employee15);
		
		return new ArrayList<>(empleados);
		
	}
	
	
	// Allows the access to the list.
	
//	public List<Empleado> getEmpleados(){
//		return new ArrayList<>(empleados);
//	}

	public Estado[] getEstado() {
		return Estado.values();
	}
}
