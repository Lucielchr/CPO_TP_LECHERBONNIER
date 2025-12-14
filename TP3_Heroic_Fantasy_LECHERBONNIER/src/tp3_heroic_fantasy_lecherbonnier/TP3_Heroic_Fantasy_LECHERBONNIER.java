/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

import Personnages.*;
import Armes.*;

/**
 *
 * @author lucie
 */
public class TP3_Heroic_Fantasy_LECHERBONNIER {

       public static void main(String[] args) {


        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal  = new Epee("Durandal", 4, 7);

        Baton chene  = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        Magicien merlin = new Magicien("Merlin", 100, false);  
        Guerrier conan  = new Guerrier("Conan", 120, true);    
       
       
        merlin.ajouterArme(durandal);
        merlin.ajouterArme(charme);

        conan.ajouterArme(excalibur);
        conan.ajouterArme(chene);

        merlin.equiperArme("Charme");
        conan.equiperArme("Excalibur");


        System.out.println("=== Début du combat ===");
        System.out.println(merlin);
        System.out.println(conan);


        System.out.println("\n--- Tour 1 : Merlin attaque ---");
        merlin.attaquer(conan);

        System.out.println("\n--- État après attaque du magicien ---");
        System.out.println(merlin);
        System.out.println(conan);

        System.out.println("\n--- Tour 2 : Conan attaque ---");
        conan.attaquer(merlin);

        System.out.println("\n--- État après attaque du guerrier ---");
        System.out.println(merlin);
        System.out.println(conan);

        System.out.println("\n--- Résultat final ---");
        System.out.println("Merlin est vivant ? " + merlin.estVivant());
        System.out.println("Conan est vivant ? " + conan.estVivant());
    }
}
