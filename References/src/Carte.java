
public class Carte {
	
	private static int dernierIdentifiant = 0;
	
	private int identifiant;
	
	private String nom;
	
	private int valeur;
	
	public Carte(String _nom, int _valeur)
	{
		this.nom = _nom;
		this.valeur = _valeur;
		
		dernierIdentifiant++;
		this.identifiant =dernierIdentifiant;
		
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
	
}
