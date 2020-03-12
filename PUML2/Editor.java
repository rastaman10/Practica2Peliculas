package PUML2;

/**
 * @author Victor Balladares
 */

import java.util.Date;
import java.util.TreeSet;

public class Editor<E> extends Persona<Object> {
	public TreeSet<E> overlapping = new java.util.TreeSet<E>();
	
	// ********* Constructor*********** 

	public Editor(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, TreeSet<E> overlapping) {
		super(nombre, apellido, fechaNacimiento, nacionalidad);
		this.overlapping = overlapping;
	}
	
	// Métodos setters and getters *************

	public TreeSet<E> getOverlapping() {
		return overlapping;
	}

	public void setOverlapping(TreeSet<E> overlapping) {
		this.overlapping = overlapping;
	}
	
	// ********** Método toString ***************

	@Override
	public String toString() {
		return "Editor [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getNacionalidad()=" + getNacionalidad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
