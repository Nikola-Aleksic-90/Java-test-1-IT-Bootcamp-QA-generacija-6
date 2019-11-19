package Test;

import java.util.*;

public class Zadatak_2_Nikola_Aleksic {

	public static void main(String[] args) {
		// 2.	Ukoliko kupac kupi robu u iznosu veæem od 1500 dinara, dobija 10% popusta, 
		// a ukoliko kupi robu u iznosu veæem od 7000 dinara dobija 20% popusta. 
		// Napisati program koji æe za uneti iznos odabrane robe ispisati koliko zapravo treba platiti.
		
		
		// Pokrio sam sve slucajeve, moze se uneti samo pozitivna vrednost, bilo Int ili Real
		Scanner sc = new Scanner(System.in);
		double cena;
		do {
			System.out.print("Unesite iznos cene robe: ");
			while (!sc.hasNextDouble()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			cena = sc.nextDouble();
			if (cena<0) System.out.println("Cena ne moze biti negativna");
		} while (cena <= 0);
		
		int a;
		
		if (cena>=1500 && cena<7000) { cena = cena*0.9; a=1; }
		else if (cena>=7000) { cena = cena*0.8; a=2; }
		else { cena = cena; a=0;}
		
		String[] lista_popusta = {"0%", "10 %", "20%"};
		
		System.out.println("Konacan iznos za placanje nakon obrade popusta je " + cena + 
				" . Ostvarili ste popust od " + lista_popusta[a]);
	}

}
