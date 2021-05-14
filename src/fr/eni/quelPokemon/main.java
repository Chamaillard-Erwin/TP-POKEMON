package fr.eni.quelPokemon;

import fr.eni.quelPokemon.bo.Attaque;
import fr.eni.quelPokemon.bo.Combat;
import fr.eni.quelPokemon.bo.Dresseur;
import fr.eni.quelPokemon.bo.Pokemon;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        //Sacha Touille croise Ondine Sesoir
        Dresseur dresseur01 = new Dresseur("Sacha");
        Dresseur dresseur02 = new Dresseur("Ondine");

        //Un pikachu fait son apparition !
        Pokemon pikachu01 = new Pokemon("Pikachu", 40, 60, 120, 120, new Attaque("Statik", 20), new Attaque("Paratonerre", 75));

        //Ce bon vieux Sacha capture Pikachu
        dresseur01.capture(pikachu01);

        //Ondine quant à elle attrape un rat !
        Pokemon rattata = new Pokemon("Rattata", 30, 35, 90, 90, new Attaque("Cran", 10), new Attaque("Agitation", 35));
        dresseur02.capture(rattata);

        //Un combat s'engage entre Ondine Sesoir et Sacha Touille
        Combat combat01 = new Combat(pikachu01, rattata);


    }

}
