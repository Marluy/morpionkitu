/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.controler;

import java.util.ArrayList;
import modele.Joueur;
import morpion.Vue.Vue;

/**
 *
 * @author tosiv
 */
public class MainControler
{
    private GameControler gameControler;
    private Vue vue;
    /* Parametres generaux de partie */
    private int scoreAtteindre;
    private int largeurGrille;
    private int longueurGrille;
    ArrayList<Joueur> listeJoueurs = new ArrayList<>();
    
    public MainControler()
    {
	
    }
    
}
