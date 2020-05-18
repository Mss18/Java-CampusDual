package race_controller;

public class Coche {
	
	//Atributo estático para id autoincremental
	private static int idActual = 1;

	//Atributos coche
	private int id;
	private String marca;
	private String modelo;
	private int velocidadMaxima = 250;
	
	//Constructor coche
	public Coche(int id, String marca, String modelo) {
		this.id = idActual++;
		this.marca = marca;		
		this.modelo = modelo;
	}

	//Getters y setters coche
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getId() {
		return id;
	}
	
	//Mostrar información coche
	public String toString() {
		return "ID: " + id + " " + "Marca: " + marca + " " + "Modelo: " + modelo;				
	}	
}	
