package race_controller;


public class Control {

	public static void main(String[] args) {
		
		Coche cocheUno = new Coche(0, "Lotus", "L_01");		
		Coche cocheDos = new Coche(0, "Ferrari", "F_01");
		Coche cocheTres = new Coche(0, "Mercedes", "M_01");
		
		
		Garaje garajeLotus = new Garaje("Lotus");
		garajeLotus.agregarCoche(cocheUno);
		
		Garaje garajeFerrari = new Garaje("Ferrari");
		garajeFerrari.agregarCoche(cocheDos);
		
		Garaje garajeMercedes = new Garaje("Mercedes");
		garajeMercedes.agregarCoche(cocheTres);
		
		Carrera carreraUno = new Carrera();
		carreraUno.getListaGarajesCarrera().add(garajeMercedes, garajeFerrari, garajeLotus);

	}

}

//		Garaje garajeLotus = new Garaje("Lotus", );
//		Garaje garajeFerrari = new Garaje("Ferrari");
//		Garaje garajeMercedes = new Garaje("Mercedes");
//
//		ArrayList<Coche> listaGarajeLotus = new ArrayList<Coche>();
//		ArrayList<Coche> listaGarajeFerrari = new ArrayList<Coche>();
//		ArrayList<Coche> listaGarajeMercedes = new ArrayList<Coche>();
//		
//		Coche cocheUno = new Coche(0, "Lotus", "L_01");		
//		Coche cocheDos = new Coche(0, "Ferrari", "F_01");
//		Coche cocheTres = new Coche(0, "Mercedes", "M_01");		
//		
//		listaGarajeLotus.add(cocheUno);
//		listaGarajeFerrari.add(cocheDos);
//		listaGarajeMercedes.add(cocheTres);		
//		
//		System.out.println(listaGarajeLotus);