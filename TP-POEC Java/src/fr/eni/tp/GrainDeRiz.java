package fr.eni.tp;

import java.math.BigInteger;

public class GrainDeRiz {

	public static void main(String[] args) {
		/*
		int numberOfTerms = 64;
        long initialValue = 1;
        long commonRatio = 2;

        long sum = initialValue * (1 - (long) Math.pow(commonRatio, numberOfTerms)) / (1 - commonRatio);

        System.out.println("The sum of the grains is: " + sum);
        */
		
        int numberOfSquares = 64;
        BigInteger grainsOnFirstSquare = BigInteger.valueOf(1);
        BigInteger totalGrains = grainsOnFirstSquare;

        for (int i = 1; i < numberOfSquares; i++) {
            grainsOnFirstSquare = grainsOnFirstSquare.multiply(BigInteger.valueOf(2));
            totalGrains = totalGrains.add(grainsOnFirstSquare);
        }

        System.out.println("Le nombre total de grains de riz sur l'échiquier est : " + totalGrains);
        
        
        
	  }
	    
	

}
