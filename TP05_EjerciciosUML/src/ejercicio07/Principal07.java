/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alexia
 */

public class Principal07 {
    public static void main(String[] args) {
        Conductor c = new Conductor("Alexia", 123456);
        Motor m = new Motor("Nafta", 98765); 
        Vehiculo v = new Vehiculo(123, "Corsa", m); 

        v.setConductor(c); // Asociación bidireccional

       System.out.println(v.mostrar());

    }
}

