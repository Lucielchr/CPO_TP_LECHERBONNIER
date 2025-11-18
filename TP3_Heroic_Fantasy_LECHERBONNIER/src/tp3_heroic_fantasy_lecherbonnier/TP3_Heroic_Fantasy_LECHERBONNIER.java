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

        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(epee1);
        listeArmes.add(epee2);
        listeArmes.add(baton1);
        listeArmes.add(baton2);

        System.out.println("Liste des armes :");
        for (Arme a : listeArmes) {
            System.out.println(a);
        }
        
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> listePersonnages = new ArrayList<>();
        listePersonnages.add(gandalf);
        listePersonnages.add(garcimore);
        listePersonnages.add(conan);
        listePersonnages.add(lannister);

        System.out.println("Liste des personnages :");
        for (Personnage p : listePersonnages) {
            System.out.println(p);
        }
        
        System.out.println("3.2 Tests de la gestion des armes");

Guerrier aragorn = new Guerrier("Aragorn", 90, true);  // À cheval
Magicien merlin = new Magicien("Merlin", 70, false); // Novice

Epee e4 = new Epee("Épée du Nord", 8, 4);
Epee e5 = new Epee("Lame Noire", 12, 6);
Epee e6 = new Epee("Dague de Fer", 5, 2);

Baton b4 = new Baton("Bâton de Houx", 6, 15);
Baton b5 = new Baton("Canne de Sorcier", 10, 20);
Baton b6 = new Baton("Baguette", 3, 5);


System.out.println("\n--- Actions sur le Guerrier (" + aragorn.getNom() + ") ---");
aragorn.ajouterArme(b4); 
aragorn.ajouterArme(e4); 
aragorn.ajouterArme(e5); 

aragorn.equiperArme("Épée du Nord");


System.out.println("\n--- Actions sur le Magicien (" + merlin.getNom() + ") ---");
merlin.ajouterArme(b5); 
merlin.ajouterArme(b6); 
merlin.ajouterArme(e6); 

merlin.equiperArme("Bâton de Houx");

System.out.println("\n--- Compteurs de Prédilection ---");
int nbBatonMagicien = merlin.compterArmesDePredilection();
System.out.println(merlin.getNom() + " possède **" + nbBatonMagicien + "** arme(s) de prédilection (Bâtons).");

int nbEpeeGuerrier = aragorn.compterArmesDePredilection();
System.out.println(aragorn.getNom() + " possède **" + nbEpeeGuerrier + "** arme(s) de prédilection (Épées).");

System.out.println("\n--- Caractéristiques Finales (toString) ---");
System.out.println(aragorn); 
System.out.println(merlin);  
    
    }
   
}
    
