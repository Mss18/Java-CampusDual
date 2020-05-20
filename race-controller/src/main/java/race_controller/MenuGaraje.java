package race_controller;

import java.util.ArrayList;
import java.util.Scanner;

 

public class MenuGaraje {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Garaje> listadoGarajes = new ArrayList<Garaje>();
	
	public void iniciarMenuGaraje() {
		int seleccion = -1;					

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

				seleccion = Integer.parseInt(scanner.nextLine());

				switch (seleccion) {

				case 1:
					System.out.println("\n\n\t***Lista de garajes***\n");

					if(listadoGarajes.isEmpty()) {
						System.out.println("***VACIO!! No hay garajes que mostrar***\n");
					} else {
					for (Garaje garaje : listadoGarajes) {
						System.out.println(garaje.getNombre());
					}
					listadoGarajes.toString();
					}
					break;

				case 2:
					System.out.print("\n Introduce un nombre: \n\n");

					String nombre = scanner.nextLine();
					Garaje garage = new Garaje(nombre);
					listadoGarajes.add(garage);

					System.out.println("\n ***Garaje " + nombre + " " + "creado***\n");
					break;

				case 3:
					System.out.print("\n Introduce el nombre del garaje que deseas eliminar: \n");
					String nombre2 = scanner.nextLine();

					String test = null;
					for (Garaje garaje : listadoGarajes) {
						if (garaje.getNombre().equals(nombre2)) {
							test = nombre2;
							listadoGarajes.remove(garaje);
						}
					}
					if (test != null) {
						System.out.println("***El garaje " + nombre2 + " " + "ha sido eliminado***\n");
					} else {
						System.out.println("No existe ningún garaje que coincida con el nombre introducido\n");
					}

					break;

				case 4:
					System.out.println("\n\n\t***Lista de coches del garaje***\n");
					System.out.println("\n Introduce el nombre del garaje: ");
					String nombre3 = scanner.nextLine();

					for (Garaje garaje : listadoGarajes) {									
						if (garaje.getNombre().equals(nombre3)) {
							System.out.println(garaje.listaCoches.toString());
						} else {
							System.out.println("El garaje no contiene ningún vehículo");
						}
					}

					break;

				case 5:
					System.out.println("Introduce el nombre del garaje: ");
					String nombre4 = scanner.nextLine();
					System.out.println("Introduce una marca de vehículo: ");
					String marca = scanner.nextLine();
					System.out.println("Introduce un modelo de vehículo: ");
					String modelo = scanner.nextLine();

					Coche coche = new Coche(0, marca, modelo, nombre4);
					for (Garaje garaje : listadoGarajes) {
						if (garaje.getNombre().equals(nombre4)) {
							garaje.listaCoches.add(coche);
						} else {
							System.out.println("El garaje no está disponible");
						}
					}

					break;
					
				case 6:
//					System.out.println("\n Introduce el nombre del garaje del que quieres eliminar coches: ");
//					String nombre5 = scanner.nextLine();
//					System.out.println("\n Introduce el id del coche que quieres eliminar:");
//					String nombre6 = scanner.nextLine();
//					
//					for(Garaje garaje : listadoGarajes) {
//						if(garaje.getNombre().equals(nombre5) && ) {
//							
//						}
//					}
					

					break;

//				case 7:
//					break;
//
//				case 8:
//					
//					break;
//
//				case 0:
//					
//					break;
//					
				default:
					System.out.println("Número incorrecto");
					
				}
			} catch (Exception error) {
				System.out.println("ERROR!!");
			}
		}
	}

}
