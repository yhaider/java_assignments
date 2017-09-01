
public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	private static int count;
	
	public Pokemon() {
		setCount(getCount() + 1);
	}
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		setCount(getCount() + 1);
	}
	// Constructors for pokemon
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
	// Getter and setter methods for the attributes
	// of the pokemon, as well as grabbing the number
	// of total pokemon

	public void getNum() {
		System.out.println("Total Pokemon: " + count);
	}
	// Method to print the number of pokemon created
}
