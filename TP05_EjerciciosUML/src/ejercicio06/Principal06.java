/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alexia
 */
public class Principal06 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alexia", 387456780);
        Mesa mesa = new Mesa(5,4); //numero y capacidad de la mesa
        Reserva reserva = new Reserva(2025092, 21, cliente, mesa);

        System.out.println(reserva.mostrar());
    }
}

