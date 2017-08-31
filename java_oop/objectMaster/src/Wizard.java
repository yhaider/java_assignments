
public class Wizard extends Human {
// Extends from the human class so we can use
// methods from there
	
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public Wizard(String name) {
		this.setName(name);
		this.setHealth(50);
		this.setIntelligence(8);
	}
	// Constructors, one with name and one without
	
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.getIntelligence());
		if(human.getName() != null && this.getName() != null) {
			System.out.println(this.getName() + " healed " + human.getName() + " by " + this.getIntelligence());
		}
		else if(human.getName() != null && this.getName() == null) {
			System.out.println(human.getName() + " was healed by this wizard by " + this.getIntelligence());
		}
		else if(human.getName() == null && this.getName() != null) {
			System.out.println(this.getName() + " healed a human by " + this.getIntelligence());
		}
		else {
			System.out.println("This wizard healed a human by " + this.getIntelligence());
		}
	}
	// Heals a human based on the intelligence of the wizard
	// Message displayed depends on if both parties have a name to 
	// refer to them as
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth() - (this.getIntelligence() * 3));
		if(human.getName() != null && this.getName() != null) {
			System.out.println(this.getName() + " fireballed " + human.getName() + " by " + (this.getIntelligence() * 3));
		}
		else if(human.getName() != null && this.getName() == null) {
			System.out.println(human.getName() + " was fireballed by this wizard, losing " + (this.getIntelligence() * 3) + " health.");
		}
		else if(human.getName() == null && this.getName() != null) {
			System.out.println(this.getName() + " fireballed a human by " + (this.getIntelligence() * 3));
		}
		else {
			System.out.println("This wizard fireballed a human by " + (this.getIntelligence() * 3));
		}
	}
	// Fireballing involves the recipient human to lose 3x the wizard's intelligence
	// amount of health, and it displays a message based on names
}
