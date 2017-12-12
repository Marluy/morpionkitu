package ile_interdite.Aventurier;

import ile_interdite.Plateau.Tuile;
import ile_interdite.Plateau.Grille;
import java.util.ArrayList;

public abstract class Aventurier {

	private String nomJoueur;

	public abstract String getNomRole();

	public abstract Pion getPion();

	public void getPosition() {
		// TODO - implement Aventurier.getPosition
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void tuilesAssechables(Grille g) {
		// TODO - implement Aventurier.tuilesAssechables
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public ArrayList<Tuile> getDeplacementsPossibles(Grille g) {
		// TODO - implement Aventurier.getDeplacementsPossibles
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param t
	 */
	public void setPosition(Tuile t) {
		// TODO - implement Aventurier.setPosition
		throw new UnsupportedOperationException();
	}

	public void initialiserAventurier() {
		// TODO - implement Aventurier.initialiserAventurier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param collecTuile
	 */
	public void ajouterTuile(Tuile collecTuile) {
		// TODO - implement Aventurier.ajouterTuile
		throw new UnsupportedOperationException();
	}

}