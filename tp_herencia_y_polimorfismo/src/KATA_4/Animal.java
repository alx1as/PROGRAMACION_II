/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_4;

/**
 *
 * @author alexia
 */

// Clase base que representa un animal genérico
public class Animal {
    protected String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que puede sobrescribirse para hacer sonido
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    // Método que describe el animal
    public void describirAnimal() {
        System.out.println("Este animal se llama: " + nombre);
    }
}

