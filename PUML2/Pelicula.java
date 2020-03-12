package PUML2;

import java.net.URI;
import java.sql.Time;
import java.util.Date;

import PUml.Genero;

public class Pelicula extends Persona<Object>{
	
	private String titulo;
	private Time agno;
	private String sipnosis;
	private Genero genero;
	private String pais;
	private URI url;
	private Time duracion;
	
	


	public Pelicula(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String titulo, Time agno,
			String sipnosis, Genero genero, String pais){
		super(nombre, apellido, fechaNacimiento, nacionalidad);
		this.titulo = titulo;
		this.agno = agno;
		this.sipnosis = sipnosis;
		this.genero = genero;
		this.pais = pais;
	
		
		
	
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Time getAgno() {
		return agno;
	}


	public void setAgno(Time agno) {
		this.agno = agno;
	}


	public String getSipnosis() {
		return sipnosis;
	}


	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	public Time getDuracion() {
		return duracion;
	}


	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public URI getUrl() {
		return url;
	}


	public void setUrl(URI url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", agno=" + agno + ", sipnosis=" + sipnosis + ", genero=" + genero
				+ ", pais=" + pais + "]";
	}




	
}
