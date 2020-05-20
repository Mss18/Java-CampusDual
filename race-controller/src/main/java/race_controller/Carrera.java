package race_controller;

import java.util.ArrayList;

public abstract class Carrera {

	private String nombreCarrera;
	ArrayList <Garaje> listaGarajes = new ArrayList<Garaje>();
	private int distancia;	
	
	
	public Carrera() {
		super();
		
	}
	public Carrera(String nombreCarrera, ArrayList<Garaje> listaGarajes, int distancia) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.listaGarajes = listaGarajes;
		this.distancia = distancia;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public ArrayList<Garaje> getListaGarajes() {
		return listaGarajes;
	}
	public void setListaGarajes(ArrayList<Garaje> listaGarajes) {
		this.listaGarajes = listaGarajes;
	}
	
	public void mostrarGarajes() {
		for(Garaje garaje : listaGarajes) {
			System.out.println(garaje.toString());
		}
	}
}
