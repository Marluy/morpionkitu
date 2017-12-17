/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.modele;

/**
 *
 * @author tosiv
 */
public class Coordonnee
{
    private final int posX;
    private final int posY;
    
    public Coordonnee(int x, int y)
    {
	posX = x;
	posY = y;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /* Depuis stackoverflow.com; permet d'utiliser un clef à 2D */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordonnee)) return false;
        Coordonnee key = (Coordonnee) o;
        return posX == key.posX && posY == key.posY;
    }

    @Override
    public int hashCode() {
        int result = posX;
        result = 31 * result + posY;
        return result;
    }
}
