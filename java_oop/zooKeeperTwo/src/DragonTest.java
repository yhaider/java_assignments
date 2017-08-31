
public class DragonTest {

	public static void main(String[] args) {
		
		Dragon d = new Dragon();
		
		d.displayEnergyLevel();
		
		d.attackTown();
		d.attackTown();
		d.attackTown();
		
		d.eatHuman();
		d.eatHuman();
		
		d.fly();
		d.fly();
		
		d.displayEnergyLevel();
	}
	// We created a dragon and displayed his initial energy level.
	// He attacked three towns, ate two humans, and flew twice.
	// We then displayed his energy level again.
}
