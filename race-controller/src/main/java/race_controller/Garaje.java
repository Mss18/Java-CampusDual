package race_controller;

import java.util.ArrayList;

public class Garaje {

	private String nombre;
	ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	
	
	public Garaje(String nombre, ArrayList<Coche> listaCoches) {
		super();
		this.nombre = nombre;
		this.listaCoches = listaCoches;
	}
	

	public Garaje(String nombre) {
	this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Coche> getListaCoches() {
		return listaCoches;
	}
	public void setListaCoches(ArrayList<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}
	
	public void mostrarCoches() {
		for(Coche coche : listaCoches) {
			System.out.println(coche.toString());
		}
	}
}
