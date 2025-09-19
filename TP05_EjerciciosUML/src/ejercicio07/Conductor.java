/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alexia
 */
public class Conductor {
    private String nombre;
    private int licencia;
    private Vehiculo vehiculo; 
    
    public Conductor(String nombre, int licencia){
        this.nombre=nombre;
        this.licencia=licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLicencia() {
        return licencia;
    }
    //asociacion bidireccionl 
    public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
    if (vehiculo != null && vehiculo.getConductor() != this) {
        vehiculo.setConductor(this);
    }
}

public Vehiculo getVehiculo() {
    return vehiculo;
}
    
}
