/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */

import java.util.Random;

public class CadenasJeu {
    
    public enum NiveauDifficulte {
        FACILE(15),      
        NORMAL(10),      
        DIFFICILE(5);    

        private final int maxTentatives;

        NiveauDifficulte(int maxTentatives) {
            this.maxTentatives = maxTentatives;
        }

        public int getMaxTentatives() {
            return maxTentatives;
        }
    }
    
    private static final int LONGUEUR_CODE = 4;
    private static final int MIN_CHIFFRE = 0; 
    private static final int MAX_CHIFFRE = 9;
    
    private int[] codeSecret;
    private int tentativesRestantes;
    private boolean estGagne;
    private int maxTentativesJeu;
    private NiveauDifficulte niveauCourant;
    
    
    public CadenasJeu(NiveauDifficulte niveau) {
    this.niveauCourant = niveau;
    this.maxTentativesJeu = niveau.getMaxTentatives();
    démarrerJeu();
    }
    
    public final void démarrerJeu() {
    codeSecret = générerCodeSecret();
    tentativesRestantes = maxTentativesJeu; 
    estGagne = false;
    }
    
    private int[] générerCodeSecret() {
        Random rand = new Random();
        int[] code = new int[LONGUEUR_CODE];
        for (int i = 0; i < LONGUEUR_CODE; i++) {
            code[i] = rand.nextInt(MAX_CHIFFRE - MIN_CHIFFRE + 1) + MIN_CHIFFRE;
        }
        return code;
    }
    
    public int[] testerCombinaison(int[] essai) throws IllegalArgumentException {
        if (essai == null || essai.length != LONGUEUR_CODE) {
            throw new IllegalArgumentException("L'essai doit être un tableau de " + LONGUEUR_CODE + " chiffres.");
        }
        
        if (estPartieTerminee() && !estGagne) {
            return new int[]{0, 0, 0}; 
        }

        int exacts = 0;
        int tropHauts = 0;
        int tropBas = 0;

        for (int i = 0; i < LONGUEUR_CODE; i++) {
            if (essai[i] == codeSecret[i]) {
                exacts++;
            } else if (essai[i] > codeSecret[i]) {
                tropHauts++;
            } else { 
                tropBas++;
            }
        }
        
        tentativesRestantes--;
        
        if (exacts == LONGUEUR_CODE) {
            estGagne = true;
        }
        
        return new int[]{exacts, tropHauts, tropBas}; 
    }
    
    public boolean estPartieTerminee() {
        return estGagne || tentativesRestantes <= 0;
    }
    
    public int getTentativesEffectuees() {
        return maxTentativesJeu - tentativesRestantes;
    }
    
    public int getMaxTentatives() {
        return maxTentativesJeu;
    }

    public boolean estGagne() {
        return estGagne;
    }
    
    public String getCodeSecretString() {
         return arrayToString(codeSecret);
    }
    
    public NiveauDifficulte getNiveauCourant() {
    return niveauCourant;
    }

    public int[] getCodeSecret() {
    return java.util.Arrays.copyOf(codeSecret, codeSecret.length);
    }

    private String arrayToString(int[] arr) {
        if (arr == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        return sb.toString();
    }
}
