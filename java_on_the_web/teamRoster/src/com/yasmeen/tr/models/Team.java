package com.yasmeen.tr.models;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> team = new ArrayList<Player>();
	private Integer num;
	private Integer id;
	// Attributes of Team
	
	private static ArrayList<Team> allteams = new ArrayList<Team>();
	private static int newid = 0;
	// An attribute specific to the Team class
	
	public Team() {
		this.setName("Undefined");
		this.setNum(0);
		allteams.add(this);
		this.setId(newid);
		newid++;
	}
	public Team(String name) {
		this.setName(name);
		this.setNum(0);
		allteams.add(this);
		this.setId(newid);
		newid++;
	}
	// Constructors for the Team class
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player> getTeam() {
		return team;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	// Getters and setters
	
	public void addPlayer(String firstname, String lastname, Integer age) {
		Player player = new Player(firstname, lastname, age);
		this.team.add(player);
		this.setNum(this.getNum()+1);
	}
	// Adding a new player to the team
	
	public static ArrayList<Team> getAllteams() {
		return allteams;
	}
	// Getting all the teams
	
	
}
