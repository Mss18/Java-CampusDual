package grandPrix;


public class Menu {	
	
	static int seleccion = -1;
	String texto1;
	String texto2;
	String texto3;
	
	
	static Input input = new Input();			
		

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
}
