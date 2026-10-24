package village_gaulois;

public class Gaulois {
	
	private String nom;
	private int force;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
		this.village=village;
		
	}
	@Override
	public String toString() {
		return nom;
	}
	public void sePresenter() {
		if ( village == null) {
			System.out.println("Le Gaulois "+nom+" : \"Bonjour,je m'appelle "+nom+". je voyage de villages en villages.\"");
			}
		else if (village.getChef() ==this ){
			System.out.println("Le Gaulois "+nom+" : \"Bonjour, je m'appelle "+nom+". je suis le chef le village :"+village.getNom()+".\"");
		}
		else {
			System.out.println("Le Gaulois "+nom+" : \"Bonjour, je m'appelle"+nom+". J'habite le village : "+village.getNom()+".\"");
			}
		
	}





}

