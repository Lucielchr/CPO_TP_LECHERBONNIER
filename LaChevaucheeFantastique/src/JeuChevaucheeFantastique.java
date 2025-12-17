/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class JeuChevaucheeFantastique {
    private int taille = 5; 
    private int[][] damier; 
    private Case posCavalier;
    private int niveauActuel = 0;
    
    private static final int[][] MOUVEMENTS_CAVALIER = {
        {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
        { 2, -1}, { 2, 1}, { 1, -2}, { 1, 2}
    };
    
    private static final int[][][] NIVEAUX_PREDEFINIS = {
        {
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0}
        },
        {
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1}
        }
    };
    
    
    public void passerAuNiveauSuivant() {
        initialiserNiveau(this.niveauActuel + 1);
    }

    public int getTaille() {
        return taille;
    }
    
    public int getEtatCase(int r, int c) {
        return damier[r][c];
    }

    public Case getPosCavalier() {
        return posCavalier;
    }

    public int getNiveauActuel() {
        return niveauActuel;
    }
    
    public int getTotalNiveaux() {
        return NIVEAUX_PREDEFINIS.length;
    }
}
