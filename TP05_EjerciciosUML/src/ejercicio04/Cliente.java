/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alexia
 */
public class Cliente {
    //1. Atributos
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta; //Asociación bidireccional
    //2. Constructor
    public Cliente(String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
       
    }
    //3.Getters
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    
    //asociación con Tarjeta de crédito:
    public void setTarjeta(TarjetaDeCredito tarjeta) {
    this.tarjeta = tarjeta;
    if (tarjeta != null && tarjeta.getCliente() != this) {
        tarjeta.setCliente(this);
    }
}

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
}
