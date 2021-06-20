package com.TicTacToeGame;

/**
 * @author BALU
 * purpose: TicTacToe program game where  player and computer can play the game
 */
public class TicTacToeGame {
	
	//variables
	private static char[] element;
	static char userMark, computerMark;
	
	public static void main(String[] args) {
		//for creating empty elements
		boardCreation();
		//for user to choose 'X' or 'O' mark
		choosingXorO();
	}
	
	/**
	 * creating elements with null
	 * 0th index ignored for user friendly
	 * @param element
	 */
	private static void boardCreation() {
		element=new char[10];
		for(int i=1; i < 10; i++) {
			element[i]=' ';
		}
	}
	
	/**
	 * Asking user to choose X or O
	 * @param option
	 * @return userMark, computerMark
	 */
	private static void choosingXorO() {
		System.out.println("Choose 1 for 'X' or Choose 2 for 'O' as your mark");
		int option = Utility.getUserInteger();
		switch (option) {
		case 1: userMark = 'X';
				computerMark = 'O';
						break;
		case 2: userMark = 'O';
			computerMark = 'X';
			break;
		default:
			System.out.println("Your input is invalid");
			choosingXorO();
		}
	}
}