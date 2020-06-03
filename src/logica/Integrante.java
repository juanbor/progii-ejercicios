package logica;

import java.time.LocalDate;

public class Integrante {
	/*
	- id: int
	- nombre: String
	- apellido: String 
	- fechaNac: LocalDate
	*/
	
	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	
	public Integrante(int id, String nombre, String apellido, LocalDate fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
	
	
}
