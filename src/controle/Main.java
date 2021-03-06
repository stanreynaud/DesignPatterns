package controle;

import javax.swing.Timer;
import static java.lang.Thread.sleep;

public class Main {
	public static void main(String[] args){
		
		// Cr?ation des factory
		FanoFactory f = new FanoFactory();
		UtilisateurFactory u = new UtilisateurFactory();
		
		// Creation des fanos et des utilisateurs avec les factory
		Fano fano46 = f.creerFano(46,1000);
		Fano fano10 = f.creerFano(10,2000);
		Utilisateur premier = u.creerUtilisateur("premier");
		Utilisateur second = u.creerUtilisateur("second");
		
		// Enregistrement des objets dans le serveur
		Serveur.getInstance().enregistrerFano(fano10);
		Serveur.getInstance().enregistrerFano(fano46);
		Serveur.getInstance().enregistrerUtilisateur(fano46, premier);
		Serveur.getInstance().enregistrerUtilisateur(fano46, second);
		Serveur.getInstance().enregistrerUtilisateur(fano10, second);
		
		
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
