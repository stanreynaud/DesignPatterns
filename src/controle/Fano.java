package controle;

import java.util.ArrayList;

public class Fano {
	private int numero;
	private int tempsTour;
	
	private ArrayList<Utilisateur> utilisateurList;
	
	public Fano(int num, int tempsTour) {
		setNumero(num);
		setTempsTour(tempsTour);
		
		utilisateurList = new ArrayList<Utilisateur>();
	}
	
	public void tourFini() {
		
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