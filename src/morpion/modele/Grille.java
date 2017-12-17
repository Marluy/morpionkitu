/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tosiv
 */
public class Grille
{
    private final HashMap<Coordonnee, Carreau> carreaux = new HashMap<>();
    
    public Grille(int longeur, int largeur)
    {
	for(int y = 0 ; y < largeur ; y++)
        for(int x = 0 ; x < longeur ; x++)
        {
	    Coordonnee coord = new Coordonnee(x, y);
            this.getCarreaux().put(coord, new Carreau(coord));
        }
    }
    
    public int maxAligneHorizontal(Carreau c, JoueurEffectif joueur)
    {
	int i = 0, count, x = c.getCoordonnee().getPosX(), y = c.getCoordonnee().getPosY();
	Coordonnee coordTmp;

	// Gauche
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x + i, y);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	count = i-1;
	 // Droite
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x - i, y);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	return count + i;
    }

    
    public int maxAligneVertical(Carreau c, JoueurEffectif joueur)
    {
	int i = 0, count, x = c.getCoordonnee().getPosX(), y = c.getCoordonnee().getPosY();
	Coordonnee coordTmp;
	
	// Haut
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x, y + i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	count = i-1;
	// Bas
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x, y - i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	return count + i;
    }
    
    public int maxAligneDiagHgBd(Carreau c, JoueurEffectif joueur)
    {
	int i = 0, count, x = c.getCoordonnee().getPosX(), y = c.getCoordonnee().getPosY();
	Coordonnee coordTmp;
	
	// Haut
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x - i, y + i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	count = i-1;
	// Bas
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x + i, y - i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	
	return count + i;
    }
    
    public int maxAligneDiagHdBg(Carreau c, JoueurEffectif joueur)
    {
	int i = 0, count, x = c.getCoordonnee().getPosX(), y = c.getCoordonnee().getPosY();
	Coordonnee coordTmp;
	
	// Haut
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x + i, y + i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	count = i-1;
	// Bas
	i = 0;
	do
	{
	    i++;
	    coordTmp = new Coordonnee(x - i, y - i);
	}
	while(carreaux.get(coordTmp) != null && carreaux.get(coordTmp).getJoueur() == joueur);
	
	return count + i;
    }
    
    public Carreau getCarreauGauche(Carreau c)	// retourne 'null' si hors de la grille
    {
	int x = c.getCoordonnee().getPosX()-1;
	int y = c.getCoordonnee().getPosY();
	
	if(x < 0)   return null;
	else	    return carreaux.get(new Coordonnee(x-1, y));
    }
    
    public Carreau getCarreauDroit(Carreau c)	// retourne 'null' si hors de la grille
    {
	int x = c.getCoordonnee().getPosX()-1;
	int y = c.getCoordonnee().getPosY();
	
	if(x < 0)   return null;
	else	    return carreaux.get(new Coordonnee(x-1, y));
    }
	
    public Carreau getCarreauHaut(Carreau c)	// retourne 'null' si hors de la grille
    {
	int x = c.getCoordonnee().getPosX()-1;
	int y = c.getCoordonnee().getPosY();
	
	if(x < 0)   return null;
	else	    return carreaux.get(new Coordonnee(x-1, y));
    }
	    
    public Carreau getCarreauBas(Carreau c)	// retourne 'null' si hors de la grille
    {
	int x = c.getCoordonnee().getPosX()-1;
	int y = c.getCoordonnee().getPosY();
	
	if(x < 0)   return null;
	else	    return carreaux.get(new Coordonnee(x-1, y));
    }
    
    
    

    /**
     * @return the carreaux
     */
    public HashMap<Coordonnee, Carreau> getCarreaux()
    {
        return carreaux;
    }
    
    public ArrayList<Carreau> getCasesDispo()
    {
        ArrayList<Carreau> casesDispo = new ArrayList<>();
        
	
        for(Map.Entry<Coordonnee, Carreau> entry : getCarreaux().entrySet())	// Parcour de la HashMap
        {
            if(entry.getValue().getJoueur() != null)				// Si il elle n'est pas cochée, on l'ajoute
            {
                casesDispo.add(entry.getValue());
            }
        }
        
        return casesDispo;
    }
}
