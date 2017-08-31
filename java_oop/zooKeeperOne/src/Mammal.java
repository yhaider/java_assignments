
public class Mammal {
	private int energyLevel = 100;
	// Every mammal has a default energy level as 100
	
	public Mammal() {}
	// Constructor
	
	public int displayEnergyLevel() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	// This prints and returns the mammal's energy level

	public int getEnergyLevel() {
		return this.energyLevel;
	}
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
	}
	// Simple getter and setter methods for the energy 
	// level attribute
}
