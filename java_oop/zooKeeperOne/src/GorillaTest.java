
public class GorillaTest {
	
	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		
		g.throwObject();
		g.throwObject();
		g.throwObject();
		
		g.eatBananas();
		g.eatBananas();
		
		g.climbTree();
		
		g.displayEnergyLevel();
		
	}
	// Here we're testing the Gorilla and (implicitly) the Mammal classes
	// We create a gorilla, have him throw objects three times, eat bananas
	// twice, and climb a tree. Then we display the energy level. 
	// We get 95.
	
}
