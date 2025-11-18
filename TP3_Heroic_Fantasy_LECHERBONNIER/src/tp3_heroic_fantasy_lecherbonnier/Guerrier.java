/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */
public class Guerrier extends Personnage{
    boolean aCheval;
    
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }
    public void setACheval(boolean aCheval){
        this.aCheval = aCheval;
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
}
