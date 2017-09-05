package models;

public class Dog extends Animal{

	public Dog() {}
	public Dog(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	// Constructors for the dog class
	
	@Override
	public String showAffection() {
		if(this.getWeight() < 30.0) {
			return this.getName() + " hopped into your lap and cuddled you!";
		}
		else {
			return this.getName() + " curled up next to you!";
		}
	}
	// Overrides the showAffection in the pet interface which is
	// implemented in the Animal abstract class which extends into 
	// this Dog class
	
}
