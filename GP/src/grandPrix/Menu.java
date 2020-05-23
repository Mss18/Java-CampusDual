package grandPrix;


public class Menu {	
	
	static int seleccion = -1;
	String texto1;
	String texto2;
	String texto3;
	
	
	static Input input = new Input();			
		
// Método que genera el menú de gestión de los garajes
	public void menuGarajes(Gestor gestor) {				

		while (seleccion != 0) {
			try {
				System.out.println(
						"\n**********GESTIÓN GARAJES**********\n"
						+ "***********************************\n" 
						+ "\t 1.- Listar garajes\n"
						+ "\t 2.- Añdir garajes\n" 
						+ "\t 3.- Eliminar garajes\n"
						+ "\t 4.- Listar coches de un garaje\n" 
						+ "\t 5.- Añadir coche a un garaje\n"
						+ "\t 6.- Eliminar coche de un garaje\n" 
						+ "\t 7.- Exportar datos\n"
						+ "\t 8.- Importar datos\n" 
						+ "\t 0 - Volver\n"
						);
				System.out.print("\t Introduce una opción: \n");

				seleccion = input.integer();

				switch (seleccion) {

				case 1:					
					gestor.mostrarGarajes();					
					break;

				case 2:					
					gestor.añadirGaraje();						
					break;

				case 3:			
					gestor.eliminarGaraje();					
					break;

				case 4:	
					gestor.mostrarCoches();			
					break;

				case 5:					
					gestor.añadirCocheGarajesGestionados();					
					break;
					
				case 6:						
					gestor.eliminarCocheGarajesGestionados();
					break;

				case 7:
					
					break;

				case 8:
					
					break;

				case 0:
					
					break;
					
				default:
					System.out.println("Número incorrecto");
					
				}
			} catch (Exception error) {
				System.out.println("**ERROR!!**");
			}
		}
	}
	
	// Método que genera el menú de gestión de las carreras	
	public void menuCarreras(Gestor gestor) {
		while (seleccion != 0) {
			try {
				System.out.println(
						"\n**********GESTIÓN CARRERAS**********\n"
						+ "***********************************\n" 
						+ "\t 1.- Listar carreras\n"
						+ "\t 2.- Información de una carrera\n" 
						+ "\t 3.- Añadir carrera\n"
						+ "\t 4.- Eliminar carrera\n" 
						+ "\t 5.- Agregar garaje a una carrera\n"
						+ "\t 6.- Eliminar garaje de una carrera\n" 
						+ "\t 7.- Empezar carrera\n"
						+ "\t 8.- Exportar datos\n"
						+ "\t 9.- Importar datos\n" 
						+ "\t 0 - Volver\n"
						);
				System.out.print("\t Introduce una opción: \n");

				seleccion = input.integer();

				switch (seleccion) {

				case 1:					
					
					break;

				case 2:										
					
					break;

				case 3:					
					
					break;

				case 4:				
					
					break;

				case 5:					
					
					break;
					
				case 6:						

					break;

				case 7:
					
					break;

				case 8:
					
					break;

				case 0:
					
					break;
					
				default:
					System.out.println("Número incorrecto");
					
				}
			} catch (Exception error) {
				System.out.println("**ERROR!!**");
			}
		}		
	}
		
		// Método que genera el menú de gestión de los torneos	
		public void menuTorneos(Gestor gestor) {
			while (seleccion != 0) {
				try {
					System.out.println(
							"\n**********GESTIÓN TORNEOS**********\n"
							+ "***********************************\n" 
							+ "\t 1.- Listar torneos\n"
							+ "\t 2.- Información de un torneo\n" 
							+ "\t 3.- Añadir un torneo\n"
							+ "\t 4.- Eliminar un torneo\n" 
							+ "\t 5.- Agregar carrera al torneo\n"
							+ "\t 6.- Eliminar carrera del torneo\n"
							+ "\t 7.- Agregar garaje a un torneo\n"
							+ "\t 8.- Eliminar garaje de un torneo\n"
							+ "\t 9.- Registrar coches de los garajes en el torneo\n"
							+ "\t 10.- Empezar torneo\n"
							+ "\t 11.- Exportar datos\n"
							+ "\t 12.- Importar datos\n" 
							+ "\t 0 - Volver\n"
							);
					System.out.print("\t Introduce una opción: \n");

					seleccion = input.integer();

					switch (seleccion) {

					case 1:						
						
						break;

					case 2:											
						
						break;

					case 3:						
						
						break;

					case 4:							
						
						break;

					case 5:						
						
						break;
						
					case 6:	
						
						break;

					case 7:
						
						break;

					case 8:
						
						break;

					case 0:
						
						break;
						
					default:
						System.out.println("Número incorrecto");
						
					}
				} catch (Exception error) {
					System.out.println("**ERROR!!**");
				}
			
		}
}
}