package fr.eni.tp;

public class Tableau2D {

	public static void main(String[] args) {
		
		int[][] array2D = new int [5][5];
		int start = 1;
		int sum = 0;
		
		for(int indexLine = 0 ; indexLine < array2D.length; indexLine++) {
			for(int indexColumn = 0; indexColumn < array2D[indexLine].length; indexColumn++) {
				
				array2D[indexLine][indexColumn] = start;
				sum += array2D[indexLine][indexColumn];
				start++;
				System.out.print(array2D[indexLine][indexColumn]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
		System.out.println("La somme des valeurs du tableau est : " + sum);
		
		
	}

}
