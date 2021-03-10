package controle;

public class Utilisateur {
	
	private String nom;
	
	public Utilisateur(String nom) {
		this.nom = nom;
	}

	// Gestion de la notification de fin de tour envoyée par un fano
	public void recoitNotification(int numero, String date) {
		System.out.println("Utilisateur: "+nom+" Numero: "+numero+" Date: "+date);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
