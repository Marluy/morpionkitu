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
public class Joueur
{
    private String nom;
    private Symbole symbole;
    private int nbrSucces = 0;
    private ArrayList<Carreau> casesCochees = new ArrayList<>();
    
    public Joueur(String nom, Symbole symbole)
    {
        setNom(nom);
        setSymbole(symbole);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the symbole
     */
    public Symbole getSymbole() {
        return symbole;
    }

    /**
     * @param symbole the symbole to set
     */
    public void setSymbole(Symbole symbole) {
        this.symbole = symbole;
    }

    /**
     * @return the nbrSucces
     */
    public int getNbrSucces() {
        return nbrSucces;
    }

    /**
     * @param nbrSucces the nbrSucces to set
     */
    public void setNbrSucces(int nbrSucces) {
        this.nbrSucces = nbrSucces;
    }

    /**
     * @return the casesCochees
     */
    public ArrayList<Carreau> getCasesCochees() {
        return casesCochees;
    }
}
