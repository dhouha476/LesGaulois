package village_gaulois;

public class Village {
	
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;
	public Village(String nom, Gaulois chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMax];
		chef.setVillage(this);
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageaois(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
		
	}
	
	
	public Gaulois trouverVillageois(int numVillageois) {
		int indice =numVillageois - 1;
		
		if (indice >=0 && indice<nbVillageois) {
			return villageois[indice];
		}
		System.out.println("il n'y a pas autant d'habitants dans notre village ! ");
		return null;
	}
	
	
	public static void main(String[] args) {
		Gaulois abraracourcix= new Gaulois("Abraracourcix",6);
		Village village=new Village("village des irréductibles",abraracourcix,30);
		
		village.trouverVillageois(30);
		Gaulois asterix=new Gaulois("Astérix",8);
		village.ajouterVillageaois(asterix);
		village.afficherVillage();
		Gaulois gaulois=village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois=village.trouverVillageois(2);
		System.out.println(gaulois);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		Gaulois doublepolemix=new Gaulois("Doublepolémix", 5);
		doublepolemix.sePresenter();
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageaois(obelix);
		village.afficherVillage();
		Gaulois doublePolemix = new Gaulois("Doublepolémix",4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village \""+nom+"\" du chef "+chef.getNom());
		System.out.println("vivent les légendaires gaulois :" );
		for (int i=0; i<nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	
}

