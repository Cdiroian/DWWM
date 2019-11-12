using System;
using System.Collections.Generic;
using System.Text;

namespace Compte_banq
{
   public class Compte
    {
        private string numCompte;
        private string nomCompte;
        private double soldeCompte;
        private double decouAutorise;


        public string NumCompte
        {
            get
            {
                return numCompte;
            }

            set
            {
               
                numCompte = String.Format(Convert.ToString(value), 00000000);
                
            }
        }

        public string NomCompte
        {
            get
            {
                return nomCompte;
            }

            set
            {

                if (nomCompte.Length < 2) 
                {

                }
                
                nomCompte = value;
            }
        }

        public double SoldeCompte
        {
            get
            {
                return soldeCompte;
            }

            set
            {
               soldeCompte = value;
            }
        }

        

        public Compte(string _numCompte, string _nomCompte, double _soldeCompte, double _decouAutorise)
        {
            numCompte = _numCompte;
            nomCompte = _nomCompte;
            SoldeCompte = _soldeCompte;
            decouAutorise = _decouAutorise;
        }
        public Compte()// Compte à vide
        {
            Random Alea = new Random();
             String num = Convert.ToString(Alea.Next(1,99999999));
          
            this.numCompte = String.Format(num, 00000000);
            this.nomCompte = "Sans Nom";
            this.SoldeCompte = 0;
            this.decouAutorise = 0;
        }

        public override string ToString()
      {
          
            return "" + "Numero de compte :"+this.NumCompte+ "| Client : "+ this.NomCompte +
                " | Solde actuel :"+ this.SoldeCompte+" Euro | Découvert autorisé : "+this.decouAutorise+"Euro";
        }

        public void Crediter(double montant)
        {

            SoldeCompte += montant;
            Console.WriteLine("{0} a été crédité de {1}",nomCompte,montant);
            
        }
        public bool Debiter(double montant)
        {

            double nouveauMontant = this.SoldeCompte - montant;
            bool perte = true;
            if (nouveauMontant >= decouAutorise)
            {

                SoldeCompte = nouveauMontant;
                Console.WriteLine("{0} a été débité de {1}",nomCompte,nouveauMontant);

            }
            else
            {

                perte = false;
                Console.WriteLine("Dépassement du découvert!!");
                
                

            }
            return perte;

        }

        public bool Superieur(Compte compteExtern)
        {
            return this.SoldeCompte > compteExtern.soldeCompte;
        }
        
        public bool Transferer(double _transferer, Compte compteExtern)
        {
            //
            bool valide = true;

            if (this.Debiter(_transferer))
            {
                compteExtern.Crediter(_transferer);
            }
            else
            {
                valide = false;
                
            }
            return valide;
        }
    }
}
