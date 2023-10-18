package personnages;

import java.util.*;

public class Druide {
	private int forcePotion = 1;
    private String nom;
    private int effetPotionMin;
    private int effetPotionMax;
    
    
    
    public Druide(String nom, int effetPotionMin, int effetPotionMax) {
        this.nom = nom;
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
        parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller" + "d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
    }
    
    public String getNom() {
    	return nom;
    }
    
    public void parler(String texte) {
    	System.out.println(prendreParole() + "« " + texte + "»");
    }
    
    public void preparerPotion() {
    	Random force = new Random();
    	forcePotion = force.nextInt(effetPotionMin,effetPotionMax); //Give maximum value to random number;
    	if (forcePotion > 7) {
    		parler("J'ai préparé une super potion de force" + forcePotion);
    	}
    	else {
    		parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
    	}
    }
    
    public void booster(Gaulois gaulois) {
    	if (gaulois.getNom() == "Obélix") {
    			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
    	}
    	else {
    		gaulois.boirePotion(forcePotion);
    	}
    }
    
    private String prendreParole() {
    	return "Le druide " + nom + " : ";
    }
    
    public static void main(String[] args) {
    	Druide Panoramix = new Druide("Panoramix", 5, 10);
    	Panoramix.preparerPotion();
    }
}

