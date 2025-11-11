/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjetlecherbonnier;

/**
 *
 * @author lucie
 */
public class TP2_convertisseurObjetLECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        convertisseur conv1 = new convertisseur();
        convertisseur conv2 = new convertisseur();

        System.out.println("25C = " + conv1.CelciusVersKelvin(25) + " K");
        System.out.println("100F = " + conv1.FarenheitVersCelcius(100) + " C");
        System.out.println(conv1);

        System.out.println("0 K = " + conv2.KelvinVersCelcius(0) + " C");
        System.out.println("20C = " + conv2.CelciusVersFarenheit(20) + " F");
        System.out.println(conv2);
    }
}
   
