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
public enum Symbole
{
    CROIX('X'),
    ROND('O');
    
    private final char symbole;
    
    Symbole(char symbole)
    {
	this.symbole = symbole;
    }

    @Override
    public String toString()
    {
	return String.valueOf(symbole);
    }
    
    
}
