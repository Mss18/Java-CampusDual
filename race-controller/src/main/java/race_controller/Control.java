package race_controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {

	static Scanner scanner = new Scanner(System.in);
//	static ArrayList<Coche> podioList = new ArrayList<Coche>();
	static ArrayList<Garaje> listadoGarajes = new ArrayList<Garaje>();

	public static void main(String[] args) {

		int select = -1;
		while (select != 0) {
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
				select = Integer.parseInt(scanner.nextLine());

				switch (select) {

				case 1:
					
					MenuGaraje menuGaraje = new MenuGaraje();
					menuGaraje.iniciarMenuGaraje();
					
				case 2:
					
					MenuCarrera menuCarrera = new MenuCarrera();
					menuCarrera.iniciarMenuCarrera(listadoGarajes);
									
					break;
				case 3:
					break;

				case 0:
					System.out.println("Hasta la próxima");
					break;

				default:
					System.out.println("Número inválido");
					break;
				}

				System.out.println("\n");

			} catch (Exception e) {
				System.out.println("Controlar error!");
			}
		}
	}
}
