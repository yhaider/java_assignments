
public class Ninja extends Human {

		public Ninja() {
			this.setStealth(10);
		}
		public Ninja(String name) {
			this.setName(name);
			this.setStealth(10);
		}
		// Constructors based on whether
		// they are being initialized with a name
		
		public void steal(Human human) {
			human.setHealth(human.getHealth() - this.getStealth());
			this.setStealth(this.getStealth() * 2);
			if(human.getName() != null && this.getName() != null) {
				System.out.println(this.getName() + " stole " + this.getStealth() + " health from " + human.getName());
			}
			else if(human.getName() != null && this.getName() == null) {
				System.out.println(human.getName() + " fell victim to a ninja and lost " + this.getStealth() + " health.");
			}
			else if(human.getName() == null && this.getName() != null) {
				System.out.println(this.getName() + " stole " + this.getStealth() + " health from a human.");
			}
			else {
				System.out.println("This ninja stole " + this.getStealth() + " health from a human.");
			}
		}
		// Stealing involves the ninja taking the same amount of stealth he has
		// from the human's health and adding it to his own
		// A message is displayed based on names
		
		public void runAway() {
			this.setHealth(this.getHealth() - 10);
			if(this.getName() != null) {
				System.out.println(this.getName() + " ran away, resulting in losing 10 health.");
			}
			else {
				System.out.println("This ninja ran away, resulting in losing 10 health.");
			}
		}
		// Running away removes 10 health from the ninja and results in a
		// message depending on the name situation of the ninja
}
