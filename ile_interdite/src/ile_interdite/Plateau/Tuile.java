package ile_interdite.Plateau;

import ile_interdite.Aventurier.Aventurier;
import java.util.*;
import java.util.stream.Stream;
import ile_interdite.util.*;

public class Tuile {

	Aventurier départA;
	ArrayList<Aventurier> aventuriers;
	private EtatTuile etat;
	private String nom;
	private int coordonnee;

	/**
	 * 
	 * @param av
	 */
	public void addJoueur(Aventurier av) {
		// TODO - implement Tuile.addJoueur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param av
	 */
	public void rmJoueur(Aventurier av) {
		// TODO - implement Tuile.rmJoueur
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		return this.nom;
	}

        public EtatTuile getEtat(){
            return this.etat;
        }
        
	public void updateState() {
		// TODO - implement Tuile.updateState
		throw new UnsupportedOperationException();
	}

        int getCoordonnee() {
        return this.coordonnee;
    }

}