package race_controller;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	//Atributos torneo y lista de carreras que lo componen
	private String nombreTorneo;
	private List<Carrera> listadoCarreras = new ArrayList<Carrera>();
	
	//Constructor torneo
	public Torneo(String nombreTorneo, List<Carrera> listadoCarreras) {
		super();
		this.nombreTorneo = nombreTorneo;
		this.listadoCarreras = listadoCarreras;
	}
	
	//Getters y setters torneo
	public List<Carrera> getListadoCarreras() {
		return listadoCarreras;
	}


	public void setListadoCarreras(List<Carrera> listadoCarreras) {
		this.listadoCarreras = listadoCarreras;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}
	
	new Carrera = 
}
