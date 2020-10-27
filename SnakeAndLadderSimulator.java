package com.bridgelabz.snakeandladdersimulator;

public class SnakeAndLadderSimulator_1 {
	// Use Random Function to get a dice between 1-6
	public static int rollDice() {
		// Random random = new Random();
		int dicevalue = (int) Math.floor(Math.random() * 10) % 6 + 1;
		return dicevalue;
	}
	// Use CheckOption Function to check Player get a Ladder or snake or player play or not
	public static int checkOption() {
		return (int) Math.floor(Math.random() * 10) % 3 + 1;
	}
	public static void main(String args[]) {
		// Print Welcome Message
		System.out.println("Welcome in Snake And Ladder Simulator Program");
		//Variables
		int Player1Position = 0;
		int Player2Position = 0;
		int PlayGame1 = 0;
		int PlayGame2 = 0;
		int WinPoint= 100;

		while(Player1Position < 100) {
		System.out.println();
		System.out.println("=====PLayerOne turn=======");

		int random = rollDice();
		int option = checkOption();
		PlayGame++;
		// Use Switch case for option
		switch (option) {
		case 1:
			System.out.println("Player not play");
			break;
		case 2:
			System.out.println("You got the Ladder");
			Player1Position += random;
			// In case the Player position go above 100,the player stay in the same previous
			// position till the player gets no that adds to 100.
			if (Player1Position > WinPoint) {
				Player1Position -= random;
			}
			break;
		case 3:
			System.out.println("Oops! you got the Snake");
			Player1Position -= random;
			// In case the player position moves below 0, then the player restarts from 0
                    	if (Player1Position < 0) {
                        	Player1Position = 0;
                    	} else {
                        	Player1Position -= random;
                    	}
			break;
		default:
			System.out.println("Something Wrong");

		}
		System.out.println("\nPlayer1 position is:" + Player1Position);
		System.out.println();

		System.out.println("=====PlayerTwo turn=====");
			random = rollDice();
			PlayGame2++;
			option = checkOption();
			// Use Switch case for option
			switch (option) {
			case 1:
				System.out.print("Player2 not play");
				break;
			case 2:
				Player2Position += random;
				System.out.print("You got the Ladder" + Player2Position);
				// In case the Player position go above 100,the player stay in the same previous
				// position till the player gets no that adds to 100.
				if (Player2Position > 100) {
					Player2Position -= random;
				}
				break;
			case 3:
				Player2Position -= random;
				System.out.print("Oops! you got the Snake" + Player2Position);
				// In case the player position moves below 0, then the player restarts from 0
				if (Player2Position < 0) {
					Player2Position = 0;
				} else {
					Player2Position -= random;
				}
				break;
			default:
				System.out.println("Something Wrong");
			}
			System.out.println("\nPlayer2 position is:" + Player2Position);

			// check the condition which player has won the game.
			if (Player1Position == 100 || Player2Position == 100) {
				if (Player1Position == 100) {
					System.out.println();
					System.out.println("Congratulation Player1 is won");
					System.out.println("Number of time the Dice was Played by Player1:" + PlayGame1);
				} else {
					System.out.println();
					System.out.println("Congratulation Player2 is won");
					System.out.println("Number of time the Dice was Played by Player2:" + PlayGame2 + "times");

				}
				break;
			}
		}
	}
}
