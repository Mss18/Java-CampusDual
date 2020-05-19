package race_controller;

public class Coche {
	
	private static int idActual = 1;

	private int id;
	private String marca;
	private String modelo;
	private String pegatinaGaraje;
	int velocidad;
	int puntos;

		
	public Coche(int id, String marca, String modelo, String pegatinaGaraje) {
		super();
		this.id = idActual++;
		this.marca = marca;
		this.modelo = modelo;
		this.pegatinaGaraje = pegatinaGaraje;
	}
		
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	

	public int getId() {
		return id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String nombre) {
		this.marca = nombre;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String marca) {
		this.modelo = marca;
	}
	
	public String getPegatinaGaraje() {
		return pegatinaGaraje;
	}
	
	public void setPegatinaGaraje(String pegatinaGaraje) {
		this.pegatinaGaraje = pegatinaGaraje;
	}
}
