/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber.lecherbonnier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucie
 */
public class TP1_guessMyNumberLECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("5 nombres aleatoires entre 0 et 100 :");
        for (int i = 0; i < 5; i++) {
            System.out.println(generateurAleat.nextInt(101));
        }

        System.out.println("\nChoisissez un niveau de difficulte : facile, normal, difficile, cauchemar");
        String difficulte = sc.nextLine();

        int max = 100;
        int coupsMax = Integer.MAX_VALUE; 
        boolean modeCauchemar = false;

        switch (difficulte) {
            case "facile":
                max = 50;
                break;
            case "normal":
                max = 100;
                break;
            case "difficile":
                max = 200;
                coupsMax = 10;
                break;
            case "cauchemar":
                max = 100;
                modeCauchemar = true;
                coupsMax = 10;
                break;
            default:
                System.out.println("Niveau inconnu, mode normal active");
        }

        int nombreADeviner = generateurAleat.nextInt(max + 1);
        int tentative = 0;
        int saisie = -1;

        System.out.println("\nDevinez le nombre entre 0 et " + max + " !");

        while (saisie != nombreADeviner && tentative < coupsMax) {
            System.out.print("Votre proposition : ");
            saisie = sc.nextInt();
            tentative++;

            boolean fauxMessage = false;
            if (modeCauchemar) {
                if (generateurAleat.nextInt(100) < 30) {
                    fauxMessage = true;
                }
            }

            if (saisie == nombreADeviner) {
                System.out.println("Gagne ! Vous avez trouve en " + tentative + " tentatives.");
            } else {
                if (fauxMessage) {
                    if (saisie < nombreADeviner) {
                        System.out.println("Trop grand !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                } else {
                    if (saisie < nombreADeviner) {
                        System.out.println("Trop petit");
                    } else {
                        System.out.println("Trop grand");
                    }
                }
            }
        }

        if (saisie != nombreADeviner) {
            System.out.println("Vous avez épuise vos tentatives. Le nombre etait : " + nombreADeviner);
        }

        sc.close();
    }
    
}
