import pokemon.PokemonAgua;
import pokemon.PokemonFuego;

public class BatallaPokemon {
    public static void main(String[] args) {
        Pokemon Charmander = new PokemonFuego("Charmander", 10);
        PokemonAgua Kadabra = new PokemonPsiquico("Kadabra", 10);

        Charmander.atacar(3, Kadabra);
        Kadabra.atacar(2, Charmander);
    }
}