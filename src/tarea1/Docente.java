package tarea1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Docente extends Usuario{	
	private int valorHora;
	private ArrayList<Materia> materiasQueDicta;
	
	public Docente(String nombre, String apellido, LocalDate fechaNac, int ci, int valorHora) {
		super(nombre, apellido, fechaNac, ci);
		this.valorHora = valorHora;
		this.materiasQueDicta = new ArrayList<Materia>();
	}

	public ArrayList<Materia> getMateriasQueDicta() {
		return materiasQueDicta;
	}

	public void setMateriasQueDicta(ArrayList<Materia> materiasQueDicta) {
		this.materiasQueDicta = materiasQueDicta;
	}

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
