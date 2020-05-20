package race_controller;

import java.util.ArrayList;

public class Estandar extends Carrera {

	int duracion = 30;

public Estandar(String nombre2, ArrayList<Garaje> listaGarajes) {
		
	}


	

	public Estandar(int duracion) {
	super();
	this.duracion = duracion;
}




	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
