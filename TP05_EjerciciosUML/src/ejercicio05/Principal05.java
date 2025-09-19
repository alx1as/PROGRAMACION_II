/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alexia
 */

public class Principal05 {
    public static void main(String[] args) {
        Propietario p = new Propietario("Alexia", 40854522);
        PlacaMadre placa = new PlacaMadre("ASUS B550", 570);
        Computadora pc = new Computadora("Lenovo", 1001, placa);

        pc.setPropietario(p);

        System.out.println(pc.mostrar());
    }
}


