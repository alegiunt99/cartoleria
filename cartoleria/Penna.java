package cartoleria;

public class Penna extends Prodotto {
	
	private String colore;
	
	public Penna(String marca, String modello, double costo,String colore) {
		super(marca, modello, costo);
		
		this.colore = colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getColore() {
		
		return this.colore;
	
	}
	
	public String toString() {
		
		String string = super.toString()
						+ "Colore:" + this.getColore()+ "\n";
	
		
		return string;
		
	}
	
}
