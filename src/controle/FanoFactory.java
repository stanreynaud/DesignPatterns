package controle;

public class FanoFactory {
	
	public Fano creerFano(int numero, int tempsTour) {
		return new Fano(numero,tempsTour);
	}

}
