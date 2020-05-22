package grandPrix;


public class Control {
	
	static int seleccion = -1;
	

	public static void main(String[] args) {
		
		
		Input input = new Input();
		Menu menu = new Menu();
		Gestor gestor = new Gestor();
		
		while (seleccion != 0) {
			try {
				System.out.println(
						"***********RACE CONTROL************\n" 
						+ "***********************************\n"
						+ "**********MENU PRINCIPAL***********\n" 
						+ "***********************************\n"
						+ "\t 1.- Gestionar garajes\n" 
						+ "\t 2.- Gesionar carreras\n" 
						+ "\t 3.- Gestionar torneos\n"
						+ "\t 4.- Exportar datos\n" 
						+ "\t 5.- Importar datos\n" 
						+ "\t 0.- Salir\n"
						);

				System.out.print("\t Introduce una opción: ");
				System.out.println("");
				seleccion = input.integer();

				switch (seleccion) {

				case 1:
					menu.menuGarajes(gestor);
					
					break;
					
				case 2:					
						
					
					break;
					
				case 3:
					
					break;

				case 0:
					System.out.println("Hasta la próxima");
					break;

				default:
					System.out.println("Número incorrecto");					
				}

				System.out.println("\n");

			} catch (Exception error) {
				System.out.println("ERROR --Menú principal!!--");
			}
		}
	}
}
