
public class Samurai extends Human {
	private static int count = 0;

	public Samurai() {
		this.setHealth(200);
		count++;
	}
	public Samurai(String name) {
		this.setName(name);
		this.setHealth(200);
		count++;
	}
	// Constructors based on whether name is
	// being initialized at the start or later
	
	public void deathBlow(Human human){
        human.setHealth(0);
        this.setHealth(this.getHealth()/2);
        if(human.getName() != null && this.getName() != null) {
			System.out.println(this.getName() + " killed " + human.getName() + " but lost half of their health.");
		}
		else if(human.getName() != null && this.getName() == null) {
			System.out.println(human.getName() + " was killed by this samurai, who lost half of their health.");
		}
		else if(human.getName() == null && this.getName() != null) {
			System.out.println(this.getName() + " killed a human and lost half of their health.");
		}
		else {
			System.out.println("This samurai killed a human and lost half of their health.");
		}
    }
	// A death blow involves killing the human victim but also the samurai
	// loses half their health, along with a display message
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth()/2));
		if(this.getName() != null) {
			System.out.println(this.getName() + " meditated and gained " + (this.getHealth()/2) + " health.");
		}
		else {
			System.out.println("This samurai meditated and gained " + (this.getHealth()/2) + " health.");
		}
	}
	// Meditating results in the samurai gaining half of their current health
	// and displays a message
	
	public int howMany() {
		System.out.println("The total number of samurai is: " + count);
		return count;
	}
}
