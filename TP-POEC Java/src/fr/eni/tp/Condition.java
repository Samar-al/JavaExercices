package fr.eni.tp;

import java.util.Scanner;

public class Condition {

//	public static void main(String[] args) {
//	String animal1FirstName = "Léo";
//	byte animal1Age = 10;
//	String animal1Specie = "chat";
//	
//	if(animal1Specie != "chat") {
//		System.out.println("L'animal nest pas un chat");
//	} else {
//		System.out.println("L'animal est un chat");
//	}
//	
//	if (animal1Specie == "chat" && animal1Age >= 10) {
//		System.out.println("C'est un vieux chat");
//	} else if (animal1Age < 10) {
//		System.out.println("Lanimal n'est psa vieux");
//	} else {
//		System.out.println("L'animal n'est pas un chat");
//	}
//	
//	boolean animal1IsAdult = animal1Age > 4;
//	if (!animal1IsAdult) {
//		System.out.println("L'animal n'est pas adult");
//	} else {
//		System.out.println("L'animal est adulte");
//	}
//	
//	byte numberOfTheDay = 4;
//	switch (numberOfTheDay) {
//	case 1:
//		System.out.println("lundi");
//		break;
//	case 2: 
//		System.out.println("mardi");
//		break;
//	}
//}
	

	

	public static void main(String[] args) { 

	        Scanner sc = new Scanner(System.in); 

	                       

	        System.out.print("Entrez l'âge : "); 

	             

	        // le type byte est approprié (à moins que vous ne vouliez saisir 128 ans !) 

	        byte age = sc.nextByte(); 

	                

	        /*  

	         * Pour régler un bug de la console quand on change de type à saisir 

	         * Pas besoin si on saisit la ville avant l'âge 

	         */ 

	        sc.nextLine();  

	         

	        System.out.print("Entrez la ville : "); 

	        String ville = sc.nextLine(); 

	                         

	        if (age > 18 && ville.equals("Nantes")) { 

	           System.out.println("Condition 1 validée"); 

	        } 

	              

	        if (age >= 18 && ! (ville.equals("Rennes"))) { 

	           System.out.println("Condition 2 validée");	 

	        }  

	         

	        if ( !ville.equals("Nantes") || (age < 18) ) { 

	           	System.out.println("Condition 3 validée");	 

	        } else { 

	       	System.out.println("Condition 4 validée"); 

	        } 

	         

	        if (age >= 18 && ville.equals("Nantes")) { 

	        	System.out.println("Condition 5 validée"); 

	        } 

	                        

	        // Ne pas oublier de fermer le scanner 

	        sc.close(); 

	    } 

	



}
