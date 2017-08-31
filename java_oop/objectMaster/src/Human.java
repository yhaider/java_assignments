
public class Human {
	private String name;
	private int health;
	private int strength;
	private int intelligence;
	private int stealth;
	// All the attributes for the human class
	
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.setIntelligence(3);
		this.setStealth(3);
	}
	public Human(String name) {
		this.name = name;
		this.health = 100;
		this.strength = 3;
		this.setIntelligence(3);
		this.setStealth(3);
	}
	// Constructors
	
	
	public void setName(String name){
		this.name = name;
	}
    public String getName(){
    		return name;
    	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	// Getter and setter methods for attributes
	
	
	public void attack(Human human) {
		human.setHealth(human.getHealth() - strength);
		if(human.getName() != null && name != null) {
			System.out.println(name + " attacked " + human.getName() + " and gave them " + strength + " damage.");
		}
		else if (human.name == null && name == null){
			System.out.println("An attack broke out between two humans.");
		}
		else if(human.getName() == null && name != null) {
			System.out.println(name + " attacked another human and gave them " + strength + " damage.");
		}
		else if(human.getName() != null && name == null) {
			System.out.println(human.getName() + " was attacked and received " + strength + " damage.");
		}
		
	}	
	// Attacking a human will lead to a message based on existence 
	// of a name and a decrease in the attacked human's health by 
	// the attacker's strength
	
	
	
	
	
}
