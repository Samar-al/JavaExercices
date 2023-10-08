package fr.eni.tp;

import java.util.Scanner;

public class Boucle {

	public static void main(String[] args) {
		int sum = 0;
		for (int index = 0; index < 10; index++) {
			sum += index;
		}	
		System.out.println("La somme des nombres de 0 à 9 est : " + sum);
		
		
		Scanner scan = new Scanner (System.in);
		
		byte age = 0;
		
		do {
			System.out.println("Veuillez renseigner votre âge");
			age = scan.nextByte();
			scan.nextLine();
			
			if (age < 18) {
				System.out.println("Si vous voulez continuer sur ce site, soyez adulte");
			} else {
				System.out.println("Vous êtes adulte");
			}
		} while (age < 18);
		
		scan.close();
	}

}
