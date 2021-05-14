package fr.eni.quelPokemon.bo;

import java.util.Random;
/**
 * Classe qui définit le déroulement complet d'un combat
 * @author echamaillard2021
 */
public class Combat {
    //Attributs de l'instance
    private Pokemon pokemon01;
    private Pokemon pokemon02;
    private Random random = new Random();

    /**
     * Constructeur de la classe combat
     * @param pokemon01
     * @param pokemon02
     */
    public Combat(Pokemon pokemon01, Pokemon pokemon02) {
        this.pokemon01 = pokemon01;
        this.pokemon02 = pokemon02;
        lancerCombat();
    }

    /**
     * Méthode principale de l'instance
     */
    public void lancerCombat() {
        do {
            tourCombat();
        }while (this.pokemon01.getPv() > 0 && this.pokemon02.getPv() > 0);
    }

    /**
     * Déroulement d'un tour de combat
     */
    public void tourCombat() {
        calChance(this.pokemon01);
        curAttaque(this.pokemon01);
        recevoirDegats(this.pokemon02, this.pokemon01);
        if (this.pokemon02.getPv() > 0) {
            calChance(this.pokemon02);
            curAttaque(this.pokemon02);
            recevoirDegats(this.pokemon01, this.pokemon02);
        }
    }

    /**
     * Calcule les chances d'attaque 02
     * @param pokemon
     */
    public void calChance(Pokemon pokemon) {
        if (pokemon.getPv() < pokemon.getPvMax()*0.25) {
            pokemon.setChanceCrit(50);
        }
        else {
            pokemon.setChanceCrit(10);
        }
    }

    /**
     * Définit l'attaque actuelle du pokémon
     * @param pokemon
     */
    public void curAttaque(Pokemon pokemon) {
        int chance = random.nextInt(101);
        if (chance < pokemon.getChanceCrit()) {
            pokemon.setCurAtt(pokemon.getAtt02());
        }
        else {
            pokemon.setCurAtt(pokemon.getAtt01());
        }
    }

    /**
     * Modifie les points de vie d'un pokémon en fonction de l'attaque de l'autre pokémon
     * @param defenseur
     * @param attaquant
     */
    public void recevoirDegats(Pokemon defenseur, Pokemon attaquant) {
        defenseur.setPv(defenseur.getPv() - attaquant.getCurAtt().getDgts());
        System.out.printf("%s de %s attaque avec %s%n", attaquant.getNom(), attaquant.getDresseur().getPrenom(), attaquant.getCurAtt().getNom());
        if(defenseur.getPv() <= 0) {
            defenseur.setPv(0);
        }
        System.out.printf("%s de %s subit l'attaque %s et perd %d Pv%nIl lui reste %d/%d%n", defenseur.getNom(), defenseur.getDresseur().getPrenom(),
                attaquant.getCurAtt().getNom(), attaquant.getCurAtt().getDgts(), defenseur.getPv(), defenseur.getPvMax());
        if(defenseur.getPv() == 0) {
            System.out.printf("Le pokémon %s de %s à été vaincu !", defenseur.getNom(), defenseur.getDresseur().getPrenom());
        }
    }

}
