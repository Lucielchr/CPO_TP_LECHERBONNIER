/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */

import java.util.ArrayList;
        
public abstract class Personnage {
    String nom;
    int niveauVie;
    private ArrayList<Arme> inventaireArmes; // (31) private
    private Arme Arme_en_Main;
    
   
    public Personnage (String nom, int niveauVie){
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaireArmes = new ArrayList<>();
        this.Arme_en_Main = null;
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
}




