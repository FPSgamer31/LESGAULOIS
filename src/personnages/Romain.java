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
	
	public int getForce() {
		return force;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
		}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
	
//	public void recevoirCoup(int forceCoup) {
//		assert force>0;
//		int force2 = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert force<=force2;
//	}
	
	
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
	
	
	private int calculResistanceEquipement(int forceCoup) { 
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		
		int resistanceEquipement = 0;
		
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		    for (int i = 0; i < nbEquipement;i++) {
		        if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
		            resistanceEquipement += 8;		            
		        } else {
		            System.out.println("Equipement casque");
		            resistanceEquipement += 5;   
		        }
		    }
		    
		    texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		
		if (forceCoup >=0) {
			force -= forceCoup;
		}
		
		if (force==0) {
			parler("Aïe");
		}
		else {
		    equipementEjecte = ejecterEquipement();
		    parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
		
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		    if (equipements[i] == null) {
		    } else {
		        equipementEjecte[nbEquipementEjecte] = equipements[i];
		        nbEquipementEjecte++;
		        equipements[i] = null;
		    }
		}
		return equipementEjecte;
	}

	
	
	
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("BigusDickus", 6);
        minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
