package fr.eni.pooExercices;

public class TestOwner {

	public static void main(String[] args) {
		
		Window shield1 = new Window (true, false, true);
		Window shield2 = new Window (false, false, false);
		
		Voiture toyota = new Voiture ("Toyota", "Prius+", 60000, "25FTGO", true, shield1);
		Voiture citroen = new Voiture ("Citroen", "C3", 2300, "CH4567L", true, shield2);
		
		
		Owner samar = new Owner ("Al khalil", "Samar","05/03/2021", 12 ,toyota );
		Owner noam = new Owner("Chebaye", "Noam", "05/08/2023", 6, citroen);
		
		
		System.out.println(samar);
		System.out.println(noam);

	}

}
