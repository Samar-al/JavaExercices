package fr.eni.tp;

import java.util.Scanner;

public class Calculatrice {
	
	static int calculus (String calculus, int num1, int num2) {
		int result = 0;
		if(calculus.equals("Addition")) {
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
		}else if (calculus.equals("Soustraction")) {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
		} else if (calculus.equals("Multiplication")) {
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
		} else if (calculus.equals("Division")) {
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + result);	
			} else {
				System.out.println("Il n'est pas possible de diviser pas 0 !");
			}
			
		} else {
			System.out.println("Cette opération n'est pas autorisée !");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Quelle type d'opération souhaitez vous realiser ?");
		String operand = scan.nextLine();
		
		System.out.println("Veuiller renseigne le premier nombre");
		int num1 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Veuiller renseigne le second nombre");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		calculus(operand, num1, num2);
		
		scan.close();

	}

}
