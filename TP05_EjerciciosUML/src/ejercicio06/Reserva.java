/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alexia
 */
public class Reserva {
    private int fecha;
    private int hora;
    private Cliente cliente; //asociación unidireccional
    private Mesa mesa; //agregación
    
    public Reserva(int fecha, int hora, Cliente cliente, Mesa mesa) {
        this.fecha=fecha;
        this.hora=hora;
        this.cliente=cliente;
        this.mesa=mesa;
    }
    
    public String mostrar() {
        return "RESERVA" +
               "\nFecha: " + fecha +
               "\nHora: " + hora +
               "\nCliente: " + cliente.getNombre() + " (Tel: " + cliente.getTelefono() + ")" +
               "\nMesa N°: " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")";
    }
}
