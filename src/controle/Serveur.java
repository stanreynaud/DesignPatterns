package controle;

import java.util.ArrayList;

public class Serveur {
	
	private Serveur instance;
	
	private ArrayList<Fano> fanoList;
	
	private Serveur() {
		fanoList = new ArrayList<Fano>();
	}
	
	
	public void enregistrerFano(Fano f) {
		fanoList.add(f);
	}
	
	public void enregistrerUtilisateur(Fano f,Utilisateur u) {
		f.getUtilisateurList().add(u);
	}
	
	public static Serveur getInstance() {
		if (instance == null ) {
			instance = new Serveur();
		}
		return instance;
		
	}
}
