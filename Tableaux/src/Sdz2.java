import java.util.Scanner;
public class Sdz2 {

	public static void main(String[] args) {
		//Les tableaux
		//Tableau unidimensionnel
		int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
		double tableauDouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		char tableauCaractere[] = {'a','b','c','d','e','f','g'};
				
		//int premiersNombres [][] = {{0,2,4,6,8},{1,3,5,7,9}};
		
		System.out.println(tableauCaractere[0]);
		
		for(int i=0; i < tableauCaractere.length; i++) {// On parcours notre tableau des caracteres
		System.out.println("A l'emplacement "+i+" du tableau nous avons = "+ tableauCaractere[i]);
		}
		
		int i=0;
		char reponse = ' ', carac = ' ';
		Scanner sc =new Scanner(System.in);
		
		do {
			do {
				
				i=0;
				System.out.println("Rentrer une lettre en minuscule, svp");
				
				carac = sc.nextLine().charAt(0);
				
				while(i<tableauCaractere.length && carac != tableauCaractere[i]);
				i++;
				
				if(i<tableauCaractere.length)
					System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
			    else //Sinon
			      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
				
			}while(i>=tableauCaractere.length);
			
			do {
				System.out.println("Souhaitez-vous essayer à nouveau ? (O/N)");
				reponse = sc.nextLine().charAt(0);
				
			}while(reponse != 'N' && reponse != 'O');
			
			
		}while(reponse =='O');
		System.out.println("Au revoir");
		
		String[] str = new String[10];
		str[10] = "Une exception";
		
		
		int premiersNombres [][] = {{0,2,4,6,8},{1,3,5,7,9}}, j=0, k=0;
		while(j<2) 
		{
			j = 0;
			while(k < 5) 
			{
				System.out.print(premiersNombres[j][k]);
				k++;
			}
			System.out.println("");
			j++;
		}
		
		
		
	}

}
