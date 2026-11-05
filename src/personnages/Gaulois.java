package personnages;

import objets.Equipement;
import village_gaulois.Musee;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private Village village;
	private int force;
	private int effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() { return nom; }

	public void setVillage(Village village) { this.village = village; }

	public void boirePotion(int forcePotion) { effetPotion = forcePotion; }

	public void sePresenter() {
		if (village == null) {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		} else if (village.getChef() == this) {
			parler("Bonjour, je m'appelle " + nom + ". Je suis le chef le village : " + village.getNom() + ".");
		} else {
			parler("Bonjour, je m'appelle " + nom + ". J'habite le village : " + village.getNom() + ".");
		}
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesGagnes = romain.recevoirCoup((force / 2) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; tropheesGagnes != null && i < tropheesGagnes.length; i++, nbTrophees++) {
			trophees[nbTrophees] = tropheesGagnes[i];
		}
	}

	public void faireUneDonnation(Musee musee) {
		if (nbTrophees > 0) {
			System.out.println(prendreParole() + "« Je donne au musee tous mes trophees :");
			for (int i = 0; i < nbTrophees; i++) {
				String fin = (i == nbTrophees - 1) ? "»" : "";
				System.out.println("- " + trophees[i] + fin);
				musee.donnerTrophees(this, trophees[i]);
			}
		}
	}
}