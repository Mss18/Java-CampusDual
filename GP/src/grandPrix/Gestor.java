package grandPrix;

import java.util.ArrayList;

public class Gestor {

	String texto1;
	String texto2;
	String texto3;

	static Input input = new Input();

	ArrayList<Garaje> garajesGestionados = new ArrayList<Garaje>();
	// ArrayList<Carrera>
	// ArrayList<Torneo>

	// Método para buscar garaje en garajesGestionados
	public Garaje buscadorGaraje(String nombreGaraje) {
		Garaje g = null;
		for (Garaje garaje : garajesGestionados) {
			if (garaje.getNombreGaraje().equals(nombreGaraje)) {
				g = garaje;
			}
		}
		return g;
	}

	// Método para mostrar todos los garajes de garajesGestionados
	public void mostrarGarajes() {
		if (garajesGestionados == null) {
			System.out.println("--VACIO!! No hay ningún garaje registrado");
		} else {
			for (Garaje g : garajesGestionados) {
				System.out.println("-Garaje: " + g.getNombreGaraje());
			}
		}
	}

	// Método para añadir garajes a garajesGestionados
	public void añadirGaraje() {
		System.out.println("\n Introduce el nombre del garaje que quieres crear: \n");
		texto1 = input.init();
		garajesGestionados.add(new Garaje(texto1));
		System.out.println("\n***Garaje " + texto1 + " " + "creado***\n");
	}

	// Método para eliminar garajes de garajesGestionados
	public void eliminarGaraje() {
		System.out.println("\n Introduce el nombre del garaje que quieres eliminar: \n");
		texto1 = input.init();
		
		Garaje garaje = buscadorGaraje(texto1);
		if (garaje == null) {
			System.out.println("\n El nombre " + texto1 + "no se corresponde con ningún garaje registrado");
		} else {
			garajesGestionados.remove(garaje);
			System.out.println("\n ***El garaje " + texto1 + " ha sido eliminado***");
		}
	}

	// Método para añadir coches a un garaje
	public void añadirCocheGarajesGestionados() {
		System.out.println("\n Introduce el nombre del garaje al que quieres añadir un coche: \n");
		texto1 = input.init();
		
		Garaje garaje = buscadorGaraje(texto1);
		if(garaje == null) {			
			System.out.println("\n El nombre " + texto1 + " no se corresponde con ningún garaje registrado");
		} else {
			System.out.println("\n Introduce la marca del coche que quieres crear: \n");
			texto2 = input.init();
			System.out.println("\n Introduce el modelo del coche que quieres crear: \n");
			texto3 = input.init();
			String marca = texto2;
			String modelo = texto3;
			garaje.añadirCoche(marca, modelo);
			System.out.println("\n El coche " + texto2 + texto3 + "ha sido añadido al garaje " + texto1);
		}
	}
	
	// Método para mostrar coches de un garaje
	public void mostrarCoches() {
		System.out.println("\n Introduce el nombre del garaje del que quieres listar sus coches: \n");
		texto1 = input.init();
		
		Garaje garaje = buscadorGaraje(texto1);
		if(garaje == null) {
			System.out.println("\n El nombre " + texto1 + " no se corresponde con ningún garaje registrado");
		} else {
			garaje.getListaCochesGaraje();
		}
	}

	// Método para eliminar coches de un garaje
	public void eliminarCocheGarajesGestionados() {
		System.out.println("\n Introduce el nombre del garaje del que quieres eliminar un coche: \n");
		texto1 = input.init();
		
		Garaje garaje = buscadorGaraje(texto1);
		if(garaje == null) {			
			System.out.println("\n El nombre " + texto1 + " no se corresponde con ningún garaje registrado");
		} else {
			System.out.println("\n Introduce la marca del coche que quieres eliminar: \n");
			texto2 = input.init();
			System.out.println("\n Introduce el modelo del coche que quieres eliminar: \n");
			texto3 = input.init();
			String marca = texto2;
			String modelo = texto3;
			garaje.eliminarCoche(marca, modelo);
			System.out.println("\n El coche " + texto2 + texto3 + "ha sido eliminado del garaje " + texto1);
		}
	}
	
}
