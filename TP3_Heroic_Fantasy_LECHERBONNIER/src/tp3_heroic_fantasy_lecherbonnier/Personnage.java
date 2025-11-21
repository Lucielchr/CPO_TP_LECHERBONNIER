/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */

import Armes.Arme;
import java.util.ArrayList;
        
public abstract class Personnage implements etreVivant{
    String nom;
    int niveauVie;
    private ArrayList<Arme> inventaireArmes; // (31) private
    private Arme Arme_en_Main;
    private static int nombreDePersonnages = 0;
   
    public Personnage (String nom, int niveauVie){
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaireArmes = new ArrayList<>();
        this.Arme_en_Main = null;
        nombreDePersonnages++; 
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getNiveauVie(){
        return niveauVie;
    }
    
    public ArrayList<Arme> getInventaireArmes() {
        return inventaireArmes;
    }
    
    public static int getNombreDePersonnages() {
        return nombreDePersonnages;
    }
    
    public void ajouterArme(Arme a) {
        if (inventaireArmes.size() < 5) {
            inventaireArmes.add(a);
            System.out.println(this.nom + " a ajouté " + a.getnom() + " à son inventaire.");
        } else {
            System.out.println(this.nom + " a l'inventaire plein (5/5) et ne peut pas ajouter " + a.getnom() + ".");
        }
    }
    
    public void equiperArme(String nomArme) {
        for (Arme a : inventaireArmes) {
            if (a.getnom().equals(nomArme)) {
                this.Arme_en_Main = a;
                System.out.println(this.nom + " s'équipe avec " + nomArme + ".");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'a pas été trouvée dans l'inventaire de " + this.nom + ".");
    }
    
    public abstract int compterArmesDePredilection();
    
    @Override
    public String toString() {
        String base =  "Personnage : " + nom + " | Niveau de vie : " + niveauVie;

        
    if (Arme_en_Main != null) {
            // Ajout des caractéristiques de l'arme en main (en appelant le toString de l'objet Arme)
            base += " | Arme en main : " + Arme_en_Main.toString(); 
        } else {
            base += " | Arme en main : Aucune";
        }
        return base;
    }
 
   @Override
    protected void finalize() throws Throwable {
        try {
            // Décrémentation du compteur total
            nombreDePersonnages--; 
            System.out.println("DEBUG: " + this.nom + " (Personnage) a été détruit. Total restant: " + nombreDePersonnages);
        } finally {
            super.finalize();
        }
    }
    
    @Override
    public void seFatiguer() {
        this.niveauVie -= 10;
        System.out.println(this.nom + " est fatigué et perd 10 points de vie. Vie restante : " + this.niveauVie);
    }
    
    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }
    
    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points;
        System.out.println(this.nom + " subit " + points + " points de dégâts. Vie restante : " + this.niveauVie);
    }
    
    public abstract void attaquer(Personnage cible);
}




