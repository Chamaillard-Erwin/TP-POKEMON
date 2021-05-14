package fr.eni.quelPokemon.bo;

/**
 * Classe qui définit un pokémon
 * @author echamaillard2021
 */
public class Pokemon {
    //Attributs de l'instance
    private String nom;
    private int taille;
    private int poids;
    private int pv;
    private final int pvMax;
    private int chanceCrit;
    private Attaque att01;
    private Attaque att02;
    private Attaque curAtt;
    private Dresseur dresseur;

    /**
     * Constructeur de la classe Pokémon
     * @param nom       String
     * @param taille    int
     * @param poids     int
     * @param pv        int
     * @param att01     Attaque
     * @param att02     Attaque
     */
    public Pokemon(String nom, int taille, int poids, int pv, int pvMax, Attaque att01, Attaque att02) {
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.pv = pv;
        this.pvMax = pvMax;
        this.att01 = att01;
        this.att02 = att02;
    }

    /**
     *  Affiche les informations du pokémon :
     *  Nom : XXXX
     *  Taille : 00
     *  Poids : 00
     *  Point de vie : 00/00
     *  Attaque : XXX
     *  Attaque : XXX
     *  Nom du dresseur : XXX
     */
    public void afficher() {
        System.out.printf("Nom : %s%nTaille : %.1fm%nPoids : %.1fkg%nPoint de vie : %d/%d%n", this.nom, (double)this.taille/100, (double)this.poids/10, this.pv, this.pvMax);
        this.att01.afficher();
        this.att02.afficher();
        System.out.printf("Nom du dresseur : %s", this.getDresseur().getPrenom());
    }

    //------Getters----------------------------------------------------//
    public Attaque getAtt01() {
        return att01;
    }

    public Attaque getAtt02() {
        return att02;
    }

    public Dresseur getDresseur() {
        return dresseur;
    }

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }

    public int getPv() {
        return pv;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getTaille() {
        return taille;
    }

    public int getChanceCrit() {
        return chanceCrit;
    }

    public Attaque getCurAtt() {
        return curAtt;
    }

    //------Setters----------------------------------------------------//

    public void setAtt01(Attaque att01) {
        this.att01 = att01;
    }

    public void setAtt02(Attaque att02) {
        this.att02 = att02;
    }

    public void setDresseur(Dresseur dresseur) {
        this.dresseur = dresseur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setChanceCrit(int chanceCrit) {
        this.chanceCrit = chanceCrit;
    }

    public void setCurAtt(Attaque curAtt) {
        this.curAtt = curAtt;
    }

}
