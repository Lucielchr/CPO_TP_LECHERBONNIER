/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lucie
 */
public abstract class Arme {
    String nom ;
    int niveauAttaque; 
    
    public Arme (String nom, int niveauAttaque){
        this.nom = nom ;
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            this.niveauAttaque = 100;
        }
    }
    
    public int getNiveauAttaque(){
        return niveauAttaque;
    }
    
    public String getnom(){
        return nom;
    }
    
    @Override 
    public String toString() {
        return "Arme :" + nom + "/ Niveau d'attaque :" + niveauAttaque ;
    }
}
