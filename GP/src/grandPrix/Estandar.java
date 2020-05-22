package grandPrix;

import java.util.ArrayList;

public class Estandar extends Carrera{

	public Estandar(String nombreCarrera, ArrayList<Garaje> garajesParticipantes) {
		super(nombreCarrera, garajesParticipantes);		
	}
	
	public Estandar(String nombreCarrera) {
		super(nombreCarrera);
	}
	

	@Override
	public String podio() {
		// TODO Auto-generated method stub
		return null;
	}
}
