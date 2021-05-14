package fr.eni.quelPokemon.bo;
/**
 * Classe qui définit une attaque de pokémon
 * @author echamaillard2021
 */
public class Attaque {
    //Attribut de l'instance
    private String nom;
    private int dgts;


    /**
     * Constructeur de la classe Attaque
     * @param nom
     * @param dgts
     */
    public Attaque(String nom, int dgts) {
        this.nom = nom;
        this.dgts = dgts;
    }

    /**
     * Affiche les détails de l'attaque
     * Nom : XXX
     * Dégâts : XXX
     */
    public void afficher() {
        System.out.printf("Attaque : %s Dégâts : %d%n", this.nom, this.dgts);
    }
    //------Getters----------------------------------------------------//
    public int getDgts() {
        return dgts;
    }

    public String getNom() {
        return nom;
    }
    //------Setters----------------------------------------------------//
    public void setDgts(int dgts) {
        this.dgts = dgts;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
