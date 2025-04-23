package Esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Auto a1 = new Auto("Toyota", "Corolla", 2010);
				
		a1.informazioniAuto();
				
		ContoCorrente p1 = new ContoCorrente(5000);
		
		System.out.println("Inserire importo da depositare");
		
		double importoDepositato = scanner.nextDouble();
		
		p1.deposita(importoDepositato);
		
		System.out.println("Inserire importo da prelevare");
		
		double importoPrelievo = scanner.nextDouble();
		
		p1.preleva(importoPrelievo);
		
		scanner.close();
		
	}

}
