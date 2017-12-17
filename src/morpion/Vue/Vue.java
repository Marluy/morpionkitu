/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.Vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Observable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import morpion.modele.Coordonnee;

/**
 *
 * @author tosiv
 */
public class Vue extends Observable
{
    private boolean visible;
    
    public Vue(int longueur, int largeur)
    {
	JFrame window = new JFrame();
	window.setTitle("Match");
	window.setSize(400, 400);
	window.setLocationRelativeTo(null);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
	JPanel panel = new JPanel();
	window.setContentPane(panel);
	
	GridLayout gridLayout = new GridLayout(largeur, longueur);
	panel.setLayout(gridLayout);
	
	HashMap<JLabel, Coordonnee> grille = new HashMap<>();
	
	System.out.println(largeur);
	System.out.println(longueur);
	
	for(int y = largeur-1 ; y >= 0 ; y--)
	{
	for(int x = 0 ; x < longueur ; x++)
	{
	    JLabel label = new JLabel("(" + x + ";" + y + ")");
	    grille.put(label, new Coordonnee(x, y));
	    label.addMouseListener(new MouseListener()
	    {
		@Override
		public void mouseClicked(MouseEvent me)
		{
		    setChanged();
		    Message_ClicCarreau message = new Message_ClicCarreau(label, grille.get(label));
		    notifyObservers(message);
		    clearChanged();
		}
		@Override
		public void mousePressed(MouseEvent me) {}
		@Override
		public void mouseReleased(MouseEvent me) {}
		@Override
		public void mouseEntered(MouseEvent me) {}
		@Override
		public void mouseExited(MouseEvent me) {}
	    });
	    panel.add(label);
	}
	}
	
	window.setVisible(true);
    }  

    public static void main(String[] args)
    {
	Vue vue = new Vue(5,5);
    }
    
    
}
