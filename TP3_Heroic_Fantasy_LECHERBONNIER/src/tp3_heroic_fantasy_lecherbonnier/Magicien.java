/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

import Armes.Baton;
import Armes.Arme;

/**
 *
 * @author lucie
 */
public class Magicien extends Personnage {
    
    // Propriétés spécifiques
    private boolean confirme;
    
    // (44) Compteur statique pour les magiciens
    private static int nombreDeMagiciens = 0; 
    
    // --- Constructeur (45) ---
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        
        // Incrémentation du compteur spécifique
        nombreDeMagiciens++; 
    }
    
    // --- Getters et Setters ---
    public void setConfirme (boolean confirme){
        this.confirme = confirme;
    }
    
    public static int getNombreDeMagiciens() {
        return nombreDeMagiciens;
    }
    
    // --- Méthodes du TP ---

    // (37) Implémentation du challenge des armes de prédilection (Bâtons)
    @Override
    public int compterArmesDePredilection() {
        int count = 0;
        // Utilisation du getter getInventaireArmes() de la classe Personnage
        for (Arme a : getInventaireArmes()) {
            // Le magicien préfère les Bâtons
            if (a instanceof Baton) { 
                count++;
            }
        }
        return count;
    }
    
    // (57) Implémentation de la méthode d'attaque (Section 5)
    @Override
    public void attaquer(Personnage cible) {
        int degats = 0;
        
        if (this.getArmeEnMain() != null) {
            // Dégâts de base = Attaque de l'arme en main
            degats = this.getArmeEnMain().getNiveauAttaque();
            
            if (this.confirme) {
                // Si confirmé, les dégâts sont doublés (bonus)
                degats *= 2; 
                System.out.print(this.getNom() + " (Magicien Confirmé) frappe avec puissance (" + this.getArmeEnMain().getnom() + "). ");
            } else {
                System.out.print(this.getNom() + " (Magicien Novice) attaque avec " + this.getArmeEnMain().getnom() + ". ");
            }
            
            cible.estAttaque(degats);
        } else {
            // Dégâts sans arme
            degats = 5;
            System.out.print(this.getNom() + " (Magicien) attaque à mains nues. ");
            cible.estAttaque(degats);
        }
    }
    
    // (46) Déstructeur (Finalize)
    @Override
    protected void finalize() throws Throwable {
        try {
            // Décrémentation du compteur spécifique
            nombreDeMagiciens--; 
        } finally {
            super.finalize(); // Appel au finalize de Personnage
        }
    }
    
    // (36) Affichage des caractéristiques
    @Override
    public String toString() {
        // Appel du toString du parent (Personnage) pour inclure l'arme en main
        return "Magicien : " + super.toString() + " | Confirmé : " + confirme; 
    }
}