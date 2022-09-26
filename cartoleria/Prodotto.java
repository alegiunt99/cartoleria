package cartoleria;

public class Prodotto {
	// DATA
	private String marca;
	private String modello;
	private double costo;
	private double prezzo;
	
	// CONSTRUCTOR 
	public Prodotto(String marca, String modello, double costo) {
		
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
		this.prezzo = costo * 2;
		
	}
	
	// GETTERS AND SETTERS 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	// METHODS
	
	public String toString() {
		
		String string = "Marca: " + this.getMarca() + "\n"
				+ "Modello: " + this.getModello()+ "\n"
				+ "Costo: " + this.getCosto() + "\n"
				+ "Prezzo: " + this.getPrezzo();;
		
		return string;
		
	}
	
}
