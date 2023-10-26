package personnages;

public class Musee {
	private Trophees[] tableau = new Trophees[200];
	private int nbTrophees=0;
	private Trophees donne;
	private Gaulois donneur;
	
	public void donnerTrophees(Gaulois gaulois, Trophees trophee) {
		tableau[nbTrophees]=trophee;
	}
	
	public void extraireInstructionsOCaml() {
		System.out.println(" musee = [");
		for (int i=0;i<nbTrophees;i++) {
			donne=tableau[i];
			donneur=donne.donnerNom();
			System.out.println("\""+donneur+"\", \""+tableau[i]);
		}
	}

}
