package fr.eni.tp;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int total = 0;
		
		int count = 0;
		
		System.out.println("Can you please give a grade between 0 and 20 included");
		
		byte givenGrade;
		
		while (true) {
			System.out.print("Grade : ");
			givenGrade = scan.nextByte();
			scan.nextLine();
			
			if (givenGrade == -1) {
				break;
			}
			
			if (givenGrade >=0 && givenGrade <=20) {
				total += givenGrade;
				count++;
			} else {
				System.out.println("Invalide grade ! Plz enter a number between 0 and 20 included");
			}
			
			if (count > 0 ) {
				double average = (double)total / count;
				System.out.println("Your average is : " + average);
				if (average < 8 ) {
					System.out.println("Mention : non acquis");
				}else if (average <= 8 && average <= 12) {
					System.out.println("Mention : En cours d’acquisition");
				}else if ( average > 12 ) {
					System.out.println("Mention : Acquis");
				}
				
			} else {
				System.out.println("no grade has been entered");
			}
				
		}
		
		
		scan.close();

	}

}
