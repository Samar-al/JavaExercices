package fr.eni.tp;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Veuillez entrer le type de viande");
		String meatType = scan.nextLine();
		
		System.out.println("Veuillez entrer le poids de la viande en gramme");
		int meatWeight = scan.nextInt();
		scan.nextLine();
		System.out.println("Veuillez entrer le type de cuisson que vous souhaitez");
		String cookingType = scan.nextLine();
		
		scan.close();
		int cookingTime;

		if( meatType.equals("Boeuf")) {
			if(cookingType.equals("Bleu")) {
				cookingTime = (int) (meatWeight * 1.2);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " secondes");
				
			} else if (cookingType.equals("à point")){
				cookingTime = (int) (meatWeight * 2.04);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " ");
				
			} else if (cookingType.equals("Bien cuit")) {
				cookingTime = (int) (meatWeight * 3);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " secondes");
			}
		}else if(meatType.equals("Agneau")) {
			
			if(cookingType.equals("Bleu")) {
				cookingTime = (int) (meatWeight * 2.25);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " secondes");
			}else if (cookingType.equals("à point")){
				cookingTime = (int) (meatWeight * 3.75);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " secondes");
			}else if (cookingType.equals("Bien cuit")) {
				cookingTime = (int) (meatWeight * 6);
				System.out.println("Votre temps de cuisson est de : " + cookingTime + " secondes");
			}
			
		}

	}

}
