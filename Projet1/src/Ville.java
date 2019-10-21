import java.util.Objects;
import java.util.Scanner;


public class Ville {
	//Stock le nom de notre ville
	String nomVille;
	//Stock le nom du pays de notre ville
	String nomPays;
	//Stock le nombre d'habitants de notre villes
	int nbreHabitants;
	char categorie;
	
	//Constructeur par défaut
	
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnue";
		nomPays = "Inconnue";
		nbreHabitants = 0;
	}


	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result * categorie;
		result = prime * result * nbreHabitants;
		
		result = prime * result *((nomPays == null)? 0: nomPays.hashCode());
		result = prime * result *((nomVille == null) ? 0 : nomVille.hashCode());
		
		return result;
		//return Objects.hash(nbreHabitants, nomPays, nomVille);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		
		if(categorie != other.categorie) 
		
			return false;
		
		if(nbreHabitants != other.nbreHabitants)
			return false;
		if(nomPays == null) {
			if(other.nomPays != null)
				return false;
		}
		else if(!nomPays.equals(other.nomPays))
			return false;
		
		if(nomVille == null) {
			if(other.nomVille != null)
			return false;
		}
		else if(!nomVille.contentEquals(other.nomVille))
			return false;
		return true;
		//return nbreHabitants == other.nbreHabitants && Objects.equals(nomPays, other.nomPays)
				//&& Objects.equals(nomVille, other.nomVille);
	}
	
}
