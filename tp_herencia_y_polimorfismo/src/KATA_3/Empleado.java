/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_3;

/**
 *
 * @author alexia
 */
// Clase abstracta que representa a un empleado
public abstract class Empleado {
    protected String nombre;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que cada subclase debe implementar
    public abstract double calcularSueldo();

    // Muestra el nombre del empleado
    public void mostrarNombre() {
        System.out.println("Empleado: " + nombre);
    }
}

