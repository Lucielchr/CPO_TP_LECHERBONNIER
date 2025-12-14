/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lucie
 */
public class Baton extends Arme {

    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age > 100) age = 100;
        if (age < 0) age = 0;
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Bâton " + super.toString() + ", âge = " + age;
    }
}