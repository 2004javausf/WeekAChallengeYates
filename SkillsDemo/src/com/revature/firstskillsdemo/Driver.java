package com.revature.firstskillsdemo;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of a game: ");
		String nameOfGame = scan.nextLine();
		
		System.out.print("Enter your score: ");
		String playerScore = scan.nextLine();
		Integer score = Integer.parseInt(playerScore);
		
		

	}

}
