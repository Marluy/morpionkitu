/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.controler;

import java.util.Observable;
import java.util.Observer;
import morpion.Vue.Vue;
import modele.*;

/**
 *
 * @author tosiv
 */
public class Controler implements Observer
{
    private Vue vue = new Vue();
    private Modele modele = new Modele();
    private boolean tourJ1;
    private int scoreAAtteindre;
    
    public Controler()
    {
	
    }

    @Override
    public void update(Observable o, Object arg)
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void listerCasesCochees(Joueur joueur)
    {
        
    }
    
    private void cocherUneCase()
    {
        
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
    public Vue getVue() {
        return vue;
    }

    /**
     * @param vue the vue to set
     */
    public void setVue(Vue vue) {
        this.vue = vue;
    }

    /**
     * @return the modele
     */
    public Modele getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(Modele modele) {
        this.modele = modele;
    }

    /**
     * @return the tourJ1
     */
    public boolean isTourJ1() {
        return tourJ1;
    }

    /**
     * @param tourJ1 the tourJ1 to set
     */
    public void setTourJ1(boolean tourJ1) {
        this.tourJ1 = tourJ1;
    }

    /**
     * @return the scoreAAtteindre
     */
    public int getScoreAAtteindre() {
        return scoreAAtteindre;
    }

    /**
     * @param scoreAAtteindre the scoreAAtteindre to set
     */
    public void setScoreAAtteindre(int scoreAAtteindre) {
        this.scoreAAtteindre = scoreAAtteindre;
    }

}
