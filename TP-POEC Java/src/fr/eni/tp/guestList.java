package fr.eni.tp;


import java.util.Arrays;
import java.util.Scanner;

public class guestList {
	
	static boolean searchName (String[] list, String name) {
		int index = 0;
		boolean result= false;
		
		for(int i=0; i<list.length; i++) {
			
			if(list[index].equals(name)) {
				
				result = true;
			}
			
			index++;
		}
		
			
		return result;
	}
	
	static void sortNames (String[] list) {
		
		Arrays.sort(list);
		
		for(int i= 0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}
	public static void main(String[] args) {


		String[] nameList = new String[3];
	  
	    Scanner scan = new Scanner (System.in);
	    
	    
	    for(int i = 0; i<nameList.length; i++) {
	    	
	    	System.out.println("Veuillez entrer le nom de l'invité numéro "+ i);
	    	String enterName = scan.nextLine();
	        nameList[i]= enterName;
	    }
		
		
		for(int i= 0; i<nameList.length; i++) {
			System.out.println(nameList[i]);
		}
		System.out.println("--------------");
		
		
		
		System.out.println("Quel nom recherchez vous ?");
		String userInput = scan.nextLine();
		
		boolean result = searchName(nameList, userInput);
		if(result) {
			System.out.println(userInput);
		}else {
			System.out.println("Ce nom n'est pas présent dans la liste !");
		}
		
		System.out.println("--------------");
		
		//scan.close();
		
		
		sortNames(nameList);

	}

}
