/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecherbonnier;

/**
 *
 * @author lucie
 */
public class Baton extends Arme{
    int age ;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age <= 100){
            this.age = age;
        }else{
            this.age= 100;
        }
    }
    
    public int getAge(){
        return  age;
    }
    
    @Override
    public String toString() {
        return "Baton : " + nom + " | Attaque : " + niveauAttaque + " | Age : " + age;
    }
}
