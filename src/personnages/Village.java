package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbvillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbvillageois] = gaulois;
		nbvillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numéro) {
		return villageois[numéro];
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef" + chef + "vivent les légendaires Gaulois :\n");
		for(int i=0 ; i<nbvillageois ; i++) {
			System.out.println("- "+villageois[i]+"\n");
		}
	}
	
	public static void main(String[] argd) {
		Village village = new Village("Village des irréductibles", 30);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		village.ajouterHabitant(Abraracourcix);
		Chef ChefAbraracourcix = new Chef("Chef Abraracourcix", 6, village);
		village.setChef(ChefAbraracourcix);
		Gaulois Astérix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(Astérix);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obélix);
		village.afficherVillageois(ChefAbraracourcix);
	}
}

//Gaulois gaulois = village.trouverHabitant(30);
//
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//        at personnages.Village.trouverHabitant(Village.java:29)
//        at personnages.Village.main(Village.java:34)

//Gaulois gaulois = village.trouverHabitant(1);
//System.out.println(gaulois);
//
//null