
public class HumanTest {
	
	public static void main(String[] args) {
		Human r = new Human();
		Human m = new Human("Mark");
		
		r.setName("Robb");
		r.attack(m);
		m.attack(r);
		
		Human x = new Human();
		Human y = new Human();
		
		x.attack(y);
		
		r.attack(y);
		y.attack(r);
	}
	// Test for all four cases as far as if name occurs in attacker 
	// and victim to ensure the correct message appears
}
