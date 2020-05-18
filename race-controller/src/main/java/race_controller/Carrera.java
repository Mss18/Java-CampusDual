package race_controller;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

	//Atributos carrera y lista de garajes participantes
	private String nombreCarrera;
	private int duracionCarrera;
	private List<Garaje> listaGarajesCarrera = new ArrayList<Garaje>(); 

	//Constructor carrera
	public Carrera(String nombreCarrera, int duracionCarrera, List<Garaje> listaGarajesCarrera) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.duracionCarrera = duracionCarrera;
		this.listaGarajesCarrera = listaGarajesCarrera;
	}	

	public Carrera() {
		
	}

	//Getters y setters carrera
	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getDuracionCarrera() {
		return duracionCarrera;
	}

	public void setDuracionCarrera(int duracionCarrera) {
		this.duracionCarrera = duracionCarrera;
	}

	public List<Garaje> getListaGarajesCarrera() {
		return listaGarajesCarrera;
	}

	public void setListaGarajesCarrera(List<Garaje> listaGarajesCarrera) {
		this.listaGarajesCarrera = listaGarajesCarrera;
	}
	
	//Métodos carrera
	
	
}
