package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scénario2 {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		Romain BigusDickus = new Romain("BigusDickus", 6);
		Panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
		Panoramix.parler("Je vais aller préparer une petite potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obélix);
		Obélix.parler(" Par Bélénos, ce n'est pas juste !");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour");
		BigusDickus.parler("UN GAU, UN GAUGAU, UN GAULOOOOOOIIIIIIS !!!!");
		Asterix.frapper(BigusDickus);
	}

}
