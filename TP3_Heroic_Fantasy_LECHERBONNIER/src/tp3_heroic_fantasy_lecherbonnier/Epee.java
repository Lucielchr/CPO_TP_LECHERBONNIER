/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */
public class Epee extends Arme {
    int finesse; 
    
    public Epee(String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (finesse <= 100) {
            this.finesse = finesse;
        } else {
            this.finesse= 100;
        }
    }
    
    public int getFinesse(){
        return finesse;
    }
    
    @Override
    public String toString(){
        return "Epee : " + nom + "/ Attaque :" + niveauAttaque + "/ Finesse : " + finesse;
    }
}
