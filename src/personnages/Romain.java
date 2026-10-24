package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements =new Equipement[2];
	private int nbEquipement =0;

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\""+ texte+"\"");
	}
	
	
	private String prendreParole() {
		return "Le romain " +nom+" : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup >=0;
		int ancienneForce=force;
		force=force-forceCoup;
		 
		if (force<1 ) {
			force=0;
			parler("J'abandonne !");
		}else {
			parler("Aie");
		}
		assert force <= ancienneForce;
	}
	private boolean invariantVerifie() {
		return force >= 0;
		
	}
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
		
		assert invariantVerifie();
		
	}
	public static void main (String[] args) {
		Romain minus= new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}


	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2: 
			System.out.println("Le soldat "+nom+" est déja bien protégé !");
			break;
		default:
			for (int i=0; i<nbEquipement; i++) {
				if (equipements[i]==equipement) {
					System.out.println("le soldat "+ nom+" possède déjà un "+equipement+" !");
					return ;
				}
			}
			equipements[nbEquipement]= equipement ;
			nbEquipement ++;
			System.out.println("Le soldat "+nom+"s'équipe avec un "+equipement+".");
		}
		
}
}


