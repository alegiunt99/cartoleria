package cartoleria;

public class Gomma extends Prodotto {
	

	private String dimensione;
	private String forma;
	
	public Gomma(String marca, String modello, double costo,String dimensione, String forma) {
		super(marca, modello, costo);
		
		this.dimensione = dimensione;
		this.forma = forma;
	}

	public String getDimensione() {
		return dimensione;
	}

	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public String toString() {
		
		String string = "Marca: " + this.getMarca() + "\n"
				+ "Modello: " + this.getModello()+ "\n"
				+ "Dimensione:" + this.getDimensione()+ "\n"
				+ "Forma: " + this.getForma() + " \n"
				+ "Costo: " + this.getCosto() + "\n"
				+ "Prezzo: " + this.getPrezzo();;

		return string;

	}
	
	
	

}
