package tarea2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Masajista extends Integrante{
	private ArrayList<Integrante> integrantes;

	public Masajista(int id, String nombre, String apellido, LocalDate fechaNac) {
		super(id, nombre, apellido, fechaNac);
		this.integrantes = integrantes;
		this.integrantes = new ArrayList<Integrante>();
	}

	public ArrayList<Integrante> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}
	
}
