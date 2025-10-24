/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/** calculer le resultat de l'operation impliquant les 2 operandes et l'operateur selectionne 
 * 20/10/2025
 * @author lucie
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("""
                   1) add 
                   2) substract 
                   3) multiply 
                   4) divide 
                   5) modulo """) ;  
    int operateur; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer le nombre: ");
    operateur=sc.nextInt();
    int operande1; 
    System.out.println("Entrer le nombre: ");
    operande1=sc.nextInt();
    int operande2; 
    System.out.println("Entrer le nombre: ");
    operande2=sc.nextInt();
    int result=0;
    if (operateur==1){
        result= operande1+operande2; 
    }
    else if(operateur==2){
        result= operande1-operande2; 
    }   
    else if(operateur==3){
        result= operande1*operande2; 
    }
    else if(operateur==4){
        if (operande2==0){
            System.out.println("Pas possible");
        }
        else{
            result=operande1/operande2;
        }
    }
    else if (operateur==5){
        result = operande1%operande2;
    }
    else 
        System.out.println("valeur fausse!");
    System.out.println("Le resultat est:"+ result);
    
    
    }
}
   

