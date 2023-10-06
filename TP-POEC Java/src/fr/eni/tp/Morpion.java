package fr.eni.tp;

import java.util.Scanner;



public class Morpion {
	
	final static int BOARD_GAME_SIZE = 3;
	static final String EMPTY = "-";
	
	static byte inputLine(Scanner scan, String player) {
		byte userLine;
		
		do {
			System.out.println(player + " : Veuillez renseigner la ligne du jeu");
			userLine = scan.nextByte();
			scan.nextLine();
			if (!(userLine >= 1 && userLine <= BOARD_GAME_SIZE)) {
				System.out.println("Les coordonnées vont de 1 à " + BOARD_GAME_SIZE + " !");
			}
		} while (!(userLine >= 1 && userLine <= BOARD_GAME_SIZE));
		
		userLine--;
		
		return userLine;
	}
	
	static byte inputColumn(Scanner scan, String player) {
		byte userColumn;
		do {
			System.out.println(player + " : Veuillez renseigner la colonne du jeu");
			userColumn = scan.nextByte();
			scan.nextLine();
			if (!(userColumn >= 1 && userColumn <= BOARD_GAME_SIZE)) {
				System.out.println("Les coordonnées vont de 1 à " + BOARD_GAME_SIZE + "!");
			}
		} while (!(userColumn >= 1 && userColumn <= BOARD_GAME_SIZE));
		
		userColumn--;
		
		return userColumn;
	}
	
	static void displayBoardGame(String [][]morpionBoard) {
		
		for(int indexLine = 0 ; indexLine < BOARD_GAME_SIZE; indexLine++) {
			for(int indexColumn = 0; indexColumn < BOARD_GAME_SIZE; indexColumn++) {
				morpionBoard[indexLine][indexColumn] = EMPTY;
				System.out.print(morpionBoard[indexLine][indexColumn]);
				System.out.print(" ");
					
			}
			System.out.println("");
		}
	
	}
	
	static boolean verifyWin(String symbole, String [][]morpionBoard ) {
		boolean continueGame = true;
		if((morpionBoard[0][0].equals(symbole) && morpionBoard[0][1].equals(symbole) && morpionBoard[0][2].equals(symbole)) ||
				(morpionBoard[1][0].equals(symbole) && morpionBoard[1][1].equals(symbole) && morpionBoard[1][2].equals(symbole)) ||
				(morpionBoard[2][0].equals(symbole) && morpionBoard[2][1].equals(symbole) && morpionBoard[2][2].equals(symbole)) ||
				(morpionBoard[0][0].equals(symbole) && morpionBoard[1][1].equals(symbole) && morpionBoard[2][2].equals(symbole)) ||
				(morpionBoard[0][2].equals(symbole) && morpionBoard[1][1].equals(symbole) && morpionBoard[2][0].equals(symbole)) ||
				(morpionBoard[0][0].equals(symbole) && morpionBoard[1][0].equals(symbole) && morpionBoard[2][0].equals(symbole)) ||
				(morpionBoard[0][1].equals(symbole) && morpionBoard[1][1].equals(symbole) && morpionBoard[2][1].equals(symbole)) ||
				(morpionBoard[0][2].equals(symbole) && morpionBoard[1][2].equals(symbole) && morpionBoard[2][2].equals(symbole)) 
					) {
				System.out.println("Bravo ! " + symbole + " a gagné !"  );
				continueGame = false; 
			}
		return continueGame;
	}
	
	
	public static void main(String[] args) {
		
		String[][] morpionBoard = new String [BOARD_GAME_SIZE][BOARD_GAME_SIZE];
		byte player1Line;
		byte player2Line;
		byte player1Column;
		byte player2Column;
		
		
		boolean continueGamePlayer1 = true;
		boolean continueGamePlayer2 = true;
		displayBoardGame(morpionBoard);
		
		Scanner scan = new Scanner (System.in);
		int rounds = 0;
		
		do {
			
			player1Line = inputLine(scan, "Joueur 1");
			player1Column = inputColumn(scan, "Joueur 1");
			
			
			if (!(morpionBoard[player1Line][player1Column].equals(EMPTY))) {
				
				System.out.println("Cette emplacement est déjà occupé.");
				player1Line = inputLine(scan, "Joueur 1");
				player1Column = inputColumn(scan, "Joueur 1");
				
			} else {
				
				for(int indexLine = 0 ; indexLine < BOARD_GAME_SIZE; indexLine++) {
					for(int indexColumn = 0; indexColumn < BOARD_GAME_SIZE; indexColumn++) {
						
						morpionBoard[player1Line][player1Column] = "X";
						System.out.print(morpionBoard[indexLine][indexColumn]);
						System.out.print(" ");
							
					}
					System.out.println("");
				}
				
				
				
			}
			
			continueGamePlayer1 = verifyWin("X", morpionBoard);
			if(!continueGamePlayer1) {
				break;
			}
			
			player2Line = inputLine(scan, "Joueur 2");
			player2Column = inputColumn(scan, "Joueur 2");
			
			if (!(morpionBoard[player2Line][player2Column].equals(EMPTY))) {
				
				System.out.println("Cette emplacement est déjà occupé.");
				player2Line = inputLine(scan, "Joueur 2");
				player2Column = inputColumn(scan, "Joueur 2");
				
			} else {
				
				for(int indexLine = 0 ; indexLine < BOARD_GAME_SIZE; indexLine++) {
					for(int indexColumn = 0; indexColumn < BOARD_GAME_SIZE; indexColumn++) {
						
						morpionBoard[player2Line][player2Column] = "O";
						System.out.print(morpionBoard[indexLine][indexColumn]);
						System.out.print(" ");
							
					}
					System.out.println("");
				}
			}
			
			continueGamePlayer2 = verifyWin("O", morpionBoard);
			if(!continueGamePlayer2) {
				break;
			}
			rounds++;	
			
		}while(rounds <= BOARD_GAME_SIZE * BOARD_GAME_SIZE );
			
			if(rounds > BOARD_GAME_SIZE * BOARD_GAME_SIZE) {
				System.out.println("Match nul");
			}
			
			scan.close();
			
			
		
	}

}
