package grandPrix;

import java.util.ArrayList;

public class Torneo {
	
	private String nombreTorneo;
	private ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();
	
	public Torneo(String nombreTorneo, ArrayList<Carrera> listaCarreras) {
		super();
		this.nombreTorneo = nombreTorneo;
		this.listaCarreras = listaCarreras;
	}
	
	

}
