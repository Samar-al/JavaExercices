package fr.eni.tp;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your firstname");
		String Firstname = scan.nextLine();
		
		System.out.println("Enter your lastname");
		String lastname = scan.nextLine();
		
		System.out.println("Enter your status");
		String status = scan.nextLine();
		
		System.out.println("How many hours have you worked this month ?");
		int hours = scan.nextInt();
		
		
		int salary = 0;
		int hourlyRate = 20;
		if( hours >= 0 && hours < 170 ) {
			salary = hours * hourlyRate;
			
		}else if (hours > 169 && hours < 181) {
			salary = (int) (hours * (hourlyRate * 1.5));
			
		}else if ( hours > 180) {
			salary = (int) (hours * (hourlyRate * 1.6));
			
		}
		
		
	 
		//cotisations
		int socialDebt = (int) (salary * 0.0349);
		int socialContrib = (int) (salary * 0.0615);
		int healthInsurance = (int) (salary * 0.0095);
		int pensionInsurance = (int)(salary * 0.0844);
		int complementaryPension = (int)(salary * 0.0381);
		int agff = (int) (salary * 0.0102);
		
		int total = socialDebt + socialContrib + healthInsurance + pensionInsurance + complementaryPension + agff;
		System.out.println(salary);
		System.out.println(total);
		System.out.println(" how many children do you have ?");
		int children = scan.nextInt();
		scan.nextLine();
		
		int bonus = 0;
		int income;
		
		if(children == 0) {
			income = salary - total;
			System.out.println("your income is " + income + "€");
		} else if ( children == 1 ) {
			bonus = 20;
			income = salary - total + bonus;
			System.out.println("your income is " + income + "€");
		}else if (children == 2 ) {
			bonus = 50;
			income = salary - total + bonus;
			System.out.println("your income is " + income + "€");
		}else if ( children > 2) {
			bonus = 70 + (children - 2)*20;
			income = salary - total + bonus;
			System.out.println("your income is " + income + "€");
		}
		
		scan.close();

	}

}
