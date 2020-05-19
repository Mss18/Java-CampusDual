package race_controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList <Coche> podioList = new ArrayList<Coche>();

	public static void main(String[] args) {		

		int select = -1;
		while (select != 0) {			
			try {
				System.out.println(
						"\n\t******RACE CONTROL******\n"
								+ "\t***MENU PRINCIPAL!***\n"
								+ "\t 1 - GESTIONAR GARAJES\n"
								+ "\t 2 - GESTIONAR CARRERAS\n"
								+ "\t 3 - GESTIONAR TORNEOS\n" 
								+ "\t 0 - SALIR\n");
				
				System.out.print("\t INTRODUZCA OPCIÓN: ");
				
				select = Integer.parseInt(scanner.nextLine());

				switch (select) {
				
				case 1:
					int select2 = -1;
					int id = 0;
					
					ArrayList<Garaje> listadoGarajes = new ArrayList<Garaje>();
					
					while (select2 != 0) {
						
						try {
							System.out.println(
									"\n\n\n\n\t******GESTIÓN DE GARAJES****** \n" 
										+ "\t 1.- Listar garajes\n"
										+ "\t 2.- Añdir garajes\n"
										+ "\t 3.- Eliminar garajes\n"
										+ "\t 4.- Listar coches de un garaje\n"
										+ "\t 5.- Añadir coche a un garaje\n"
										+ "\t 6.- Eliminar coche de un garaje\n"
										+ "\t 7.- Exportar datos\n"
										+ "\t 8.-Importar datos\n"
										+ "\t 0 - VOLVER\n");
							System.out.print("\t INTRODUZCA OPCIÓN: ");
							
							select2 = Integer.parseInt(scanner.nextLine());

							switch (select2) {
							
							case 1:
								System.out.println("\n\n\t***LISTA DE GARAJES***\n");
								
								for(Garaje g: listadoGarajes) {
									System.out.println(g.getNombre());
								}
								listadoGarajes.toString();								
								
							case 2:
								System.out.print("\n INTRODUZCA NOMBRE DEGARAJE ");
								
								String nombre= scanner.nextLine();
								Garaje garage = new Garaje(nombre);
								listadoGarajes.add(garage);
								
								System.out.println("\t***GARAJE CREADO***\n\n");
								break;
								
//							case 3:
//								System.out.println("\n\n\t***GARAJE ELIMNADO***\n");
//								System.out.print("\n INTRODUZCA ID DEL GARAJE: ");
//								idSelected = Integer.parseInt(scanner.nextLine());
//								garageRegistration.removeGaraje(idSelected);
//								break;
//							case 4:
//								System.out.println("\n\n\t***LISTA DE SUS VEHICULOS***\n");
//								System.out.print("\n INTRODUZCA ID DEL GARAJE: ");
//								idSelected = Integer.parseInt(scanner.nextLine());
//								garaje = garageRegistration.findGarageByID(idSelected);
//								garageRegistration.showCarstoGaraje(idSelected);
//								break;
//
//							case 5:
//								Car carToWork = new Car();
//								System.out.print("\n INTRODUZCA ID DEL GARAJE: ");
//								idSelected = Integer.parseInt(scanner.nextLine());
//								System.out.print("\n INTRODUZCA MARCA VEHICULO: ");
//								String brand = scanner.nextLine();
//								System.out.print("\n INTRODUZCA MODELO DE VEHÍCULO: ");
//								String model = scanner.nextLine();
//								Car car = new Car(id, brand, model);
//								garaje =  garageRegistration.findGarageByID(idSelected);
//								garageRegistration.addCarToGarage(car, garaje);
//								System.out.println("\t***VEHÍCULO AÑADIDO***\n\n");
//								id++;
//								break;
//								
//							case 6:
//								System.out.print("\n INTRODUZCA ID DEL GARAJE: ");
//								idSelected = Integer.parseInt(scanner.nextLine());
//								System.out.print("\n INTRODUZCA ID DEL VEHICULO: ");
//								idSelected2 = Integer.parseInt(scanner.nextLine());
//								garageRegistration.remove1CarToGarage(idSelected,idSelected2);
//								System.out.println("\t***VEHÍCULO ELIMINADO***\n\n");
//								break;
//							case 7:
//								System.out.println("\t***EXPORTAR DATOS***\n\n");
//								break;
//							case 8:
//								System.out.println("\t***IMPORTAR DATOS***\n\n");
//								break;
//							case 0:
//								System.out.println("VOLVINEDO\n");
//								break;
//							default:
//								System.out.println("Número no reconocido");
//								break;

							}
						} catch (Exception e) {
							System.out.println("Uoop! Error!");
						}
					}
					break;
				case 2:
					break;
				case 3:
					break;
					
				case 0:
					System.out.println("Adios!");
					break;

				default:
					System.out.println("Número inválido");
					break;
				}

				System.out.println("\n");

			} catch (Exception e) {
				System.out.println("Uoop! Error Controlar error!");
			}
		}}}
	
	




	