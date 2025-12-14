/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lucie
 */

import tp3_heroic_fantasy_lecherbonnier.etreVivant;
import java.util.ArrayList;
import Armes.Arme;

public abstract class Personnage implements etreVivant {

    protected String nom;
    protected int niveauVie;
    protected static int nbPersonnages = 0;

    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }

    public String getNom() { return nom; }
    public int getNiveauVie() { return niveauVie; }
    public static int getNbPersonnages() { return nbPersonnages; }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println(nom + " possède déjà 5 armes.");
        }
    }

    public void equiperArme(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " s’équipe de " + nomArme);
                return;
            }
        }
        System.out.println(nom + " ne possède pas l’arme " + nomArme);
    }

    
    @Override
    public void seFatiguer() {
        niveauVie -= 10;
        if (niveauVie < 0) niveauVie = 0;
    }

    @Override
    public boolean estVivant() { return niveauVie > 0; }

    
    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
        if (niveauVie < 0) niveauVie = 0;
    }

    public abstract int nbArmesDePredilection();
    public abstract void attaquer(Personnage cible);

    @Override
    public String toString() {
        return "Nom : " + nom + ", vie = " + niveauVie +
               (armeEnMain != null ? ", arme = " + armeEnMain : ", aucune arme");
    }
    
}