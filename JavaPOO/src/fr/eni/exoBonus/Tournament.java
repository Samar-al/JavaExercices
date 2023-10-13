package fr.eni.exoBonus;

import java.util.HashSet;
import java.util.Set;

public class Tournament {
	
	private String name;
	Set<Participant> registeredPlayers;
	
	
	public Tournament(String name) {
		
		this.name = name;
		this.registeredPlayers = new HashSet<>();
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Participant> getRegisteredPlayersList() {
		return registeredPlayers;
	}
	
	public void addParticipant(Participant e) {
		boolean hasDobby = false;
		for(Participant p : registeredPlayers) {
			if(p.getName().equals("dobby")) {
				System.out.println("Les inscriptions sont terminées");
				hasDobby = true;
				break;
			}
			
		}
		
		if(!hasDobby) {
			registeredPlayers.add(e);
		}
		
	}
	
	
}
