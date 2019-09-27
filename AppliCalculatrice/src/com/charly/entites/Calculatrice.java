/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charly.entites;

/**
 *
 * @author CRM
 */
public class Calculatrice {

    public static char calculer;

    
    
    char operateur;
    double var1;
    double var2;
    
    
    @Override
    public String toString() {
        return "Calculer" +  ", variable 1 =" + var1 + " " + operateur +
                " variable 2 =" + var2 ;
        
        // Cette partie du code permet d'afficher dans l'ordre le caclcul
        // de cette maniére (5 + 7 ou 54 / 7)
    }

    public Calculatrice(char operateur, double var1, double var2) {
        this.operateur = operateur;
        this.var1 = var1;
        this.var2 = var2;
    }

    public char getOperateur() {
        return operateur;
    }

    public void setOperateur(char operateur) {
        this.operateur = operateur;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }
   
}
