/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Observable;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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
	window.setSize(1200, 800);
	window.setLocationRelativeTo(null);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
	JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
	window.setContentPane(panelPrincipal);
        
        Dimension sizeWin = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        //Panneau du haut
        JPanel panelInfoRencontre = new JPanel();
        panelInfoRencontre.setLayout(new BorderLayout());
        JPanel panelRencontre = new JPanel();
        JPanel panelScore = new JPanel();	
        panelRencontre.add(new TextArea("test"));
        
       
        panelScore.add(new TextArea("test"));
        
        panelPrincipal.add(panelInfoRencontre,BorderLayout.NORTH);
        
        panelInfoRencontre.add(panelRencontre,BorderLayout.NORTH);
        panelInfoRencontre.add(panelScore,BorderLayout.SOUTH);
        
        //Panneau de gauche
        JPanel panelBouttonInfo = new JPanel();
        panelPrincipal.add(panelBouttonInfo,BorderLayout.WEST);  
        JPanel panelJoueur = new JPanel();
        JPanel panelSymbole = new JPanel();
        JPanel panelboutton = new JPanel();
        panelBouttonInfo.add(panelJoueur,BorderLayout.NORTH);        
        panelBouttonInfo.add(panelSymbole,BorderLayout.CENTER);
        panelBouttonInfo.add(panelboutton,BorderLayout.SOUTH);
        
        JButton regle = new JButton("Règle");
        JButton score = new JButton("Score");
         int height = (int) sizeWin.getHeight() - 25;
        int width = (int) sizeWin.getWidth();
        panelSymbole.setSize(width, height);
        JButton abandon = new JButton("Abandonner");
        panelboutton.add(regle,BorderLayout.WEST);
        panelboutton.add(score,BorderLayout.EAST);
        panelboutton.add(abandon,BorderLayout.SOUTH);
        
        //Panneau du centre
	GridLayout grilleMorpion = new GridLayout(largeur, longueur);
        JPanel panelGrille = new JPanel();
   
	panelGrille.setLayout(grilleMorpion);
	panelPrincipal.add(panelGrille,BorderLayout.CENTER);
	HashMap<JLabel, Coordonnee> grille = new HashMap<>();
	
	System.out.println(largeur);
	System.out.println(longueur);
	
	for(int y = largeur-1 ; y >= 0 ; y--)
	{
	for(int x = 0 ; x < longueur ; x++)
	{
	    JLabel label = new JLabel("(" + x + ";" + y + ")");
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
	    panelGrille.add(label);
	}
	}
	
	window.setVisible(true);
    }  

    public static void main(String[] args)
    {
	Vue vue = new Vue(5,5);
    }
    
    
}
