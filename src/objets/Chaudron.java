package objets;

public class Chaudron {
	 
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion= quantite;
		this.forcePotion= forcePotion;
		
	}
	public boolean restePotion() {
		return quantitePotion > 0;
	}
	public int prendreLouche() {
		quantitePotion--;
		
		if (quantitePotion==0) {
			int forceLouche=forcePotion;
			forcePotion=0;
			return forceLouche;
		}
		return forcePotion;
	}

}
