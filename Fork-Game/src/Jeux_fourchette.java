import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jeux_fourchette {

	public static void main(String[] args) {
		
		int Nombre = 0, essais=0;
		
		Random rand = new Random();
		int nombreMystere = alea(0,100);
		
//		System.out.println(".....Jeu de la Fourchette.....");
//		System.out.println("Trouver un nombre entre 0 et 100 !");

		JOptionPane.showMessageDialog(null,"Trouver un nombre entre 0 et 100 !",
				"Jeux de la Fourchette",JOptionPane.INFORMATION_MESSAGE);
			
	do 
	{
						
			String nbreRentree = JOptionPane.showInputDialog(null,"Quel est votre nombre proposé?",
	               ".....Jeux de la Fourchette.....",JOptionPane.QUESTION_MESSAGE);
			
			String infoSorti = JOptionPane.showMessageDialog(null+nbreRentree+".....Jeux de la Fourchette.....",
					JOptionPane.INFORMATION_MESSAGE);
			
			if(Nombre < nombreMystere ) 
			{
				System.out.println("C'est plus grand que : "+nbreRentree);
				essais ++;
			}
			else if (Nombre > nombreMystere) 
			{
				System.out.println("C'est plus petit que : "+nbreRentree);
				essais++;
			}
			else 
			{
				System.out.println("Trouvé en "+essais+" essais ! Bien joué !");
			}
			
	}while (Nombre != nombreMystere);
	}	
	static public int alea (int min, int max)
	{
		int nbAl =(int)(Math.random()*max+min);
		return nbAl;
	}
}
