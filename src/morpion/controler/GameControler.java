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
    private Vue vue = new Vue();
    private Modele modele = new Modele();
    private boolean tourJ1 = true;
    private int scoreAAtteindre;
    
    public GameControler()
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
        if(getModele().getGrille().getCasesDispo().contains(carreau))
        {
            carreau.setJoueur(getJoueurActuel());
            getJoueurActuel().addCasesCochees(carreau);
        }
        else
        {
            /* Message IHM */
        }
    }
    
    private Joueur getJoueurActuel()
    {
       if(isTourJ1())   return getModele().getJoueur1();
       else             return getModele().getJoueur2();
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
     * @return the modele
     */
    private Modele getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    private void setModele(Modele modele) {
        this.modele = modele;
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
     * @return the scoreAAtteindre
     */
    private int getScoreAAtteindre() {
        return scoreAAtteindre;
    }

    /**
     * @param scoreAAtteindre the scoreAAtteindre to set
     */
    private void setScoreAAtteindre(int scoreAAtteindre) {
        this.scoreAAtteindre = scoreAAtteindre;
    }

}
