package fr.eni.tp;

import java.util.Scanner;

public class BatailleNavale {
	
	static final int BOARD_GAME_SIZE = 4;
	static final char QUESTION_MARK = '?';
	static final char BOAT = 'B';
	static final char WAVE = '~';
	
	static void displayBoardGame(char [][]boardGame) {
		System.out.println("    1 2 3 4");
		System.out.println("    -------");
		for (int indexLine = 0; indexLine < BOARD_GAME_SIZE; indexLine++) {
			System.out.print((indexLine + 1) + " | ");
			for (int indexColumn = 0; indexColumn < BOARD_GAME_SIZE; indexColumn++) {
				System.out.print(boardGame[indexLine][indexColumn]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	static byte inputLine(Scanner scan) {
		byte userLine;
		
		do {
			System.out.println("Veuillez renseigner la ligne du tir");
			userLine = scan.nextByte();
			scan.nextLine();
			if (!(userLine >= 1 && userLine <= BOARD_GAME_SIZE)) {
				System.out.println("S'il te plaît, respecte la règle du jeu.");
			}
		} while (!(userLine >= 1 && userLine <= BOARD_GAME_SIZE));
		
		userLine--;
		
		return userLine;
	}
	
	static byte inputColumn(Scanner scan) {
		byte userColumn;
		do {
			System.out.println("Veuillez renseigner la colonne du tir");
			userColumn = scan.nextByte();
			scan.nextLine();
			if (!(userColumn >= 1 && userColumn <= BOARD_GAME_SIZE)) {
				System.out.println("S'il te plaît, respecte la règle du jeu.");
			}
		} while (!(userColumn >= 1 && userColumn < BOARD_GAME_SIZE));
		
		userColumn--;
		
		return userColumn;
	}
	
	static char[][] updateBoardGame(byte userLine, byte userColumn, byte boatLine, byte boatColumn, char [][]boardGame) {
		if (userLine == boatLine && userColumn == boatColumn) {
			boardGame[userLine][userColumn] = BOAT;
		} else {
			boardGame[userLine][userColumn] = WAVE;
		}
		
		return boardGame;
	}
	
	static boolean updateContinueGame(byte userLine, byte userColumn, byte boatLine, byte boatColumn, boolean continueGame) {
		if (userLine == boatLine && userColumn == boatColumn) {
			System.out.println("Touché coulé");
			continueGame = false;
		} else {
			System.out.println("Plouf !");
			continueGame = true;
		}
		
		return continueGame;
	}
	
	static char[][] initializeBoardGame(char [][]boardGame) {
		for (int indexLine = 0; indexLine < BOARD_GAME_SIZE; indexLine++) {
			for (int indexColumn = 0; indexColumn < BOARD_GAME_SIZE; indexColumn++) {
				boardGame[indexLine][indexColumn] = QUESTION_MARK;
			}
		}
		
		return boardGame;
	}
	
	public static void main(String[] args) {
		
		// DECLARATION
		// Déclaration de mon tableau qui va représenter le plateau de jeu.
		// Deux variables pour la ligne et la colonne du bateau.
		
		// Initialiser mon tableau - FONCTION
		
		// Faire jouer le joueur - BOUCLE
		//// Lui demander des coordonnées - SCANNER
		//// Vérifier si ces coordonnées correspondent au bateau - CONDITIONS
		////// Si ces coordonnées correspondent alors le jeu est terminé - AFFICHAGE
		////// Sinon le jeu continue
		//// On va afficher le plateau de jeu qui a été mis à jour
		//// On va répéter l'opération si le jeu continue
		
		
		char[][] boardGame = new char[BOARD_GAME_SIZE][BOARD_GAME_SIZE];
		byte boatLine = 0;
		byte boatColumn = 0;

		boolean continueGame = true;
		Scanner scan = new Scanner(System.in);

		boardGame = initializeBoardGame(boardGame);
		
		displayBoardGame(boardGame);
		
		do {
			byte userLine = inputLine(scan);
			byte userColumn = inputColumn(scan);
			
			boardGame = updateBoardGame(userLine, userColumn, boatLine, boatColumn, boardGame);
			continueGame = updateContinueGame(userLine, userColumn, boatLine, boatColumn, continueGame);
			displayBoardGame(boardGame);

		} while(continueGame == true);
		
		scan.close();
		
	}
	
}
