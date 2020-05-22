package grandPrix;

public class Coche {

	private String marca;
	private String modelo;
	private String pegatina;
	private int velocidad = 250;
	
	
	public Coche(String marca, String modelo, String pegatina, int velocidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pegatina = pegatina;
		this.velocidad = velocidad;
	}
	
		public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}



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

	public String getPegatina() {
		return pegatina;
	}

	public void setPegatina(String pegatina) {
		this.pegatina = pegatina;
	}

	public int getVelocidad() {
		return velocidad;
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", pegatina=" + pegatina + "]";
	}
	
	// Método para añadir pegatina
	
	
}
