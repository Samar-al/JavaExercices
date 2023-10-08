package fr.eni.tp;

import java.util.Random;

public class wordMixer {

	public static void main(String[] args) {
		
		String sentenceToMix = "Bienvenue dans la nouvelle POEC développeur Java";
		String delimiter = " ";
		String[] arrayFromSentence = sentenceToMix.split(delimiter);
		char[] charFromWord = new char [1];
		for(int i = 0; i<arrayFromSentence.length; i++) {
			charFromWord = arrayFromSentence[i].toCharArray();
			System.out.println(" ");
			for(int j = 0; j<arrayFromSentence[i].length(); j++) {
				
				System.out.print(charFromWord[j]);
				System.out.print(" ");
			}
			
		}
		
		Random position = new Random();
		
		System.out.println("-----------------");
		System.out.println("-----------------");
		
		
		
		for(int i = 0; i<arrayFromSentence.length; i++) {
			
			if(arrayFromSentence[i].length() <= 2) {
				System.out.println(" ");
				System.out.print( arrayFromSentence[i] + " ");
			}else {
			
				charFromWord = arrayFromSentence[i].toCharArray();
				char firstcharFromWord = charFromWord[0];
				char lastCharFromWord = charFromWord[charFromWord.length-1];
				System.out.println(" ");
				System.out.print(firstcharFromWord+ " ");
				
					
						
				for(int j = 0; j<arrayFromSentence[i].length()-2; j++) {
					
					int newPosition = 1+ position.nextInt(arrayFromSentence[i].length() - 2);
				
					int[] usedNumbers = new int [arrayFromSentence[i].length()-2];
					
					for(int index=0; index < usedNumbers.length; index++) {
						
						if(charFromWord[newPosition] != usedNumbers[index]) {
								
								usedNumbers[index] = newPosition;
						}
						
					}
					System.out.print(charFromWord[usedNumbers[j]]);
					System.out.print(" ");	
						
				}			
				System.out.print(lastCharFromWord + " ");
			}
			
			//System.out.print(charFromWord[arrayFromSentence[i].length() - 1]);
		}
		
		
	}

}
