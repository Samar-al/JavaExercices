package fr.eni.exoBonus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



public class TestHeadsOrTails {
	public static void main(String[] args) {
		
		Participant p1 = new Participant("Samar");
		Participant p2 = new Participant("Marion");
		Participant p3 = new Participant("David");
		Participant p4 = new Participant("daniele");
		Participant p5 = new Participant("dobby");
		Participant p6 = new Participant("Isadora");
		
		
		Tournament t1 = new Tournament ("Las Vergas Tournoi 32");
		
		
		t1.addParticipant(p1);
		t1.addParticipant(p3);
		t1.addParticipant(p2);
		t1.addParticipant(p3);
		t1.addParticipant(p4);
		t1.addParticipant(p5);
		t1.addParticipant(p6);
		
		
		Set<Participant> listOfPlayers = t1.getRegisteredPlayersList();
		for(Participant p : listOfPlayers) {
			System.out.println(p);
		}
		
		Random random = new Random();
		Scanner scan =  new Scanner (System.in);
		Map<Participant, Integer> scores = new HashMap<>();
		int winCount=0;
		

		
	do {	
		   
			for(Participant p : listOfPlayers) {
					
				
					if(scores.containsValue(4) && scores.size()<=1) {
						System.out.println("La partie est terminée, vous avez gagané ");
						break;
					}
					
					int coinToss = random.nextInt(2);
					
					System.out.println("Veuillez saisir 0 pour \"pile\" et 1 pour \"face\" ");
					int userInput;

					while (true) {
					    if (!scan.hasNextInt()) {
					        System.out.println("Valeur invalide, veuillez saisir un entier (0 pour \"pile\" et 1 pour \"face\") ");
					        scan.next();
					    } else {
					        userInput = scan.nextInt();
					        if (userInput != 0 && userInput != 1) {
					            System.out.println("Valeur invalide, veuillez saisir 0 pour \"pile\" et 1 pour \"face\" ");
					        } else {
					            // Handle valid input
					            break; // Exit the loop when valid input is provided
					        }
					    }
					}

					   
					   
					
					if (userInput == coinToss) {
						System.out.println("Vous avez gagné  " + p.getName() + " !");
						scores.computeIfAbsent(p, k -> 0); 
						Integer currentScore = scores.get(p);
					    scores.put(p, currentScore + 1);
					}else {
						System.out.println("Vous avez perdu " + p.getName() + " !");
						scores.computeIfAbsent(p, k -> 0); 
					}
					
			}
			
			for (Map.Entry<Participant, Integer> entry : scores.entrySet()) {
			    Participant participant = entry.getKey();
			    int scoreValue = entry.getValue();
			    System.out.println(participant.getName() + ": " + scoreValue);
			}
			
			for(Integer playerScore : scores.values()) {
				
				if(playerScore >= 4) {
					winCount++;
				}
			}
				 
			
		 }while(winCount<1);
	
	
	Map<Participant, Boolean> goldenCoinResults = new HashMap<>();
	System.out.println("Vous entrez en mode Golden Coin");
	
	do {
		
		
		int lossCount=0;  
		for(Participant p : listOfPlayers) {
			
		
			int coinToss = random.nextInt(2);
			
			System.out.println("Veuillez saisir 0 pour \"pile\" et 1 pour \"face\" ");
			int userInput;
	
	        do {
		            userInput = scan.nextInt();
		            scan.nextLine();
		
		            if (userInput != 0 && userInput != 1) {
		            	
		                System.out.println("Valeur invalide, veuillez saisir 0 pour \"pile\" et 1 pour \"face\" ");
		            }
	            } while (userInput != 0 && userInput != 1);
	
			   
			
			
			if (userInput == coinToss) {
				System.out.println("Vous avez gagné  " + p.getName() + " !");
				Integer currentScore = scores.get(p);
			    scores.put(p, currentScore + 1);
				goldenCoinResults.put(p, true);
				
			}else {
				System.out.println("Vous avez perdu " + p.getName() + " !");
				
				lossCount++;
				goldenCoinResults.put(p, false);
			}
		
		}
		
		
		
		if (lossCount != goldenCoinResults.size()) {
		    Set<Participant> participantsToRemove = new HashSet<>();

		    for (Map.Entry<Participant, Boolean> entry : goldenCoinResults.entrySet()) {
		        Participant key = entry.getKey();
		        Boolean value = entry.getValue();

		        if (!value) {
		            participantsToRemove.add(key);
		        }
		    }

		    for (Participant participant : participantsToRemove) {
		        goldenCoinResults.remove(participant);
		        scores.remove(participant);
		        listOfPlayers.remove(participant);
		    }
		}
		
		for (Map.Entry<Participant, Integer> entry : scores.entrySet()) {
		    Participant participant = entry.getKey();
		    int scoreValue = entry.getValue();
		    System.out.println(participant.getName() + ": " + scoreValue);
		}

    } while (goldenCoinResults.size() > 1);
	
	for (Map.Entry<Participant, Integer> entry : scores.entrySet()) {
	    Participant participant = entry.getKey();
	    int scoreValue = entry.getValue();
	    System.out.println(participant.getName() + " won the game with a score of : " + scoreValue);
	}
	
	scan.close();
	     
	}
}
