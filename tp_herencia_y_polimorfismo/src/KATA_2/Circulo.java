/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_2;

/**
 *
 * @author alexia
 **/


// Subclase que representa un círculo
public class Circulo extends Figura {
    private double radio;

    // Constructor que inicializa nombre y radio
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Implementa el cálculo del área específica para círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

