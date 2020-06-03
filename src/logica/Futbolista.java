package logica;

import java.time.LocalDate;

public class Futbolista extends Integrante{
	private int dorsal;

	public Futbolista(int id, String nombre, String apellido, LocalDate fechaNac, int dorsal) {
		super(id, nombre, apellido, fechaNac);
		this.dorsal = dorsal;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	
}
