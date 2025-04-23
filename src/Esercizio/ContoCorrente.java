package Esercizio;
import java.util.Scanner;

public class ContoCorrente {
	
	private double saldo; 
	
	
	public ContoCorrente(double saldo){
		
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	void deposita(double importo) {
			
		saldo = saldo + importo;
			
		System.out.println("Il tuo saldo aggiornato e':  " + saldo);
			
				
	}
	
	void preleva(double importo) {
		
		
		
		if(importo > saldo) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Prelievo non riuscito! Il saldo attuale del tuo conto e': " + saldo + ". Hai provato a prelevare:  " + importo + ". Importo maggiore del saldo del conto corrente");
			
			do 
			{
				
				System.out.println("Inserire un importo da prelevare (l'importo deve essere minore del saldo)");
				
				importo = scanner.nextDouble();
				
				if(importo > saldo)
					System.out.println("Prelievo non riuscito!");
				
			}while(importo > saldo);
			
			scanner.close();
		}
		
		saldo-= importo;
		
		System.out.println("Hai prelevato " +importo+ " euro");
		System.out.println("Il tuo conto corrente aggiornato e':  " + saldo + " euro");
	}
	
	
	

}
