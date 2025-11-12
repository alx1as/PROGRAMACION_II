/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_4;

/**
 *
 * @author alexia
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica de animales
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Apu"));
        animales.add(new Gato("Lupa"));
        animales.add(new Vaca("Lola"));

        // Uso de polimorfismo para llamar al método sobrescrito
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("---------------------");
        }
    }
}

