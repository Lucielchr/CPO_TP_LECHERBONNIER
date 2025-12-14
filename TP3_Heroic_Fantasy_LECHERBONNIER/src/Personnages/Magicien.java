/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author lucie
 */
public class Magicien extends Personnage {

    private boolean confirme;
    private static int nbMagiciens = 0;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire)
            if (a instanceof Baton) c++;
        return c;
    }

    @Override
    public void attaquer(Personnage cible) {
        if (armeEnMain == null) {
            System.out.println(nom + " n’a pas d’arme !");
            return;
        }

        int degats = armeEnMain.getNiveauAttaque();

        if (armeEnMain instanceof Baton) {
            Baton b = (Baton) armeEnMain;
            degats *= b.getAge();
            seFatiguer();
        }

        if (confirme) degats /= 2;

        System.out.println(nom + " attaque " + cible.getNom() +
                           " et inflige " + degats + " dégâts.");

        cible.estAttaque(degats);
    }

    @Override
    public String toString() {
        return "Magicien - " + super.toString() +
               (confirme ? " (confirmé)" : " (novice)");
    }
}