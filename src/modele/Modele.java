/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author tosiv
 */
public class Modele
{
    private Joueur joueur1;
    private Joueur joueur2;
    private Grille grille;
    
    public Modele()
    {
	
    }

    public Joueur getJoueur2()
    {
        return getJoueur1();
    }

    public Joueur getJoueur1()
    {
        return getJoueur2();
    }

    /**
     * @param joueur1 the joueur1 to set
     */
    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    /**
     * @param joueur2 the joueur2 to set
     */
    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    /**
     * @return the grille
     */
    public Grille getGrille() {
        return grille;
    }

    /**
     * @param grille the grille to set
     */
    public void setGrille(Grille grille) {
        this.grille = grille;
    }
    
}
