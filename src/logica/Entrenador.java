package logica;

import java.time.LocalDate;

public class Entrenador extends Integrante{
	private int idFed;

	public Entrenador(int id, String nombre, String apellido, LocalDate fechaNac, int idFed) {
		super(id, nombre, apellido, fechaNac);
		this.idFed = idFed;
	}

	public int getIdFed() {
		return idFed;
	}

	public void setIdFed(int idFed) {
		this.idFed = idFed;
	}
	
	
}
