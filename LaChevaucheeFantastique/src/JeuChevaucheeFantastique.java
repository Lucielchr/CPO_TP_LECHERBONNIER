/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */

import java.util.Random;

public class JeuChevaucheeFantastique {
    private int taille = 5; 
    private int[][] damier; 
    private Case posCavalier;
    private int niveauActuel = 1;
    
    public JeuChevaucheeFantastique() {
        this.damier = new int[taille][taille];
        initialiserNiveau(1);
    }
    
    public void initialiserNiveau(int index) {
        this.niveauActuel = index;
        // On vide le damier pour la nouvelle génération
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) damier[i][j] = 0;
        }
        genererAleatoire();
        placerCavalier();
    }
    
    private void genererAleatoire() {
        Random rand = new Random();
        int r = rand.nextInt(taille);
        int c = rand.nextInt(taille);
        damier[r][c] = 1;

        int[][] sauts = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        int nombreDeCasesCibles = Math.min(5 + niveauActuel, 20);
        
        int casesAllumees = 1;
        int tentatives = 0;

        while (casesAllumees < nombreDeCasesCibles && tentatives < 200) {
            int[] s = sauts[rand.nextInt(8)];
            int nr = r + s[0];
            int nc = c + s[1];

            if (nr >= 0 && nr < taille && nc >= 0 && nc < taille) {
                if (damier[nr][nc] == 0) {
                    damier[nr][nc] = 1;
                    casesAllumees++;
                }
                r = nr;
                c = nc;
            }
            tentatives++;
        }
    }
    
    
    private void placerCavalier() {
        for(int r = 0; r < taille; r++) {
            for(int c = 0; c < taille; c++) {
                if (damier[r][c] == 1) {
                    posCavalier = new Case(r, c);
                    damier[r][c] = 0; 
                    return;
                }
            }
        }
    }
    
    public boolean deplacerCavalier(int r, int c) {
        int dR = Math.abs(r - posCavalier.getLigne());
        int dC = Math.abs(c - posCavalier.getColonne());
        
        if (((dR == 2 && dC == 1) || (dR == 1 && dC == 2)) && damier[r][c] == 1) {
            posCavalier = new Case(r, c);
            damier[r][c] = 0; 
            return true;
        }
        return false;
    }
    
    public boolean peutEncoreJouer() {
        if (estTermine()) return true; 
        int r = posCavalier.getLigne();
        int c = posCavalier.getColonne();
        int[][] sauts = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        
        for (int[] s : sauts) {
            int nr = r + s[0];
            int nc = c + s[1];
            if (nr >= 0 && nr < taille && nc >= 0 && nc < taille) {
                if (damier[nr][nc] == 1) return true;
            }
        }
        return false;
    }
    
    public boolean estTermine() {
        for(int[] row : damier) {
            for(int val : row) if(val == 1) return false;
        }
        return true;
    }
    
    public int getTaille() {
        return taille;
    }
    
    public int getEtatCase(int r, int c) {
        return damier[r][c];
    }

    public int getNiveauActuel() {
        return niveauActuel;
    }
    
    public Case getPosCavalier() {
        return posCavalier; 
    }
}
