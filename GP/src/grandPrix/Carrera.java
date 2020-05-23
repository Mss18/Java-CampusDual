package grandPrix;

import java.util.ArrayList;

public abstract class Carrera {
	
	private String nombreCarrera;
	private int duracion;
	private ArrayList<Garaje> garajesParticipantes;	
	

	public Carrera(String nombreCarrera, ArrayList<Garaje> garajesParticipantes) {
		this.nombreCarrera = nombreCarrera;
		this.garajesParticipantes = garajesParticipantes;
	}

	public Carrera(String nombreCarrera) {		
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public ArrayList<Garaje> getGarajesParticipantes() {
		return garajesParticipantes;
	}

	public void setGarajesParticipantes(ArrayList<Garaje> garajesParticipantes) {
		this.garajesParticipantes = garajesParticipantes;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombreCarrera + ", Duraci�n: " + duracion + ", ";
	}
	
	//M�todo para a�adir garajes a garajesParticipantes.
		public void a�adirGaraje(String nombreGaraje, ArrayList<Garaje> garajesParticipantes) {
			for(Garaje g : garajesParticipantes) {
				if(g.getNombreGaraje().equals(nombreGaraje)) {
					garajesParticipantes.add(g);
				}
			}
		}
	
	// M�todo para eliminar garajes de garajesParticipantes.
		public void eliminarrGaraje(String nombreGaraje, ArrayList<Garaje> garajesParticipantes) {
			for(Garaje g : garajesParticipantes) {
				if(g.getNombreGaraje().equals(nombreGaraje)) {
					garajesParticipantes.remove(g);
				}
			}
		}
	
	// M�todo para mostrar todos los garajes de garajesParticipantes.
	public void mostrarGarajes() {
		for(Garaje g : garajesParticipantes) {
			System.out.println(g.getNombreGaraje());
		}
	}
	
	
	public abstract String podio();
	
}

