package cartoleria;

public class Magazzino {
	
	// DATA
	private Prodotto[] prodotti;
	
	
	// CONSTRUCTOR
	public Magazzino(int quantitàMagazzino) {
		
		this.prodotti = new Prodotto[quantitàMagazzino];
		
	}
	
	// GETTER
	public Prodotto[] getProdotti() {
		
		return this.prodotti;
		
	}
	
	// METHODS
	
	/**
	 * Stampo tutti gli elementi presenti nel magazzino
	 * 
	 * @return tutti gli elementi presenti nel magazzino 
	 */
	public String stampaArticoli() {
		
		String stringa = "Magazzino \n\n";
		
			
			for(Prodotto prodotto: this.prodotti) {
				
				if(!(prodotto == null)) {
					
					stringa += prodotto.toString() + "\n";
				}
			}
			
			return stringa;
		
	}
	
	/**
	 * 
	 * Aggiungo un elemento di tipo Prodotto ad un array di Prodotti
	 * 
	 * @param prodotto
	*/
	public void aggiungiProdotto(Prodotto prodotto) {
		
		for(int i = 0; i < this.prodotti.length; i++) {
			
			if(this.prodotti[i] == null) {
				
				this.prodotti[i] = prodotto;
				break;
				
			}
			
			
		}
		
	}
	
	/**
	 * 
	 * per ogni prodotto nel magazzino, faccio una somma dei costi
	 * 
	 * @return la somma dei costi
	 */
	public double stampaCosti(){
		
		double somma = 0;
		
		for(Prodotto prodotto: this.prodotti) {
			
			somma += prodotto.getCosto();
			
		}
		
		return somma;
		
	}
	
	/**
	 * per ogni prodotto nel magazzino, calcolo il totale dei prezzi,
	 * e sottraendolo con il totale dei costi ottengo tutti i ricavi
	 * 
	 * @return il totale dei ricavi
	 */
	public double stampaRicavi() {
		double ricavi = 0;
		
		double totPrezzi = 0;
		
		for(Prodotto prodotto: this.prodotti) {
			
			totPrezzi += prodotto.getPrezzo();
			
		}
		
		ricavi = totPrezzi - this.stampaCosti();
		
		return ricavi;
	}
	
}
