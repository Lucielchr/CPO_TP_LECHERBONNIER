/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_lecherbonnier;

import java.util.Scanner;

/**
 *
 * @author lucie
 */
public class TP1_convertisseur_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Bonjour, saisissez une valeur : ");
double valeur = sc.nextDouble();

System.out.println("\nSaisissez la conversion que vous souhaitez effectuer : ");
System.out.println("1) De Celcius vers Kelvin");
System.out.println("2) De Kelvin vers Celcius");
System.out.println("3) De Celcius vers Farenheit");
System.out.println("4) De Farenheit vers Celcius");
System.out.println("5) De Kelvin vers Farenheit");
System.out.println("6) De Farenheit vers Kelvin");

int choix = sc.nextInt();
double resultat = 0.0;

switch (choix) {
    case 1:
        resultat = valeur + 273.15; 
        System.out.println(valeur + " degres Celcius est egal a " + resultat + " degres Kelvin");
        break;
    case 2:
        resultat = valeur - 273.15; 
        System.out.println(valeur + " degres Kelvin est egal a " + resultat + " degres Celcius");
        break;
    case 3:
        resultat = valeur * 9 / 5 + 32;
        System.out.println(valeur + " degres Celcius est egal a " + resultat + " degres Farenheit");
        break;
    case 4:
        resultat = (valeur - 32) * 5 / 9; 
        System.out.println(valeur + " degres Farenheit est egal a " + resultat + " degres Celcius");
        break;
    case 5:
        resultat = (valeur - 273.15) * 9 / 5 + 32;
        System.out.println(valeur + " degres Kelvin est egal a " + resultat + " degres Farenheit");
        break;
    case 6:
        resultat = (valeur - 32) * 5 / 9 + 273.15; 
        System.out.println(valeur + " degres Farenheit est egal a " + resultat + " degres Kelvin");
        break;
    default:
        System.out.println("Choix invalide !");
}

sc.close();
        
    }
    
}
