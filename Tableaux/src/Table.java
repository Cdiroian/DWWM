import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		
		String[] tab = {"toto", "tata", "titi", "tete"};
	    parcourirTableau(tab);
	    System.out.println(toString(tab));

	}
	//Début de la méthode pour parcourir un tableau mis en paramètre
	static void parcourirTableau(String[]tab)
	{
		for(String str : tab)
			System.out.println(str);		
	}
	//Dans cette partie on retourne une chaîne de caractères.
	static String toString(String[]tab) 
	{
		System.out.println("Méthode toString() !\n---------------");
		String retour = " ";
		
		for(String str : tab)
			retour += str + "\n";
		
		return retour;
	}// Fin de la méthode
	// la méthode que nous avons créée ne prend qu'un tableau de 'String' en paramètre.
	//Pas un tableau d''int' ou de 'long'
	// Donc nous allons utiliser la surcharge de méthode.
	static void parcourirTableau(int[]tab)////Dans cette méthode on peutpacourir n'importe quelle type de tableau
	{
		for(int str : tab)
			System.out.println(str);		
	}

}
