package grandPrix;

import java.util.ArrayList;

public class Garaje {
	
	private String nombreGaraje;
	ArrayList<Coche> listaCochesGaraje;	
	

	public Garaje(String nombreGaraje) {
		super();
		this.nombreGaraje = nombreGaraje;
	
	}

	public String getNombreGaraje() {
		return nombreGaraje;
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
	
	// M�todo para a�adir coches a listaCochesGaraje;
	public void a�adirCoche(String marca, String modelo) {
		listaCochesGaraje.add(new Coche(marca, modelo));
	}
	
	// M�todo para eliminar coches de listaCochesGaraje;
	public void eliminarCoche(String marca, String modelo) {
		for(Coche c : listaCochesGaraje) {
			if(c.getMarca().equals(marca) && c.getModelo().equals(modelo)) {
				listaCochesGaraje.remove(c);
			}
		}
	}
	
	// M�todo para mostrar todos los coches de listaCochesGaraje
	public void mostrarCoches() {
		for(Coche c : listaCochesGaraje) {
			System.out.println(c.getMarca() + " " + c.getModelo());
		}
	}
	
}
