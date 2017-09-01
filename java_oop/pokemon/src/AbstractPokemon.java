
public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}
	// Creates new pokemon and returns it
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println("Pokemon of type " + pokemon.getType() + " was attacked and lost 10 health.");
	}
	// Attacks a pokemon and displays a message
}
