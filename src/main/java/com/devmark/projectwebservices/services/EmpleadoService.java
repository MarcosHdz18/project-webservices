/**
 * 
 */
package com.devmark.projectwebservices.services;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.devmark.projectwebservices.entity.Empleado;

/**
 * @author marcos.hernandez
 *
 */
public class EmpleadoService {
	
	/**
	 * Metodo que obtiene un empleado por su identificador unico
	 * @param idEmpleado parametro a buscar
	 * @return {@link Empleado} Objeto de tipo empleado
	 */
	public Empleado findById(Long idEmpleado) {
		
		List<Empleado> empleados = this.findAll();
		
		for (Empleado empleado : empleados) {
			if (empleado.getIdEmpleado().equals(idEmpleado)) {
				return empleado;
			}
		}
		
		return null;
	}
	
	/**
	 * Metodo que obtiene un solo empleado
	 * @return {@link Empleado} Objeto de tipo empleado
	 */
	public Empleado findEmpleado() {

		Empleado empleado = new Empleado(12546978L, "Marcos Salvador", "Hernández", "Guadarrama", 30,
				LocalDateTime.now());

		return empleado;
	}
	
	/**
	 * Metodo que obtiene una lista de empleados
	 * @return {@link List<Empleado>} Lista de objetos de tipo Empleado
	 */
	public List<Empleado> findAll() {
		List<Empleado> empleados = Arrays.asList(new Empleado(254897L, "Marcos Salvador", "Hernández", "Guadarrama", 30, LocalDateTime.now()),
				new Empleado(254898L, "Luis Felipe", "Hernández", "Guadarrama", 28, LocalDateTime.now()),
				new Empleado(254899L, "Luisa Gemila", "Hernández", "Guadarrama", 27, LocalDateTime.now()),
				new Empleado(254900L, "Ximena Daelyn", "Hernández", "Vera", 9, LocalDateTime.now()));
		return empleados;
	}

}
