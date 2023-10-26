package personnages;

public class Trophees {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophees(Gaulois gaulois, Equipement equipement) {
		this.gaulois=gaulois;
		this.equipement=equipement;
	}
	
	public Gaulois getgaulois() {
		return gaulois;
	}
	
	public Equipement getequipement() {
		return equipement;
	}
	
	public Gaulois donnerNom() {
		return gaulois;
	}

	
	
}
