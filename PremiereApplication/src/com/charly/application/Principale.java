/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charly.application;

import com.charly.entites.Personne;
import javax.swing.JOptionPane;
/**
 *
 * @author CRM
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Mon premier Code en Java!!!
//        System.out.println("--------------------------------------------");
//        System.out.println("Hello world .....");
//        System.out.println("Mon premier programme Java fonctionne !!!!");
//        System.out.println("--------------------------------------------");
        Personne marcel = new Personne("Marcel","Dupont",70);
//        System.out.println(marcel);
        marcel.setPrenom("henri");
        String prenom = JOptionPane.showInputDialog(null,"Prénom ?",
                "Nouveau prénom",JOptionPane.QUESTION_MESSAGE);
        marcel.setPrenom(prenom);
        JOptionPane.showMessageDialog(null,marcel,"Personne",
                JOptionPane.INFORMATION_MESSAGE);
        marcel.setPrenom(JOptionPane.showInputDialog(null,"Prénom ?",
                "Nouveau Prénom",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, marcel,"Personne",JOptionPane.INFORMATION_MESSAGE);
        
    }
 
}
