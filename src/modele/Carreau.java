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
class Carreau
{
    private final Coordonnee coordonnee;
    private Joueur joueur;
    
    Carreau(Coordonnee coordonnee)
    {
	this.coordonnee = coordonnee;
    }

    /**
     * @param joueur the joueur to set
     */
    public void setJoueur(Joueur joueur)
    {
	this.joueur = joueur;
    }
}
