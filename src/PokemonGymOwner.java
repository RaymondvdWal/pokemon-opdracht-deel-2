import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

    String town;
    String gymOwner;

    public PokemonGymOwner(String gymOwner,String town,List<Pokemon> pokemons,String name ) {
        super(name, pokemons);
        this.town = town;
        this.gymOwner = gymOwner;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getGymOwner() {
        return gymOwner;
    }

    public void setGymOwner(String gymOwner) {
        this.gymOwner = gymOwner;
    }
}
