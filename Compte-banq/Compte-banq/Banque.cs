using System;
using System.Collections.Generic;
using System.Text;

namespace Compte_banq
{
    public class Banque
    {
        private Compte[] LesComptes;

        private int NbrComptes;

        

        private void AddCompte(Compte unCompte) //ici on instencie un nouveau compte bancaire
            //et elle incrémantes le nombre de comptes. Elle n'est utilisable que dans la class Banque.
        {
            LesComptes[NbrComptes++] = unCompte;
        }

        public void AddCompte(string _numCompte, string _nomCompte, double _soldeCompte, double _decouAutorise) 
        {
            Compte c = new Compte(_numCompte, _nomCompte, _soldeCompte, _decouAutorise);
            this.AddCompte(c);
        }

        public Banque() 
        {
            LesComptes = new Compte[20];//Nous faisons un tableau limitant à 20 comptes bancaires.
           // this.NbrComptes = 0;// nombre de comptes initialisé à 0.

        }
        public Banque(Compte[] monTableau, int nbrComptes) 
        {
            
        }


        public void Initial() 
        {
            Compte c1 = new Compte("54012317", "Toto",1000,-500);
            Compte c2 = new Compte("67827390", "Titi",2000,-1000);
            Compte c3 = new Compte("60121564", "Dupond",15000,-1500);
            Compte c4 = new Compte("79542341", "Durand",1200,-500);
            Compte c5 = new Compte("34587289", "Dubois",-200,-500);
            Compte c6 = new Compte("98713173", "Duval",750, -2000);
            this.AddCompte(c1);
            this.AddCompte(c2);
            this.AddCompte(c3);
            this.AddCompte(c4);
            this.AddCompte(c5);
            this.AddCompte(c6);
        }
        public override string ToString()
        {

            string chainebanque = "------------debut de banque----------------\n";
            for (int i = 0; i < NbrComptes; i++)
            {
                chainebanque +="\n" +LesComptes[i].ToString()+"\n";
            }
            chainebanque += "------------fin de banque----------------\n";

            return chainebanque;

        }
    
       
        public Compte CompteSup() 
        {
            int max = 0;

            for (int i = 0; i < NbrComptes; i++)
            {
                if (LesComptes[i].Superieur(LesComptes[max]))
                {

                    max = i;
                }

            }
            return LesComptes[max];

            
        }

        public Compte RendCompte(string _numCompte) //On va verifier et nous dire si oui ou non le N° de compte exixte ou pas.
        {
            

            for (int i = 0; i < NbrComptes; i++)
            {
                if (LesComptes[i].NumCompte == _numCompte)
                {
                    return LesComptes[i];

                }

            }
            return null;
            
        }

        public bool BanqTransf(double _banqTransfer, Compte compteExtern)
        {//Dans cette partie on va gerer le transfère entre deux comptes
            bool valide = true;


            for (int i = 0; i < NbrComptes; i++)
            {
                if (LesComptes[i].Debiter(_banqTransfer))
                {
                    compteExtern.Crediter(_banqTransfer);

                    if (compteExtern == LesComptes[i]) 
                    {

                    }

                }
                else 
                {

                }

            }
            return valide;
        }

    }
}
