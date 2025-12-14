/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lucie
 */
public class Epee extends Arme {

    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse > 100) finesse = 100;
        if (finesse < 0) finesse = 0;
        this.finesse = finesse;
    }

    public int getFinesse() { return finesse; }

    @Override
    public String toString() {
        return "Épée " + super.toString() + ", finesse = " + finesse;
    }
}
