package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] args) {
		Romain BigusDickus = new Romain("BigusDickus", 6);
		System.out.println(BigusDickus); 
		BigusDickus.parler("Arrêtez de vous moquer");
		BigusDickus.recevoirCoup(5);
	}
}
