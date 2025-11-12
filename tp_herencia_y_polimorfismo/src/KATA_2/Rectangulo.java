/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_2;

/**
 *
 * @author alexia
 */

// Subclase que representa un rectángulo
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor que inicializa nombre, base y altura
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Implementa el cálculo del área específica para rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

