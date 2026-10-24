package personnages;

public class Romain {
	private String nom;
	private int force;

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
		
	}

}
