/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

import Armes.Epee;
import Armes.Arme;

/**
 *
 * @author lucie
 */
public class Guerrier extends Personnage{
    boolean aCheval;
    private static int nombreDeGuerriers = 0;
    
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nombreDeGuerriers++;
    }
    public void setACheval(boolean aCheval){
        this.aCheval = aCheval;
    }
    
    public static int getNombreDeGuerriers() {
        return nombreDeGuerriers;
    }
    
    @Override
    public String toString() {
        return "Guerrier : " + nom + " | Vie : " + niveauVie + " | À cheval : " + aCheval;
    }

    @Override
    public int compterArmesDePredilection() {
        int count = 0;
        // CORRECTION: Remplacez l'exception par le code de comptage des Épées
        for (Arme a : getInventaireArmes()) {
            if (a instanceof Epee) { // Le Guerrier préfère les Épées
                count++;
            }
        }
        return count;
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            nombreDeGuerriers--; // Décrémentation du compteur spécifique
        } finally {
            super.finalize(); // Appel au finalize de Personnage
        }
    }
    
    @Override
    public void attaquer(Personnage cible) {
        int degats = 30; // Dégâts de base
        
        // (56) Appelle la méthode estAttaque(points) de la cible
        System.out.print(this.getNom() + " (Guerrier) attaque " + cible.getNom() + ". ");
        cible.estAttaque(degats);
    }
}
