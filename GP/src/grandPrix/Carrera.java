package grandPrix;

import java.util.ArrayList;

public abstract class Carrera {
	
	private String nombreCarrera;
	private int duracion;
	private ArrayList<Garaje> garajesParticipantes = new ArrayList<Garaje>();
	
	

	public Carrera(String nombreCarrera, int duracion, ArrayList<Garaje> garajesParticipantes) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.duracion = duracion;
		this.garajesParticipantes = garajesParticipantes;
	}

	

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public static ArrayList<Garaje> getGarajesParticipantes() {
		return garajesParticipantes;
	}

	public void setGarajesParticipantes(ArrayList<Garaje> garajesParticipantes) {
		this.garajesParticipantes = garajesParticipantes;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombreCarrera + ", Duración: " + duracion + ", ";
	}
	
	public abstract String podio();
	

}
