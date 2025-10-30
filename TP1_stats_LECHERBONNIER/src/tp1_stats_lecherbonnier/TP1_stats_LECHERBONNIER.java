/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_lecherbonnier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucie
 */
public class TP1_stats_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] de = new int[6];

        System.out.print("Combien de lancers voulez-vous effectuer ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int face = rand.nextInt(6);
            de[face]++;
        }

        System.out.println("\nNombre d'apparitions de chaque face :");
        for (int i = 0; i < de.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + de[i]);
        }

        System.out.println("\nPourcentage d'apparition de chaque face :");
        for (int i = 0; i < de.length; i++) {
            double pourcentage = (de[i] * 100.0) / m;
            System.out.printf("Face %d : %.2f%%\n", i + 1, pourcentage);
        }

        sc.close();
    }
}