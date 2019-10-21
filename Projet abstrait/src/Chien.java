
public class Chien extends Canin implements Rintintin{

	public Chien() {
		
	}
	
	public Chien (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	void crier() {
		System.out.println("j'aboie sans raison !!!");

	}
	
	public void faireCalin()
	{
		System.out.println("Je fais un GROS CALIN!!!");
	}
	public void faireLechouille()
	{
		System.out.println("Je fais de GROSSE Lechouilles.....!");
	}
	public void faireLeBeau()
	{
		System.out.println("Je fais le beau !!!");
	}

}
