/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.controler;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modele.Joueur;
import morpion.Vue.Vue;

/**
 *
 * @author tosiv
 */
public class MainControler implements Observer
{
    private GameControler gameControler;
    private Vue vue;
    /* Parametres generaux de tournois */
    ArrayList<Joueur> listeJoueurs = new ArrayList<>();
    
    public MainControler()
    {
	this.vue = new Vue();
	this.gameControler = new GameControler(vue);
    }

    @Override
    public void update(Observable o, Object arg)
    {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void debuterTournois()
    {
	for(int i = 0 ; i < listeJoueurs.size()-1 ; i++)	    // Le dernier joueur joue tout ses matchs grâce à la deuxieme loop
	{
	    for(int j = i+1 ; j < listeJoueurs.size() ; i++)	    // Le joueur n à déjà joué les match avec les joueurs n-m {0 < m < n} & ne joue pas contre lui même
	    {
		    gameControler.InitialiserMatch(listeJoueurs.get(i), listeJoueurs.get(j));
		    gameControler.JouerMatch();
	    }
		
	}
    }

    
}
