package grandPrix;

import java.util.ArrayList;

public class Torneo {
	
	private String nombreTorneo;
	ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();
	
	public Torneo(String nombreTorneo, ArrayList<Carrera> listaCarreras) {
		super();
		this.nombreTorneo = nombreTorneo;
		this.listaCarreras = listaCarreras;
	}
	
	
	// Método para añadir carreras a listaCarreras.
		public void añadirCarrera(String nombreCarrera) {
			listaCarreras.add(new Estandar(nombreCarrera));
		}
		
		// Método para eliminar carreras de listaCarreras.
		public void eliminarCarrera(String nombreCarrera) {
			for(Carrera c : listaCarreras) {
				if(c.getNombreCarrera().equals(nombreCarrera)) {
					listaCarreras.remove(c);
				}
			}
		}
		
		// Método para mostrar todas las carreras de listaCarreras.
		public void mostrarCarreras() {
			for(Carrera c : listaCarreras) {
				System.out.println(c.getNombreCarrera());
			}
		}

}
