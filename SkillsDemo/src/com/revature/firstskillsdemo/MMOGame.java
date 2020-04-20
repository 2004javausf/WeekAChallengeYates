package com.revature.firstskillsdemo;

public class MMOGame {
	//fields
private String nameOfGame;
private int score;

//Getters and Setters

public String getNameOfGame() {
	return nameOfGame;
}
public void setNameOfGame(String nameOfGame) {
	this.nameOfGame = nameOfGame;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

//Constructors
public MMOGame() {
	
}
public MMOGame(String nameOfGame, int score) {
	this.nameOfGame = nameOfGame;
	this.score = score;
	
}




}
