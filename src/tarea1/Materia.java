package tarea1;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private int cantHoras;
	private ArrayList<Estudiante> estudiantesQueCursanLaMateria;
	private ArrayList<Docente> docentesQueDictanLaMateria;
	
	public Materia(String nombre, int cantHoras) {
		super();
		this.nombre = nombre;
		this.cantHoras = cantHoras;
		this.estudiantesQueCursanLaMateria = new ArrayList<Estudiante>();
		this.docentesQueDictanLaMateria = new ArrayList<Docente>();
	}
	
	// get y set
	public ArrayList<Estudiante> getEstudiantesQueCursanLaMateria() {
		return estudiantesQueCursanLaMateria;
	}

	public void setEstudiantesQueCursanLaMateria(ArrayList<Estudiante> estudiantesQueCursanLaMateria) {
		this.estudiantesQueCursanLaMateria = estudiantesQueCursanLaMateria;
	}
	
	public ArrayList<Docente> getDocentesQueDictanLaMateria() {
		return docentesQueDictanLaMateria;
	}

	public void setDocentesQueDictanLaMateria(ArrayList<Docente> docentesQueDictanLaMateria) {
		this.docentesQueDictanLaMateria = docentesQueDictanLaMateria;
	}

	// add y getU
	public void addEstudianteQueCursaLaMateria(Estudiante e) {
		this.estudiantesQueCursanLaMateria.add(e);
	}
	
	public void addDocenteQueDictaLaMateria(Docente d) {
		this.docentesQueDictanLaMateria.add(d);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	
}
