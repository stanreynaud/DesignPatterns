package controle;

import java.util.Timer;

public class Main {
	public static void main(String[] args){
		
		FanoFactory f = new FanoFactory();
		UtilisateurFactory u = new UtilisateurFactory();
		Fano fano46 = f.creerFano(46,1000);
		Fano fano10 = f.creerFano(10,2000);
		Utilisateur premier = u.creerUtilisateur("premier");
		Utilisateur second = u.creerUtilisateur("second");
		
		Serveur.getInstance().enregistrerFano(fano10);
		Serveur.getInstance().enregistrerFano(fano46);
		Serveur.getInstance().enregistrerUtilisateur(fano46, premier);
		Serveur.getInstance().enregistrerUtilisateur(fano46, second);
		Serveur.getInstance().enregistrerUtilisateur(fano10, second);
		
		fano10.notifierTourFini();
		
		//new Timer(fano10.getTempsTour(), evt -> fano10.notifierTourFini());
		//new Timer(fano46.getTempsTour(), evt -> fano46.notifierTourFini());
	}
}
