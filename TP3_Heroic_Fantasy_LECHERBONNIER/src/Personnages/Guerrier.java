/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Epee;
import Armes.Arme;

/**
 *
 * @author lucie
 */
public class Guerrier extends Personnage {

    private boolean aCheval;
    private static int nbGuerriers = 0;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire)
            if (a instanceof Epee) c++;
        return c;
    }

    @Override
    public void attaquer(Personnage cible) {
        if (armeEnMain == null) {
            System.out.println(nom + " n’a pas d’arme !");
            return;
        }

        int degats = armeEnMain.getNiveauAttaque();

        if (armeEnMain instanceof Epee) {
            Epee e = (Epee) armeEnMain;
            degats *= e.getFinesse();
            seFatiguer();
        }

        if (aCheval) degats /= 2;

        System.out.println(nom + " attaque " + cible.getNom() +
                           " et inflige " + degats + " dégâts.");

        cible.estAttaque(degats);
    }

    @Override
    public String toString() {
        return "Guerrier - " + super.toString() +
               (aCheval ? " (à cheval)" : " (à pied)");
    }
}