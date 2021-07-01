/**
 * 
 */
package com.devmark.projectwebservices.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.devmark.projectwebservices.entity.Empleado;
import com.devmark.projectwebservices.services.EmpleadoService;

/**
 * @author marcos.hernandez
 * Web Service generado con Jersey.
 *
 */
@Path("empleados")
public class EmpleadosWS {
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@GET
	@Path("test")
	public String test() {
		return "Web Service con Jersey y Java";		
	}
	
	@GET
	@Path("listarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado findEmpleado() {		
		return this.empleadoService.findEmpleado();
	}
	
	@GET
	@Path("listarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> findAll() {
		return this.empleadoService.findAll();
	}
	
	@GET
	@Path("listarEmpleado/{idEmpleado}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("idEmpleado") Long idEmpleado) {
		
		Empleado empleadoConsultado = this.empleadoService.findById(idEmpleado);
		
		if (empleadoConsultado == null) {
			return Response.noContent().build();
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleadoConsultado, Empleado.class);
		
		return Response.ok(empleadoGeneric).build();
		
	}
	
	@POST
	@Path("guardarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Empleado empleado) {
		if (empleado == null) {
			return Response.status(400).entity("No se ingreso información del empleado. Capturar los datos.").build();			
		}
		if (empleado.getNombre() == null || empleado.getNombre().isEmpty() || empleado.getNombre().isBlank()) {
			return Response.status(400).entity("No se ingreso el nombre del empleado. Capturar los datos.").build();						
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
		
		return Response.ok(empleadoGeneric).build();
	}

}
