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
	
	
	// M�todo para a�adir carreras a listaCarreras.
		public void a�adirCarrera(String nombreCarrera) {
			listaCarreras.add(new Estandar(nombreCarrera));
		}
		
		// M�todo para eliminar carreras de listaCarreras.
		public void eliminarCarrera(String nombreCarrera) {
			for(Carrera c : listaCarreras) {
				if(c.getNombreCarrera().equals(nombreCarrera)) {
					listaCarreras.remove(c);
				}
			}
		}
		
		// M�todo para mostrar todas las carreras de listaCarreras.
		public void mostrarCarreras() {
			for(Carrera c : listaCarreras) {
				System.out.println(c.getNombreCarrera());
			}
		}

}
