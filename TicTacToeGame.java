package com.TicTacToeGame;

/**
 * @author BALU
 * purpose: TicTacToe program game where  player and computer can play the game
 */
public class TicTacToeGame {
	
	//variables
	private static char[] element;
	
	public static void main(String[] args) {
		//for creating empty elements
		boardCreation();
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
}