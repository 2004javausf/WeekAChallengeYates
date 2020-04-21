package com.revature.firstskillsdemo;

public class Player {
	private String name;
	private int age;
	private String winningStreak;
	

	// Constructors
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWinningStreak() {
		return winningStreak;
	}
	public void setWinningStreak(String winningStreak) {
		this.winningStreak = winningStreak;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
