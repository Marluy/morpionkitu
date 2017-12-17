/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.controler;

import morpion.modele.Carreau;
import morpion.modele.Symbole;
import morpion.modele.Joueur;
import morpion.modele.Grille;
import morpion.modele.JoueurEffectif;
import java.util.Observable;
import java.util.Observer;
import morpion.Vue.Message_ClicCarreau;
import morpion.Vue.Vue;
import morpion.modele.Coordonnee;

/**
 *
 * @author tosiv
 */
public class GameControler implements Observer
{
    private Vue vue;
 //   private Modele modele = new Modele();
    /* Parametres de partie */
    private int scoreAAtteindre;
    private int largeurGrille;
    private int longueurGrille;
    private int nbrSymboleAAlligner;
    
    /* Attributs de partie */
    private JoueurEffectif joueur1;
    private JoueurEffectif joueur2;
    private Grille grille;
    private boolean tourJ1;
    private boolean finMatch;

    /*  */
    
    public GameControler(Vue vue, Joueur joueur1, Joueur joueur2)
    {
	this.vue = vue;
	vue.addObserver(this);
	this.scoreAAtteindre = 3;
	this.nbrSymboleAAlligner = 5;
	this.largeurGrille = 10;
	this.longueurGrille = 10;
	
	this.joueur1 = new JoueurEffectif(joueur1, Symbole.CROIX);
	this.joueur2 = new JoueurEffectif(joueur2, Symbole.ROND);
	this.grille = new Grille(longueurGrille, largeurGrille);
	this.tourJ1 = true;
	this.finMatch = false;
    }
    
    private void cocherUneCase(Carreau carreau) // Déclanché lors du click sur un carreau
    {
        carreau.setJoueur(getJoueurActuel());
        getJoueurActuel().addCasesCochees(carreau);
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
	Détermine si la partie est terminée d'apres le dernier coup joué 
    */
    private boolean isFinMatch(Carreau c)
    {
	return	grille.maxAligneHorizontal(c, getJoueurActuel())>= nbrSymboleAAlligner ||
		grille.maxAligneVertical(c, getJoueurActuel())  >= nbrSymboleAAlligner ||
		grille.maxAligneDiagHgBd(c, getJoueurActuel())  >= nbrSymboleAAlligner ||
		grille.maxAligneDiagHdBg(c, getJoueurActuel())  >= nbrSymboleAAlligner;
    }
    
    public boolean isFinMatch()
    {
	return finMatch;
    }
    
    @Override
    public void update(Observable o, Object message)
    {
	if(message.getClass() == Message_ClicCarreau.class)
	{
	    Message_ClicCarreau msg_cc = (Message_ClicCarreau)message;
	    Carreau c = grille.getCarreaux().get(msg_cc.getCoordonnee());
	    
	    if(c.getJoueur() == null)
	    {
		cocherUneCase(c);
		msg_cc.getJlabel().setText(getJoueurActuel().getSymbole().toString());
		if(isFinMatch(c)) finMatch = true;
		else joueurSuivant();
	    }
	}
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
