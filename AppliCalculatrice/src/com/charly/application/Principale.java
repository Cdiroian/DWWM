/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charly.application;
import java.util.Scanner;
/**
 *
 * @author CRM
 */
public class Principale {
    static Scanner clavier = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Calculatrice.calculer = ('+' , 14 , 27);
        double nbr1 = 0, nbr2 =0;
        System.out.println("Entrer le premier nombre: ");
        nbr1 = clavier.nextDouble();
		
	System.out.println("Entrer le second nombre: ");
	nbr2 = clavier.nextDouble();
		
	System.out.println("La somme de "+ nbr1+ " + "+nbr2+" = "+ (nbr1+nbr2));
        System.out.println("La soustraction de "+ nbr1+ " - "+nbr2+" = "+ (nbr1-nbr2));
        System.out.println("La multiplication de "+ nbr1+ " x "+nbr2+" = "+ (nbr1*nbr2));
        System.out.println("La division de "+ nbr1+ " / "+nbr2+" = "+ (nbr1/nbr2));
    }
    
}
