using System;
using System.Collections.Generic;
using System.Text;


namespace Compte_banq
{
     class AppCompte
    {
        static void Main(string[]args)
        {

            Banque bnp = new Banque();
            bnp.Initial();

            bnp.AddCompte("12345678","Dutronc", 4500, -500);
            Console.WriteLine(bnp);
            Console.ReadLine();
            Console.WriteLine(bnp.CompteSup());
            Console.ReadLine();

            Compte c = bnp.RendCompte("12345678");
            if (c != null)
            {
                Console.WriteLine(c);
            }

            Console.ReadLine();


            if (bnp.BanqTransf( "12345678",1000, "34587289"))
            {
                Console.WriteLine("Le transfert entre les 2 comptes c'est bien passé !!!");
            }
            else
            {
                Console.WriteLine("Le traansfert est impossible !!!");
            }
            Console.ReadLine();
        }
    }
}
