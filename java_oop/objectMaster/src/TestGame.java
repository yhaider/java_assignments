
public class TestGame {

	public static void main(String[] args) {
		Human h = new Human("Harold");
		Ninja n = new Ninja("Nathan");
		Wizard w = new Wizard("William");
		Samurai s = new Samurai("Sam");
		Human h2 = new Human("Henry");
		
		n.steal(h);
		w.heal(h);
		s.deathBlow(h);
		n.runAway();
		s.meditate();
		s.howMany();
		w.fireball(h2);

	}

}
