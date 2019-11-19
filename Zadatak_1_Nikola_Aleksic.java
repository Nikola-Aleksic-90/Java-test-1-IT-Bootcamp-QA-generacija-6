package Test;

import java.util.*;

public class Zadatak_1_Nikola_Aleksic {

	public static void main(String[] args) {
		// 1.	Tražiti od korisnika da unese pozitivan broj N. 
		// Zatim uèitavati N brojeva sa standardnog ulaza i ispisati vrednost najmanjeg unetog broja.

		Scanner sc = new Scanner(System.in);
		int N;
		do {
			System.out.print("Unesite zeljeni broj unosa brojeva: ");
			while (!sc.hasNextInt()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			N = sc.nextInt();
		} while (N <= 0);
		
		double minimum = 1e30d;
		double brojd;
		for(int i=1; i<=N; i++) {
			System.out.println("Unesite " + i + ". broj");
			Scanner sc2 = new Scanner(System.in);
			double broj = sc.nextDouble();
			if (broj <= minimum) minimum = broj;
			
		}
		
		System.out.println("Minimalni uneti broj je: " + minimum);
	}

}
