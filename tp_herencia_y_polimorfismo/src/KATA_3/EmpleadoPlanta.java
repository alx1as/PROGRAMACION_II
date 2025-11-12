/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_3;

/**
 *
 * @author alexia
 */

// Subclase que representa a un empleado de planta
public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;

    // Constructor
    public EmpleadoPlanta(String nombre, double sueldoBasico) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
    }

    // Implementa el cálculo de sueldo para empleado de planta
    @Override
    public double calcularSueldo() {
        return sueldoBasico;
    }
}

