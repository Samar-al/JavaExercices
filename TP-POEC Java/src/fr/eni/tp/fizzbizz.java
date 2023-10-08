package fr.eni.tp;

import java.util.Scanner;

public class fizzbizz {
	
	   static int fizzBizz(int num) {
		  
	        if ((num % 5 == 0) && (num % 3 ==0)) {
	            System.out.print("FizzBuzz, ");
	        } else if (num % 5 == 0 ) {
	            System.out.print("Buzz, ");
	        } else if (num % 3 == 0) {
	            System.out.print("Fizz, ");
	        }else {
	            System.out.print(num + ", ");
	        }
	        return num;
	    }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier de 1 à N.");

        int userInput = scan.nextInt();
        scan.nextLine();
        
        
        for(int i=1; i<=userInput; i++) {
        	
        	fizzBizz(i);
        }


        scan.close();
	}

}
