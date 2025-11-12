/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_2;

/**
 *
 * @author alexia
 */

// Clase abstracta que representa una figura geométrica
public abstract class Figura {
    // Atributo común a todas las figuras
    protected String nombre;

    // Constructor para inicializar el nombre
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe implementarse en las subclases
    public abstract double calcularArea();

    // Método común para mostrar el nombre de la figura
    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }
}

