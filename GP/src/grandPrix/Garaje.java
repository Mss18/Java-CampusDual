package grandPrix;

import java.util.ArrayList;

public class Garaje {
	
	private String nombreGaraje;
	private ArrayList<Coche> listaCochesGaraje = new ArrayList<Coche>();
	
	public Garaje(String nombreGaraje, ArrayList<Coche> listaCochesGaraje) {
		super();
		this.nombreGaraje = nombreGaraje;
		this.listaCochesGaraje = listaCochesGaraje;
	}

	public String getNombreGaraje() {
		return nombreGaraje;
	}

	public void setNombreGaraje(String nombreGaraje) {
		this.nombreGaraje = nombreGaraje;
	}

	public ArrayList<Coche> getListaCochesGaraje() {
		return listaCochesGaraje;
	}

	public void setListaCochesGaraje(ArrayList<Coche> listaCochesGaraje) {
		this.listaCochesGaraje = listaCochesGaraje;
	}

	@Override
	public String toString() {
		return "Garaje: " + nombreGaraje + " Coches: " + listaCochesGaraje;
	}
	
	

	
}
