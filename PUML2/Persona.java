package PUML2;

import java.util.Date;
import java.util.TreeSet;

/**
 * 
 * @author Victor Balladares
 * @param <E>
 *
 */

public class Persona<E> {
	
	//******* Atributos privados ***************
	
	private String nombre;
	private String apellido;
	private Date fechaNacimiento ;
	private String nacionalidad;
	
	public class Gionista{
		public TreeSet<E> overlapping = new java.util.TreeSet<E>();
	
	}
	
	public class Director{
		public TreeSet<E> overlapping = new java.util.TreeSet<E>();
		
	}
	
	public class Actor{
		public TreeSet<E> overlapping = new java.util.TreeSet<E>();
		
	}
	
	public class Productor{
		public TreeSet<E> overlapping = new java.util.TreeSet<E>();
	}
	
	public class Editor{
		public TreeSet<E> overlapping = new java.util.TreeSet<E>();
	}

	//************** Constructor ****************
	public Persona(String nombre, String apellido, Date fechaNacimiento, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}
	
	// ********** Métodos setters and getters *****************

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	//*********** Método toString ***************

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + "]";
	}

	
	
	
	

}
