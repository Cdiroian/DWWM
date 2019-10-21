
public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carte c1 = new Carte("As",1);
		Carte c2 = new Carte("Deux",2);
		Carte c3 = new Carte("Trois",3);
		
		
		System.out.println(c1.getIdentifiant()+" "+ c1.getNom());
		
		System.out.println(c3.getIdentifiant()+" "+ c3.getNom());
		
		System.out.println(c2.getIdentifiant()+" "+ c2.getNom());
		
		
	
		
		
		Integer a =2;
		doubler(a);
		System.out.println("A="+ a);
	}
	static void doubler(int _valeur) 
	{
		_valeur = _valeur *2;
	}
}
