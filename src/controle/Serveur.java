package controle;

import java.util.ArrayList;

public class Serveur {
	
	static private Serveur instance;
	
	private ArrayList<Fano> fanoList;
	
	private Serveur() {
		fanoList = new ArrayList<Fano>();
	}
	
	// Ajout d'un fano à la liste
	public void enregistrerFano(Fano f) {
		fanoList.add(f);
	}
	
	// Abonnement d'un utilisateur à un fano
	public void enregistrerUtilisateur(Fano f,Utilisateur u) {
		f.getUtilisateurList().add(u);
	}
	
	// Mise en place du singleton
	public static Serveur getInstance() {
		if (instance == null ) {
			instance = new Serveur();
		}
		return instance;
	}
}
