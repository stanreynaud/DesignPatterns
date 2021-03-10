package controle;

public class Main {
	public static void main(String[] args){
		
		FanoFactory f = new FanoFactory();
		UtilisateurFactory u = new UtilisateurFactory();
		Fano fano46 = f.creerFano(46,1);
		Fano fano10 = f.creerFano(10,2);
		Utilisateur premier = u.creerUtilisateur("premier");
		Utilisateur second = u.creerUtilisateur("second");
		Serveur.getInstance().enregistrerFano(fano10);
		Serveur.getInstance().enregistrerFano(fano46);
		Serveur.getInstance().enregistrerUtilisateur(fano46, premier);
		Serveur.getInstance().enregistrerUtilisateur(fano46, second);
		Serveur.getInstance().enregistrerUtilisateur(fano10, second);
		
		
		
		
		
	}
}
