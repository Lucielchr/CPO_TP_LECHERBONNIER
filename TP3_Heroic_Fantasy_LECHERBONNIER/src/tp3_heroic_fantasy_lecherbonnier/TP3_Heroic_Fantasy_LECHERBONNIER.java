/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

import java.util.ArrayList;

/**
 *
 * @author lucie
 */
public class TP3_Heroic_Fantasy_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création des bâtons
        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Tableau dynamique d’armes
        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(epee1);
        listeArmes.add(epee2);
        listeArmes.add(baton1);
        listeArmes.add(baton2);

        // Affichage
        System.out.println("Liste des armes :");
        for (Arme a : listeArmes) {
            System.out.println(a);
        }
    }
    
}
