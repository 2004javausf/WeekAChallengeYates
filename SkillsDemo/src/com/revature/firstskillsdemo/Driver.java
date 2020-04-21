package com.revature.firstskillsdemo;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Game[] arrayOfGames = new Game[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<arrayOfGames.length; i++) {
		
			System.out.println("Please enter your name: ");
			String name = scan.nextLine();
			Player player = new Player(name);
			System.out.print("Enter the name of a game: ");
			String nameOfGame = scan.nextLine();
			Integer score;
			do {
				System.out.print("Enter your score(less than a hundred): ");
				String playerScore = scan.nextLine();
				score = Integer.parseInt(playerScore);
				if(score>=100) {
					System.out.println("Score not allowed!");
				}
			} while(score>=100);
			
			
			Game someGame = new Game(player, nameOfGame, score);
		
			arrayOfGames[i] = someGame;
			
			
		
		}
		
		System.out.println("Printing out all the scores.");
		getPlayerScores(arrayOfGames);
		
		System.out.println();
		System.out.println("Printing out a winner and their score.");
		
		System.out.println("Please enter a name: ");
		String personOne = scan.nextLine();
		System.out.println("Please enter a name: ");
		String personTwo = scan.nextLine();
		getPlayerScores(personOne, personTwo, arrayOfGames);
		
		System.out.println();
		System.out.println("Printing out all the scores between a low number and a high number.");
		
		System.out.println("Please enter a low number: ");
		int lowNum = scan.nextInt();
		System.out.println("Please enter a high number: ");
		int highNum = scan.nextInt();
		getPlayerScores(lowNum, highNum, arrayOfGames);
					

	}
	
	//prints out all the scores
	public static void getPlayerScores(Game[] aGameArray) {
		for(Game i: aGameArray) {
			System.out.println(i.getScore());
		}
	}
	
	public static void getPlayerScores(String firstPerson, String secondPerson, Game[] aGameArray) {
		int firstScore = 0;
		int secondScore = 0;
		int firstPersonsGame = 0;
		int secondPersonsGame = 0;
		int posInArray = 0;
		for(int i = 0; i < aGameArray.length; i++) {
			if(aGameArray[i].getGameOwner().getName().equals(firstPerson)) {
				firstScore = aGameArray[i].getScore();
				firstPersonsGame = i;
			}
			if(aGameArray[i].getGameOwner().getName().equals(secondPerson)) {
				secondScore = aGameArray[i].getScore();
				secondPersonsGame = i;
			}
		}
		if(firstScore > secondScore) {
			System.out.println("The winner is " + aGameArray[firstPersonsGame].getGameOwner().getName() + " and their score is: " + firstScore + ".");
		} else {
			System.out.println("The winner is " + aGameArray[secondPersonsGame].getGameOwner().getName() + " and their score is: " + secondScore + ".");
		}
	}
	
	public static void getPlayerScores(int low, int high, Game[] aGameArray) {
		for(int i = 0; i < aGameArray.length; i++) {
			if((aGameArray[i].getScore() >= low) && (aGameArray[i].getScore() <= high)){
				System.out.println("The name of the game is " + aGameArray[i].getNameOfGame() + " and the score is " + aGameArray[i].getScore());
			}
		}
	}

}
