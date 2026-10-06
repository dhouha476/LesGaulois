
public class Romain { 
	private String nom;
	private int force;
	
	public romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texe) {
		System.out.println(prendreParole() + "\"" +texte + "\"");
	}
	private String pprendreParole() {
		return " Le romain " +nom+" : ";
	}
}
