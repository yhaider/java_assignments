package com.yasmeen.tr.models;

public class Player {
	private String firstName;
	private String lastName;
	private Integer age;
	// All attributes of Players
	
	public Player() {
		this.setFirstName("undefined");
		this.setLastName("undefined");
		this.setAge(null);
	}
	public Player(String firstName, String lastName, Integer age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
	// Constructors for the Player class
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	// Getters and setters for the attributes of a player
	
}
