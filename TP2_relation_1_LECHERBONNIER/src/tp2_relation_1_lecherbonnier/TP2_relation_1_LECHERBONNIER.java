/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_lecherbonnier;

/**
 *
 * @author lucie
 */
public class TP2_relation_1_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

        System.out.println("\n" + bob);
        System.out.println(reno);

        System.out.println("\nPremiere voiture de Bob : " + bob.liste_voitures[0]);
        System.out.println("Proprietaire de la Clio : " + uneClio.proprietaire.prenom);
    }
    
}
