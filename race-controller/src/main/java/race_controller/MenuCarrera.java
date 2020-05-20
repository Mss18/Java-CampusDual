package race_controller;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCarrera {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Carrera> listadoCarreras = new ArrayList<Carrera>();

	public void iniciarMenuCarrera(ArrayList<Garaje> listaGarajes) {
		int seleccion = -1;					
		
							while (seleccion != 0) {
		
								try {
									System.out.println(
											"**********GESTIÓN CARRERAS**********\n"
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
											+ "\t 0 - Volver\n");
									System.out.print("\t Introduce una opción: ");
		
									seleccion = Integer.parseInt(scanner.nextLine());
		
									switch (seleccion) {
		
									case 1:
										
										System.out.println("\n\n\t***Lista de carreras***\n");

										for (Carrera carrera : listadoCarreras) {
											System.out.println(carrera.getNombreCarrera());
										}
										listadoCarreras.toString();
										
										break;
										
									case 2:
										
										System.out.println("\n\n\t***Informción de carrera***\n");
										System.out.println("Introduce el nombre de una carrera:");
										String nombre = scanner.nextLine();
										
										for(Carrera carrera : listadoCarreras) {
											if(carrera.getNombreCarrera().equals(nombre)) {
												carrera.toString();
											}
										}
										
										break;
										
									case 3:
										
										System.out.println("Introduce un nombre para la carrera:");
										String nombre2 = scanner.nextLine();
										System.out.println("Introduce el tipo de carrera (estandar o eliminacion):");
										String nombre3 = scanner.nextLine();
										
										String opcionEstandar = "estandar";
										String opcionEliminacion = "eliminacion";
										
										if(nombre3.equalsIgnoreCase(opcionEstandar)) {
											Estandar estandar = new Estandar(nombre2, listaGarajes);
											listadoCarreras.add(estandar);
//										} else if(nombre3.equalsIgnoreCase(opcionEliminacion)) {
//											Eliminacion eliminacion = new Eliminacion(nombre2, listaGarajes);
//											listadoCarreras.add(eliminacion);
										} else {
											System.out.println("El tipo no corresponde con ninguna carrera");
										}
										
										break;
									default:
										System.out.println("Número incorrecto");

									}
								} catch (Exception e) {
									System.out.println("ERROR!!");
							}
						}
					}
	}