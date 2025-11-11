/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lecherbonnier;

/**
 *
 * @author lucie
 */
class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3];
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : voiture déjà possedee !");
            return false;
        }
        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " possede deja 3 voitures !");
            return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " possede " + nbVoitures + " voiture(s).";
    }
}
