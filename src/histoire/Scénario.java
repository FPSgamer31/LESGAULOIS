package histoire;

import personnages.Romain;
import personnages.Gaulois;

public class Scénario {

	public static void main(String[] args) {
		Gaulois Astérix = new Gaulois("Astérix", 8);
		Romain Minus = new Romain("Minus", 6);
		Astérix.parler("Bonjour à tous");
		Minus.parler("DES GAU, DES GAUGAU, DES GAULOOOOOIIIIIS !!!!!!");
		Astérix.frapper(Minus);
		Astérix.frapper(Minus);
		Astérix.frapper(Minus);

	}

}
