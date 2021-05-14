package fr.eni.quelPokemon.bo;

public class Dresseur {

    private String prenom;
    private Pokemon[] pokemonTab = new Pokemon[20];

    public Dresseur(String prenom) {
        this.prenom = prenom;
    }

    public void afficher() {
        System.out.printf("Nom du dresseur : %s%nCollection de pokémons :%n", this.prenom);
        for (Pokemon pokemon : this.pokemonTab) {
            if (pokemon != null) {
                System.out.printf("- %s", pokemon.getNom());
            }

        }

    }

    public Pokemon[] getPokemonTab() {
        return pokemonTab;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPokemonTab(Pokemon[] pokemonTab) {
        this.pokemonTab = pokemonTab;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void capture(Pokemon pokemon) {
        for (int i = 0; i < this.pokemonTab.length; i++) {
            if(this.pokemonTab[i] == null) {
                this.pokemonTab[i] = pokemon;
                pokemon.setDresseur(this);
                break;
            }
        }
    }



}
