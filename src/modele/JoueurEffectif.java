/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author tosiv
 */
public class JoueurEffectif
{
    private Symbole symbole;
    private int nbrSucces;
    private Joueur joueur;
    private ArrayList<Carreau> casesCochees = new ArrayList<>();

    /**
     * @return the symbole
     */
    public Symbole getSymbole()
    {
	return symbole;
    }

    /**
     * @param symbole the symbole to set
     */
    public void setSymbole(Symbole symbole)
    {
	this.symbole = symbole;
    }

    /**
     * @return the nbrSucces
     */
    public int getNbrSucces()
    {
	return nbrSucces;
    }

    /**
     * @param nbrSucces the nbrSucces to set
     */
    public void setNbrSucces(int nbrSucces)
    {
	this.nbrSucces = nbrSucces;
    }

    /**
     * @return the joueur
     */
    public Joueur getJoueur()
    {
	return joueur;
    }

    /**
     * @param joueur the joueur to set
     */
    public void setJoueur(Joueur joueur)
    {
	this.joueur = joueur;
    }

    public void addCasesCochees(Carreau carreau)
    {
	getCasesCochees().add(carreau);
    }

    /**
     * @return the casesCochees
     */
    public ArrayList<Carreau> getCasesCochees()
    {
	return casesCochees;
    }
}
