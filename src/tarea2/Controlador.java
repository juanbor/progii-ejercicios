package tarea2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controlador {
	
	/*
	 public void crearFutbolista(int id, String nombre, String apellido,
	LocalDate fechaNac, int dorsal)
	Descripci´on: Esta operaci´on crea un Futbolista en el sistema y lo
	persiste.
	(b) public void crearEntrenador(int id, String nombre, String apellido,
	LocalDate fechaNac, int idFederacion)
	Descripci´on: Esta operaci´on crea un Entrenador en el sistema y lo
	persiste.
	1
	(c) public void crearMasajista(int id, String nombre, String apellido, LocalDate fechaNac, ArrayList<Integrante> integrantes)
	Descripci´on: Esta operaci´on crea un Masajista en el sistema y lo
	persiste.
	(d) public void darDeBajaIntegrante(int id)
	Descripci´on: Esta operaci´on busca al integrante de id ”id” y lo elimina del sistema.
	(e) public Integrante consultarIntegrante(int id)
	Descripci´on: Esta operaci´on busca al integrante de id ”id” y lo retorna.
	 */
	
	private ArrayList<Integrante> integrantes;
	
	public Controlador() {
		this.integrantes = new ArrayList<Integrante>();
	}

	public void crearFutbolista(int id, String nombre, String apellido, LocalDate fechaNac, int dorsal) {
		this.integrantes.add(new Futbolista(id, nombre, apellido, fechaNac, dorsal));
		
		actualizarMasajistas();
	}
	
	public void crearEntrenador(int id, String nombre, String apellido, LocalDate fechaNac, int idFederacion) {
		this.integrantes.add(new Entrenador(id, nombre, apellido, fechaNac, idFederacion));
		
		actualizarMasajistas();
	}
	
	public void crearMasajista(int id, String nombre, String apellido, LocalDate fechaNac, ArrayList<Integrante> integrantes) {
		Integrante masajistaNuevo = new Masajista(id, nombre, apellido, fechaNac);
		this.integrantes.add(masajistaNuevo);
		//((Masajista) masajistaNuevo).setIntegrantes(this.integrantes);
		
		actualizarMasajistas();
		
	}
	
	public void actualizarMasajistas() {
		for (int i=0; i < this.integrantes.size(); i++) {
			try {
				Masajista temp = (Masajista) this.integrantes.get(i);
				temp.setIntegrantes(this.integrantes);
			}catch(ClassCastException e) {
				
			}
		}
	}
	
	public void darDeBajaIntegrante(int id) {
		int indexABorrar = -1;
		
		for (int i = 0; i < this.integrantes.size(); i++) {
			if (this.integrantes.get(i).getId() == id) {
				indexABorrar = i;
			}
		}
		
		if (indexABorrar >= 0) {
			this.integrantes.remove(indexABorrar);
		}
	}
	
	public Integrante consultarIntegrante(int id) {
		Integrante integr = null;
		
		for (int i = 0; i < this.integrantes.size(); i++) {
			if (this.integrantes.get(i).getId() == id) {
				integr = this.integrantes.get(i);
			}
		}
		
		return integr;
	}
	
	public void imprimir() {
		for(int i = 0; i<this.integrantes.size(); i++) {
			System.out.println(this.integrantes.get(i).getNombre());
		}
		
		System.out.println(" ");
	}
	


	
}
