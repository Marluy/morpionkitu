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
public class Carreau
{
    private Coordonnee coordonnee;
    private JoueurEffectif joueur;
    
    Carreau(Coordonnee coordonnee)
    {
	this.coordonnee = coordonnee;
    }

    /**
     * @param joueur the joueur to set
     */
    public void setJoueur(JoueurEffectif joueur)
    {
	this.joueur = joueur;
    }

    /**
     * @return the coordonnee
     */
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    /**
     * @return the joueur
     */
    public JoueurEffectif getJoueur() {
        return joueur;
    }

    /**
     * @param coordonnee the coordonnee to set
     */
    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }
    
}
