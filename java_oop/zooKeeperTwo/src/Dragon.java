// Side note: I'm aware a dragon would not be a mammal
// I'm simply following the assignment's rules (as cringe-inducing 
// as it may be to classify a dragon as a mammal)

public class Dragon extends Mammal {

	public Dragon() {
		this.setEnergyLevel(300);
	}
	// A dragon starts off with 300 energy, so by specifying
	// in the constructor to immediately set the level 300
	// we override the default set in the mammal class
	
	public void fly() {
		System.out.println("You feel massive gusts of wind as the dragon's wings beat and it flies upward.");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	// Flying results in a message and decreasing the energy by 50
	
	public void eatHuman() {
		System.out.println("You hear a gut wrenching sound as you turn to see the dragon finishing up a human meal.");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	// Eating humans results in a message and increasing energy by 25
	
	public void attackTown() {
		System.out.println("You smell smoke and hear wailing cries as you notice the dragon calmly attacking a town for pleasure.");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	// Attacking a town results in a message and decreasing energy by 100
	// Takes a lot of effort to burn a place down!
	
	
}
