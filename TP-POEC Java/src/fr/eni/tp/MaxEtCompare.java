package fr.eni.tp;

import java.util.Scanner;

public class MaxEtCompare {

	static float compareValue (float value1, float value2) {
		
		float higherValue = 0;
		
		if( value1 > value2 ) {
			higherValue = value1;
		}else if( value2 > value1 ) {
			higherValue = value2;
		}
		return higherValue;
	}
	
	static float compareValue2 (float value1, float value2) {
		
		float higherValue = 0;
		
		if( value1 > value2 ) {
			higherValue = 1;
		}else if( value2 > value1 ) {
			higherValue = -1;
		}else if ( value1 == value2) {
			higherValue = 0;
		}
		return higherValue;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number !");
		float userInput1 = scan.nextFloat();
		scan.nextLine();	
		
		System.out.println("Enter a second number !");
		float userInput2 = scan.nextFloat();
		scan.nextLine();
		
		float result = compareValue(userInput1, userInput2);
		
		System.out.println(result + " is the higher number.");
		
		float result2 = compareValue2(userInput1, userInput2);
		System.out.println("The result of the seconde function is : " + result2);
		
		scan.close();
		
		
	}

}
