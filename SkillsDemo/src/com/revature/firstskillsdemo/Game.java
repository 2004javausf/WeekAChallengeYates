package com.revature.firstskillsdemo;

public class Game {
		//fields
	private String nameOfGame;
	private int health;
	private Player gameOwner;
	
	private int score;
	
	//Constructors
	public Game() {
		
	}
	
	public Game(Player gameOwner, String nameOfGame, int score) {
		this.gameOwner = gameOwner;
		this.nameOfGame = nameOfGame;
		this.score = score;
		
	}
	
	//Getters and Setters
	public Player getGameOwner() {
		return gameOwner;
	}
	
	public void setGameOwner(Player gameOwner) {
		this.gameOwner = gameOwner;
	}
	
	public String getNameOfGame() {
		return nameOfGame;
	}
	
	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

}
