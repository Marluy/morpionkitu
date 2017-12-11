/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.controler;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import morpion.Vue.Vue;
import modele.*;

/**
 *
 * @author tosiv
 */
public class GameControler implements Observer
{
    private Vue vue;
 //   private Modele modele = new Modele();
    /* Attributs de partie */
    private JoueurEffectif joueur1;
    private JoueurEffectif joueur2;
    private Grille grille;
    private boolean tourJ1 = true;
    /*  */
    
    private GameControler(Vue vue, Joueur joueur1, Joueur joueur2, int largeurGrille, int longueurGrille)
    {
	
    }

    @Override
    public void update(Observable o, Object arg)
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /* OSEF
    private void listerCasesCochees(Joueur joueur)
    {
        
    }
    */
    private void cocherUneCase(Carreau carreau) // Déclanché lors du click sur un carreau
    {
        if(getGrille().getCasesDispo().contains(carreau))
        {
            carreau.setJoueur(getJoueurActuel());
            getJoueurActuel().addCasesCochees(carreau);
        }
        else
        {
            /* Message IHM */
        }
    }
    
    private JoueurEffectif getJoueurActuel()
    {
       if(isTourJ1())   return getJoueur1();
       else             return getJoueur2();
    }

    private void joueurSuivant()
    {
        setTourJ1(!isTourJ1());
    }

    /**
     * @return the vue
     */
    private Vue getVue() {
        return vue;
    }

    /**
     * @param vue the vue to set
     */
    private void setVue(Vue vue) {
        this.vue = vue;
    }

    /**
     * @return the tourJ1
     */
    private boolean isTourJ1() {
        return tourJ1;
    }

    /**
     * @param tourJ1 the tourJ1 to set
     */
    private void setTourJ1(boolean tourJ1) {
        this.tourJ1 = tourJ1;
    }

    /**
     * @return the grille
     */
    private Grille getGrille()
    {
	return grille;
    }

    /**
     * @param grille the grille to set
     */
    private void setGrille(Grille grille)
    {
	this.grille = grille;
    }

    /**
     * @return the joueur1
     */
    private JoueurEffectif getJoueur1()
    {
	return joueur1;
    }

    /**
     * @param joueur1 the joueur1 to set
     */
    private void setJoueur1(JoueurEffectif joueur1)
    {
	this.joueur1 = joueur1;
    }

    /**
     * @return the joueur2
     */
    private JoueurEffectif getJoueur2()
    {
	return joueur2;
    }

    /**
     * @param joueur2 the joueur2 to set
     */
    private void setJoueur2(JoueurEffectif joueur2)
    {
	this.joueur2 = joueur2;
    }

}
