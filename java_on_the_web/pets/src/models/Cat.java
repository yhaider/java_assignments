package models;

public class Cat extends Animal {
	
	public Cat() {}
	public Cat(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	// Constructors for cat class
	
	@Override
	public String showAffection() {
		return "Your " + this.getBreed() + " cat, " + this.getName() + ", looked at you with some affection. You think so, at least.";
	}
}
