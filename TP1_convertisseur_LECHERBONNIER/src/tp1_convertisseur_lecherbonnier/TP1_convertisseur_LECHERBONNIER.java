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
        double temp;
        double tempK;
        double tempC;
        double tempC2;
        double tempF;
        double tempF2;
        double tempK2;
        double choix;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        temp= sc.nextDouble();

        System.out.println("\nSaisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit");
        System.out.println("4) De Farenheit vers Celcius");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        choix=sc.nextDouble();

        if (choix==1) { 
            tempK=CelciusVersKelvin(temp);
            System.out.println("Temperature en Kelvin : " + tempK +" K");
        }
    
        if (choix==2) { 
            tempC=KelvinVersCelcuis(temp);
            System.out.println("Temperature en Celcuis : " + tempC +" C");
        }
    
        if (choix==3) { 
            tempC2=FareinheitVersCelcuis(temp);
            System.out.println("Temperature en Celcuis : " + tempC2 +" C");
        }
    
        if (choix==4) { 
            tempF=CelciusVersFarenheit(temp);
            System.out.println("Temperature en Farenheit : " + tempF +" F");
        }
    
        if (choix==5) { 
            tempF2=KelvinVersFarenheit(temp);
            System.out.println("Temperature en Farenheit : " + tempF2 +" F");
        }
    
        if (choix==6) { 
            tempK2=FarenheitVersKelvin(temp);
            System.out.println("Temperature en Kelvin : " + tempK2 +" K");
        }
    }
    public static double CelciusVersKelvin(double temp) {
        double temp_K = temp+273.00;
        return temp_K;
    }
    public static double KelvinVersCelcuis(double temp) {
        double temp_C = temp-273.00;
        return temp_C;
    }
    public static double FareinheitVersCelcuis(double temp) {
        double temp_C2 = temp-17.78;
        return temp_C2;
    }
    public static double CelciusVersFarenheit(double temp) {
        double temp_F = temp+32.00;
        return temp_F;
    }
    public static double KelvinVersFarenheit(double temp) {
        double temp_F2 = temp-459.7;
        return temp_F2;
    }
    public static double FarenheitVersKelvin(double temp) {
        double temp_K2 = temp+255.372;
        return temp_K2;
    }
    
}