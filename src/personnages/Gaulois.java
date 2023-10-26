package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force, nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//		}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//		}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler(" Merci Druide, je sens que ma force est "+effetPotion+" fois décuplée.");
	}
	
	@Override
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
		    this.trophees[nbTrophees] = trophees[i];
		}
		
	}
	
	public void faireUneDonation(Musee musee) {
		if (nbTrophees != 0) {
			System.out.println("Le gaulois " + getNom() +": \"Je donne au Musée tout mes trophées :");
			for (int i=0;i<nbTrophees;i++) {
				System.out.println("-" + trophees[i]);
			}
		}
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix); 
		asterix.parler("petit Mec");
		Romain minus = new Romain("Minus", 6);
		asterix.boirePotion(8);
		asterix.frapper(minus);
	}
}




