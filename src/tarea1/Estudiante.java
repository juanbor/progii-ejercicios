package tarea1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante extends Usuario{
	private ArrayList<Materia> materiasQueCursa;
	
	public Estudiante(String nombre, String apellido, LocalDate fechaNac, int ci) {
		super(nombre, apellido, fechaNac, ci);
		this.materiasQueCursa = new ArrayList<Materia>();
	}
	
	public ArrayList<Materia> getArrayMateriasQueCursa(){
		return this.materiasQueCursa;
	}
	
	public void addMateriaQueCursa(Materia mat) {
		this.materiasQueCursa.add(mat);
	}
}
