/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lecherbonnier;

/**
 *
 * @author lucie
 */
public class TP2_Bieres_LECHERBONNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 
7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette(); 
        System.out.println(uneBiere) ; 
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 
6.6 ,"Abbaye de Leffe") ;
        uneSecondeBiere.lireEtiquette(); 
        System.out.println(uneSecondeBiere) ; 
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Chouffe", 
8.0 ,"Dubuisson") ;
        uneTroisiemeBiere.lireEtiquette(); 
        System.out.println(uneTroisiemeBiere) ; 
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Amsterdam", 
8.5 ,"Brewery Amsterdam") ;
        uneQuatriemeBiere.lireEtiquette(); 
        System.out.println(uneQuatriemeBiere) ; 
        

    }
    
}
