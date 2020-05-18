package race_controller;

import java.util.ArrayList;
import java.util.List;

public class Garaje {

	//Atributos garaje y lista de coches que lo componen
	private String nombreGaraje;	
	private List<Coche> listaGaraje = new ArrayList<Coche>();
	
	//Constructor garaje
	public Garaje(String nombreGaraje) {
		super();
		this.nombreGaraje = nombreGaraje;
	}	
	
	public Garaje() {
		
	}


	//Getters y setters garaje
	public String getNombreGaraje() {
		return nombreGaraje;
	}

	public void setNombreGaraje(String nombreGaraje) {
		this.nombreGaraje = nombreGaraje;
	}

	public List<Coche> getListaGaraje() {
		return listaGaraje;
	}

	public void setListaGaraje(List<Coche> listaGaraje) {
		this.listaGaraje = listaGaraje;
	}

	//Método añadir coche a garaje
	public void agregarCoche(Coche c) {
		this.listaGaraje.add(c);
	}
	
	//Método eliminar coche de garaje
	public void quitarCoche(Coche c) {
		this.listaGaraje.remove(0);
	}
	
	//Método seleccionar coche de garaje
	public void seleccionarCoche(Coche c) {
		this.listaGaraje.get(0);
	}
	
	//Mostrar información garaje
		public String toString() {
			return "Nombre: " + nombreGaraje;				
		}	
		
		
}
