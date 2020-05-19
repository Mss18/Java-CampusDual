package race_controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Coche> podioList = new ArrayList<Coche>();
	static ArrayList<Garaje> listadoGarajes = new ArrayList<Garaje>();

	public static void main(String[] args) {

		int select = -1;
		while (select != 0) {
			try {
				System.out.println("***********RACE CONTROL************\n" + "***********************************\n"
						+ "**********MENU PRINCIPAL***********\n" + "***********************************\n"
						+ "\t 1.- Gestionar garajes\n" + "\t 2.- Gesionar carreras\n" + "\t 3.- Gestionar torneos\n"
						+ "\t 4.- Exportar datos\n" + "\t 5.- Importar datos\n" + "\t 0.- Salir\n");

				System.out.print("\t Introduce una opción: ");
				System.out.println("");
				select = Integer.parseInt(scanner.nextLine());

				switch (select) {

				case 1:
					int select2 = -1;
//					int id = 0;							

					while (select2 != 0) {

						try {
							System.out.println("**********GESTIÓN GARAJES**********\n"
									+ "***********************************\n" + "\t 1.- Listar garajes\n"
									+ "\t 2.- Añdir garajes\n" + "\t 3.- Eliminar garajes\n"
									+ "\t 4.- Listar coches de un garaje\n" + "\t 5.- Añadir coche a un garaje\n"
									+ "\t 6.- Eliminar coche de un garaje\n" + "\t 7.- Exportar datos\n"
									+ "\t 8.- Importar datos\n" + "\t 0 - Volver\n");
							System.out.print("\t Introduce una opción: ");

							select2 = Integer.parseInt(scanner.nextLine());

							switch (select2) {

							case 1:
								System.out.println("\n\n\t***Lista de garajes***\n");

								for (Garaje garaje : listadoGarajes) {
									System.out.println(garaje.getNombre());
								}
								listadoGarajes.toString();
								break;

							case 2:
								System.out.print("\n Introduce un nombre: \n\n");

								String nombre = scanner.nextLine();
								Garaje garage = new Garaje(nombre);
								listadoGarajes.add(garage);

								System.out.println("\t***Garaje creado***\n\n");
								break;

							case 3:
								System.out.print("\n Introduce el nombre del garaje: ");
								String nombre2 = scanner.nextLine();

								boolean existe = false;
								for (Garaje garaje : listadoGarajes) {
									if (garaje.getNombre().equals(nombre2)) {
										listadoGarajes.remove(garaje);
										existe = true;
									}
								}
								if (existe) {
									System.out.println("El garaje ha sido eliminado");
								} else {
									System.out
											.println("No existe ningún garaje que coincida con el nombre introducido");
								}

								break;

							case 4:
								System.out.println("\n\n\t***Lista de coches del garaje***\n");
								System.out.println("\n Introduce el nombre del garaje: ");
								String nombre3 = scanner.nextLine();

								for (Garaje garaje : listadoGarajes) {
									System.out.println(garaje.getListaCoches().toString());
									if (garaje.getNombre().equals(nombre3)) {
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

								Coche coche = new Coche(0, marca, modelo);
								for (Garaje garaje : listadoGarajes) {
									if (garaje.getNombre().equals(nombre4)) {
										garaje.setListaCoches(null);
									} else {
										System.out.println("Mal");
									}
								}

								break;
//								
//							case 6:

//								break;

//							case 7:

//								break;

//							case 8:
//								
//								break;

//							case 0:
//								
//								break;
							default:
								System.out.println("Número incorrecto");

							}
						} catch (Exception e) {
							System.out.println("ERROR!!");
						}
					}
					break;
				case 2:
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
