import java.util.Scanner;


public class Pricipale {

	public static void main(String[] args) {
		
		int nbreSaisi;		
		//String exp=new regExp("^[0-9]*$","g");
		do
		{
			
			
			System.out.println("Veuillez saisir pour verifier si un nombre est premier !");
			Scanner sc = new Scanner(System.in);
			nbreSaisi = sc.nextLine().charAt(0);
			
			if(nbreSaisi == 2) 
			{
				System.out.println( nbreSaisi +" est un nombre premier !!!");
			}
			else if (nbreSaisi <= 1)
			{
			System.out.println( nbreSaisi +" n'est pas un nombre premier !!!");
			}
			else if(nbreSaisi % 2 == 0) {
				System.out.println( nbreSaisi +" n'est pas un nombre premier !!!");
			}
			
			
			
		}while();
		
	}

}
