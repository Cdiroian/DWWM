// Ceci importe la classe Scanner du package
import java.util.Scanner;
//Ceci importe la classe Scanner du package
import java.util.*;

public class sdz1 {

	public static void main(String[] args) {
		//Scanner, permet de lire les entr�s du clavier
		Scanner sc = new Scanner(System.in); //Pour r�cup�rer les entr�es de Scanner, on passe par (System.in)
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine(); //Cette partie r�cup�re le mot que l'on �crit
		System.out.println("Vous avez saisie : "+str); //Cette partie �crit le mot
		// que l'on a r�cuperer dans le str = sc.nextLine.
		// TODO Auto-generated method stub
		System.out.println("Hello World ! \n");
		System.out.println("My name is");
		System.out.println("\n Kaibushin !");
		/*
		 C'est mon premier projet avec Openclassrooms 
		 */
		byte temperature;
		temperature = 64;
		short vitesseMax;
		vitesseMax = 32000;
		int temperatureSoleil;
		temperatureSoleil = 15600000; //La temp�rature est exprim�e en kelvins
		long anneeLumiere;
		anneeLumiere = 9460700000000000L;
		
		//Premi�re m�thode de d�claration
		String phrase;
		phrase = "Titi et Grosminet";
		
		//Deuxi�me m�thode de d�claration
		String str2 = new String();
		
		//Troisi�me m�thode de d�claration
		String string = "Une autre chaine de caract�re";
		
		//Quatri�me m�thode de d�claration
		String chaine = new String("Et une de plus !");
		
		//int i = 12;
		//String j = new String();
		//j = j.valueOf(i);
		//int k =Integer.valueOf(j).intValue();
		
		double nombre = 1000000000000d; //cast en d
		//Peut s'�crire ainsi
		double nombre2 = 1___000___000__000_000d; //cast en d
		// Le nombre underscore n'a pas d'importance
		
		//Voici d'autres exemples
		int entier = 32_000;
		double monDouble = 12_34_56_78_89_10d; //cast en d
		double monDouble2 = 1234_5678_8912d; //cast en d
		
		System.out.println("FIN ! ");
		
		int i= 58;
		
		if(i < 0) {
			//Execution des instructions
			System.out.println("le nombre est negatif");
		}
		
			else if(i == 0)
			System.out.println("Ce nombre est nul !");
			
			else {
			System.out.println("le nombre est positif");
		}
		
		if(i < 100 && i>50)
			System.out.println("Le nombre est bien das l'intervalle.");
		else
			System.out.println("Le nombre n'est pas dans l'intervalle");
		
		int note = 10;
		
		switch(note) 
		{
		case 0:
			System.out.println("Ouch !");
			break;
		case 10:
			System.out.println("Vous avez juste la moyenne !");
			break;
		case 20:
			System.out.println("Parfait !");
			break;
		default:
			System.out.println("Il faut davantage travailler.");
		}
		
		String prenom;
		
		char reponse ='O';
		
		Scanner scr = new Scanner(System.in);
		
		while(reponse == 'O');//Boucle While = Tant - Que
		{
			System.out.println("Donner un pr�nom : ");
			prenom = scr.nextLine();
			System.out.println("Bonjour "+", comment vas-tu ?");
			System.out.println("Voulez-vous r�essayer ? (O/N");
			reponse = scr.nextLine().charAt(0);
		}
		System.out.println("Au revoir.....");
		
		do // Boucle do while = Jusqu'a ce que
		{
			System.out.println("Donnez un pr�nom : ");
			prenom = scr.nextLine();
			System.out.println("Bonjour "+", comment vas-tu ?");
			do {
				System.out.println("Voulez-vous r�essayer ? (O/N)");
				reponse = scr.nextLine().charAt(0);
			}while(reponse !='O' && reponse != 'N');
			
		} while(reponse == 'O');
		System.out.println("Au revoir.....");
		
		for(int j = 1; j<= 10; j++) // La boucle For est une sorte de condens� de la boulcle While
		{
			System.out.println("Voici la ligne" +j);
		}
		
		for(int a = 0, b =2;(a <10 && b <6);a++ , b+=2) {
			System.out.println("a = "+a+", b = "+b);
		}
		
		
	}

}
