package fr.eni.tp;

import java.util.Scanner;

public class NombrePremiers {

	static int primeNumbers (int limitNumber) {
		
		int primeNumber = 0;
		for ( int i=0; i<limitNumber + 1; i++) {
			if( i == 0 || i==1) {
				continue;
			}
			primeNumber = 1;
			for( int j = 2; j<=i/2; j++) {
				
				if((i%j == 0)) {
					primeNumber = 0;
					break;
				}
				
			}
			if(primeNumber == 1) {
				System.out.println("Les nombres premiers  sont : " + i);
			}
			
		}
		return primeNumber;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Entrez la limite superieur de la recherche : ");
		int userInput = scan.nextInt();
		scan.nextLine();
		
		primeNumbers(userInput);
		
		scan.close();
		
	}

}
