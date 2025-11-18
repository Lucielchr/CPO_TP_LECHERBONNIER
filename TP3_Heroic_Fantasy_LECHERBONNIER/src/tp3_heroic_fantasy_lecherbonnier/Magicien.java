/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */
public class Magicien extends Personnage{
    boolean confirme;
    
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }
    
    public void setConfirme (boolean confirme){
        this.confirme = confirme;
    }
    
    @Override
    public String toString() {
    return "Magicien : " + nom + " | Vie : " + niveauVie + " | Confirmé : " + confirme;
    }

    @Override
    public int compterArmesDePredilection() {
        int count = 0;
        for (Arme a : getInventaireArmes()) {
            // CORRECTION: Le magicien préfère les Bâtons, pas les Épées
            if (a instanceof Baton) { // <--- DOIT ÊTRE BATON
                count++;
            }
        }
        return count;
    }
    
}