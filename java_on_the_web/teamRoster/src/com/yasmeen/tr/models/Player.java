package com.yasmeen.tr.models;

public class Player {
	private String firstName;
	private String lastName;
	private Integer age;
	private Integer id;
	private static int newid = 0;
	// All attributes of Players
	
	public Player() {
		this.setFirstName("undefined");
		this.setLastName("undefined");
		this.setAge(null);
		this.setId(newid);
		newid++;
	}
	public Player(String firstName, String lastName, Integer age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setId(newid);
		newid++;
	}
	// Constructors for the Player class
	// we have to set a new id for each player
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	// Getters and setters for the attributes of a player
	
	
}
