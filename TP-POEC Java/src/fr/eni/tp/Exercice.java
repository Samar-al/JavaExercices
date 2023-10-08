package fr.eni.tp;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number plz");
		int num = scan.nextInt();
		scan.nextLine();
		
		
		
		if(num % 2 == 0) {
			System.out.println("le nombre est paire");
		}else {
			System.out.println("le nombre est impaire");
			if(num > 0 ) {
				for (int i=1; i < num; i+= 2) {
					System.out.println(i);
				}
			}
			
		}
		
		scan.close();
	}

}
