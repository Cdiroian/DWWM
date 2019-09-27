/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//        Circonference = Math.PI*2*rayon;
//        Surface = Math.PI*rayon*rayon;
package com.charly.application;

import com.charly.entites.Cercle;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
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
        
       Cercle monCercle = new Cercle(0,0,0);
//        System.out.println(rayon);
       
       monCercle.setRayon(0);
        
       String saisieUtilisateur = JOptionPane.showInputDialog(null,"Quel est la valeur du rayon?","Nouveau cercle",JOptionPane.QUESTION_MESSAGE);
        
       float saisieConvertie = Float.parseFloat(saisieUtilisateur); 
       
       monCercle.setRayon(saisieConvertie);
       
       System.out.println(monCercle);
       
       
       
        
    }
    
}
