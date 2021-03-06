package es.IoC;

public class DirectorEmpleado implements Empleados {
	
	// Creaci�n de campo tipo CreacionInforme (Interface)
	private CreacionInformes informeNuevo;
	
	// Constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
