// Essentially copied from zooKeeperOne

public class Gorilla extends Mammal{
// Since our gorilla class extends mammal, we have access to the methods
// in the mammal class, which you will see us use in the methods below
	
	public void throwObject() {
		System.out.println("The gorilla has thrown something!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	// Throwing an object will result in a message and decreasing energy by 5
	
	public void eatBananas() {
		System.out.println("The gorilla appears smugly satisfied as he finishes off his tenth banana.");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	// Eating bananas will result in a message and increasing energy by 10
	
	public void climbTree() {
		System.out.println("The gorilla lumbers over to a nearby tree and easily scales it.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	// Climbing a tree will result in a message and decreasing energy by 10
}
