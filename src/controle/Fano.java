package controle;

import java.util.ArrayList;

import javax.swing.Timer;

public class Fano {
	private int numero;
	private int tempsTour;
	
	private ArrayList<Utilisateur> utilisateurList;
	
	public Fano(int num, int tempsTour) {
		setNumero(num);
		setTempsTour(tempsTour);
		utilisateurList = new ArrayList<Utilisateur>();
		new Timer(tempsTour, evt ->notifierTourFini());
	}
	
	// Fonction de notification de la fin d'un tour
	public void notifierTourFini() {
		for (Utilisateur u : utilisateurList) {
			u.recoitNotification(numero,"13h");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Utilisateur> getUtilisateurList() {
		return utilisateurList;
	}

	public void setUtilisateurList(ArrayList<Utilisateur> utilisateurList) {
		this.utilisateurList = utilisateurList;
	}

	public int getTempsTour() {
		return tempsTour;
	}

	public void setTempsTour(int tempsTour) {
		this.tempsTour = tempsTour;
	}

}
