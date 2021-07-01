/**
 * 
 */
package com.devmark.projectwebservices.entity;

import java.time.LocalDateTime;

/**
 * @author marcos.hernandez
 * 
 * Entity de empleado
 *
 */
public class Empleado {
	
	private Long idEmpleado;
	
	private String nombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private int edad;
	
	private LocalDateTime fechaCreacion;
	
	/**
	 * Constructor por default
	 */
	public Empleado() {
	}

	/**
	 * Constructor sobrecargado
	 * @param idEmpleado
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param edad
	 * @param fechaCreacion
	 */
	public Empleado(Long idEmpleado, String nombre, String primerApellido, String segundoApellido, int edad,
			LocalDateTime fechaCreacion) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.fechaCreacion = fechaCreacion;
	}



	/**
	 * @return the idEmpleado
	 */
	public Long getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
