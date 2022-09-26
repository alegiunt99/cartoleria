package cartoleria;

public class TestMagazzino {

	public static void main(String[] args) {
		
		// creo l'istanza di un magazzino
		Magazzino magazzino = new Magazzino(5);
		
		//creo diversi prodotti come penne e gomme
		Penna pennaRossa = new Penna("Bic", "non cancellabile", 1.50, "rossa");
		
		Gomma gommaRotonda = new Gomma("Bic", "non cancellabile", 3.20, "grande", "rotonda");
		
		Penna pennaBlu = new Penna("Bic", "non cancellabile", 1.30, "blu");
		
		Gomma gommaRotnd = new Gomma("Bic", "non cancellabile", 4.50, "grande", "rotonda");
		
		Penna pennaD = new Penna("Bic", "non cancellabile", 6.50, "blu");
		
		// con una funzione le aggiungo al magazzino
		magazzino.aggiungiProdotto(pennaRossa);
		
		magazzino.aggiungiProdotto(gommaRotonda);
		
		magazzino.aggiungiProdotto(pennaBlu);
		
		magazzino.aggiungiProdotto(pennaD);
		
		magazzino.aggiungiProdotto(gommaRotnd);
		
		
		// stampo tutti gli articoli
		System.out.println(magazzino.stampaArticoli());
		
		// stampo il costo totale di tutti gli articoli
		System.out.println("Totale costi: " + magazzino.stampaCosti());
		
		// stampo il ricavo totale ottenuto con tutti gli articolis
		System.out.println("Totale ricavi: " + magazzino.stampaRicavi());
		
	}

}
