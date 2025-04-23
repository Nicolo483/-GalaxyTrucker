package Esercizio;

public class Auto {
		
	String marca;
	
	String modello;
	
	int annoProduzione;
	
	
	public Auto(String marca, String modello, int annoProduzione ) {
		this.marca = marca;
		this.modello = modello;
		this.annoProduzione = annoProduzione;
	}
	
	void informazioniAuto() {
		System.out.println("Auto trovata:  " + marca + " " +modello + "  rilasciata nell'anno:  " + annoProduzione);
		
	}
	
}
