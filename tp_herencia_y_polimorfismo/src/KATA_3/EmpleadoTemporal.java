/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_3;

/**
 *
 * @author alexia
 */

// Subclase que representa a un empleado temporal
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorPorHora;

    // Constructor
    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    // Implementa el cálculo de sueldo para empleado temporal
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorPorHora;
    }
}

