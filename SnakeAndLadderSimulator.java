package com.bridgelabz.snakeandladdersimulator;

public class SnakeAndLadderSimulator_1 {
	// Use Random Function to get a dice between 1-6
	public static int rollDice() {
		// Random random = new Random();
		int dicevalue = (int) Math.floor(Math.random() * 10) % 6 + 1;
		return dicevalue;
	}
	public static void main(String args[]) {
		//Variables
		int Player1Position = 0;
		// Print Welcome Message
		System.out.println("Welcome in Snake And Ladder Simulator Program");
		int random = rollDice();
		System.out.println(random);
	}
}
