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
class Grille
{
    private final ArrayList<Carreau> carreaux = new ArrayList<>();
    
    Grille(int longeur, int largeur)
    {
	for(int y = 0 ; y < largeur ; y++)
        for(int x = 0 ; x < longeur ; x++)
        {
            getCarreaux().add(new Carreau(new Coordonnee(x, y)));
        }
    }

    /**
     * @return the carreaux
     */
    public ArrayList<Carreau> getCarreaux() {
        return carreaux;
    }

}
