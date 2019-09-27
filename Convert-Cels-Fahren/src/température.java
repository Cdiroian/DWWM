import java.util.Scanner;


public class temp�rature {

	public static void main(String[] args) {
		// L'objet Scanner
		Scanner sc = new Scanner(System.in);
		//Initialisations de mes variables
		double aConvertir, convertit = 0;
		
		char reponse=' ', mode = ' ';
		
		System.out.println("Convertisseur degr�s Celsius et degr�s Fahrenheit");
		System.out.println("------------------------------------------------");
		
		do {//Boucle principale; Tan que la r�ponse est: O
			
			do {//Tant que la r�ponse n'est pas = O ou N
				mode = ' ';
				System.out.println("Choisissez un mode de conversion : ");
				System.out.println("- 1 - Convertir des Celsius -Fahrenheit");
				System.out.println("- 2 - Convertir des Fahrenheit - Celsius");
				mode = sc.nextLine().charAt(0);
			if(mode != '1' && mode != '2')
				System.out.println("Le mode est inconnue, veuillez choisir a nouveau");
			}while(mode != '1' && mode != '2');
			
			System.out.println("Temp�rature � convertir :");//Saisie de la temp�rature a convertir
			aConvertir = sc.nextDouble();
			
			sc.nextLine();
			
			// En fonction du mode, le programme calcule diff�remment et affiche le r�sultat.
			if(mode == '1') {
				convertit = ((9.0/5.0)*aConvertir)+32.0;
			System.out.println(aConvertir+" C� �gale � : ");
			System.out.println(arrondi(convertit, 2)+" F.");
			}
			else {
				convertit = ((aConvertir- 32.0)*5)/9;
				System.out.println(aConvertir+" F �gale � : ");
				System.out.println(arrondi(convertit, 2)+" C�.");
			}
			
			//On invite l'utilisateur � recommencer ou � quitter
			do {
				System.out.println("Souhaitez-vous faire une nouvelle conversion?");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse != 'N');
		}while(reponse == 'O');
		
		System.out.println("Au revoir !!!");
		//Fin du programme
	}
	
	public static double arrondi(double A, int B) {
		return (double) (int) (A*Math.pow(10, B) + .5) / Math.pow(10,  B);
	}

}
