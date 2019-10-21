import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		
		String[] tab = {"toto", "tata", "titi", "tete"};
	    parcourirTableau(tab);
	    System.out.println(toString(tab));

	}
	//D�but de la m�thode pour parcourir un tableau mis en param�tre
	static void parcourirTableau(String[]tab)
	{
		for(String str : tab)
			System.out.println(str);		
	}
	//Dans cette partie on retourne une cha�ne de caract�res.
	static String toString(String[]tab) 
	{
		System.out.println("M�thode toString() !\n---------------");
		String retour = " ";
		
		for(String str : tab)
			retour += str + "\n";
		
		return retour;
	}// Fin de la m�thode
	// la m�thode que nous avons cr��e ne prend qu'un tableau de 'String' en param�tre.
	//Pas un tableau d''int' ou de 'long'
	// Donc nous allons utiliser la surcharge de m�thode.
	static void parcourirTableau(int[]tab)////Dans cette m�thode on peutpacourir n'importe quelle type de tableau
	{
		for(int str : tab)
			System.out.println(str);		
	}

}
