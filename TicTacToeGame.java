package com.TicTacToeGame;

/**
 * @author BALU
 * purpose: TicTacToe program game where  player and computer can play the game
 */
public class TicTacToeGame {
	
	//variables
	private static char[] element;
	static char userMark, computerMark;
	static int userNumber;
	
	public static void main(String[] args) {
		//for creating empty elements
		boardCreation();
		//for user to choose 'X' or 'O' mark
		choosingXorO();
		//for display the current board
		currentBoard();
		//for calling the user for number
		userCall();
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
	
	/**
	 * Displays board layout
	 * Elements are assigned with marks and numbers
	 */
	private static void displayingBoard() {
		System.out.println("\n  "+element[1]+" | "+element[2]+" | "+element[3]+" ");
		System.out.println(" ----------- ");
		System.out.println("  "+element[4]+" | "+element[5]+" | "+element[6]+" ");
		System.out.println(" ----------- ");
		System.out.println("  "+element[7]+" | "+element[8]+" | "+element[9]+" \n");
	}
	
	/**
	 * Assigning elements with numbers if it is not marked
	 * @param element[]
	 */
	private static void currentBoard() {
		for (int i=1;i<10;i++) {
			if (element[i] !='X'&&element[i] !='O') {
				element[i]=(char) (i+'0');
			}
		}
	    displayingBoard();
	}
	
	/**
	 * Asking user for a number and checks whether the number is with in the board
	 * @param userNumber
	 */
	private static void userCall() {
	    System.out.println("\nEnter a number from board to make the mark:\n");
	    userNumber = Utility.getUserInteger();
	    if (userNumber < 1 || userNumber > 9) {
	    	currentBoard();
	    	System.out.println("Your input is Invalid");
	    	userCall();
	    }
	}
}