/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_lecherbonnier;

import java.util.Scanner;

/**
 *
 * @author lucie
 */
public class TP1_manipNombresInt_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier nombre: ");
        var1=sc.nextInt();
        int var2; 
        System.out.println("Entrer le deuxieme nombre: ");
        var2=sc.nextInt();
        System.out.println(var1+var2);
        System.out.println(var1-var2);
        System.out.println(var1*var2);
        if (var2==0){
            System.out.println("La division est impossible");
        }
        else{
            System.out.println(var1/var2);
        }
        if (var2==0){
            System.out.println("La division est impossible");
        }
        else{
            System.out.println(var1%var2);
    }
    
    }
}
