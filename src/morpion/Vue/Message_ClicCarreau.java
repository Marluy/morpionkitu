/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.Vue;

import javax.swing.JLabel;
import morpion.modele.Coordonnee;

/**
 *
 * @author tosiv
 */
public class Message_ClicCarreau
{
    private JLabel jlabel;
    private Coordonnee coordonnee;
    
    public Message_ClicCarreau(JLabel jlabel, Coordonnee coordonne)
    {
	this.jlabel = jlabel;
	this.coordonnee = coordonne;
    }

    /**
     * @return the jlabel
     */
    public JLabel getJlabel()
    {
	return jlabel;
    }

    /**
     * @param jlabel the jlabel to set
     */
    public void setJlabel(JLabel jlabel)
    {
	this.jlabel = jlabel;
    }

    /**
     * @return the coordonnee
     */
    public Coordonnee getCoordonnee()
    {
	return coordonnee;
    }

    /**
     * @param coordonnee the coordonnee to set
     */
    public void setCoordonnee(Coordonnee coordonnee)
    {
	this.coordonnee = coordonnee;
    }
    
    
}
