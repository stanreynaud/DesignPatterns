package controle;

public class UtilisateurFactory {
	
	public Utilisateur creerUtilisateur(String nom) {
		return new Utilisateur(nom);
	}
}
