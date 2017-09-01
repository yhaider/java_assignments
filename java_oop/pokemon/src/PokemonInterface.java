
public interface PokemonInterface {
	
	Pokemon createPokemon(String name, String type, int health);
	// Creates a pokemon
	
	void attackPokemon(Pokemon pokemon);
	
	void pokemonInfo(Pokemon pokemon);
}
