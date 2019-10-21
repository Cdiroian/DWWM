import java.util.Scanner;
public class Sdz3 {

	public static void main(String[] args) {
		String chaine =new String("COUCOU TOUS LE MONDE !"), chaine2 =new String();//Donne "coucou tout le monde !"
		chaine2 = chaine.toLowerCase();// La methode LowerCase mais en minuscule
		
		String chaine3 =new String("coucou coucou"), chaine4 = new String();
		chaine2 = chaine.toUpperCase();   //Donne "COUCOU COUCOU"
		chaine4 = chaine3.toUpperCase();// La methode LowerCase mais en majuscule
		
		String chaine5 = new String("coucou");
		int longueur= 0;
		longueur =chaine5.length();
		
		String str = new String("coucou"), str1 = new String("toutou");
		
		if(str.equals(str1))
			System.out.println("Les deux chaînes sont identiques !");
		else
			System.out.println("Les deux chaînes sont différentes !");
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez saisir un entier : ");
		 double c = sc.nextInt();
		 System.out.println("Vous avez saisi le nombre : " + c);
		
		
		 String nbre = new String("1234567");
		 char carac = nbre.charAt(4);
		 
		 String chaine6 = new String("la paix niche"), chaine7 = new String();
		 chaine7 = chaine6.substring(3, 13);
		 
		 String mot = new String("anticonstitutionnellement");
		 int n = 0;
		  // Méthode indexOf explore la chaine de caracteres à la recherche d'une suite de données.
		 n = mot.indexOf('t');           //n vaut 2
		 n = mot.lastIndexOf('t');       //n vaut 24
		 n = mot.indexOf("ti");          //n vaut 2
		 n = mot.lastIndexOf("ti");      //n vaut 12
		 n = mot.indexOf('x');           //n vaut -1
		 
		 
		 double X = 0.0;
		 X = Math.random();
		 //random retourne un nombre aléatoire
		 //compris entre 0 et 1, comme 0,0001385746329371058
		 
		 double sin = Math.sin(120);// La fonction sinus
		 double cos = Math.cos(120);// La fonction cosinus
		 double tan = Math.atan(120);// La fonction tangente
		 double abs = Math.abs(-120.25);// La fonction valeur absolue
		 double d = 2;
		 double exp = Math.pow(d, 2);//La fonction exposant
		 // Ici, on initialise la variable exp avec la valeur de d élevée au carré
		 //La méthode pow() prend donc une valeur en premier paramètre, et un exposant en second
		 
		 
	}
	
	public static double arrondi(double A, int B) {
		return (double) ((int)(A * Math.pow(10,B)* .5)) /Math.pow(10, B);
	}

}
