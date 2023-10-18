package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
		}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int force2 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force<=force2;
	}
	
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement+=1;
		System.out.println("le soldat " + nom + " s'équipe avec un " + equipement);
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 0:
			ajouterEquipement(equipement);
		    break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement +" !");
			} else {
				ajouterEquipement(equipement);
			}
			break;
		case 2:
			System.out.println("le soldat " + nom + " est deja bien protege");
			break;
		default:
			System.out.println("Il y a un soucis");
			break;
			
		}
	}
	
	public static void main(String[] args) {
		Romain BigusDickus = new Romain("BigusDickus", 6);
        BigusDickus.sEquiper(Equipement.CASQUE);
		BigusDickus.sEquiper(Equipement.CASQUE);
		BigusDickus.sEquiper(Equipement.BOUCLIER);
		BigusDickus.sEquiper(Equipement.BOUCLIER);
	}
}
