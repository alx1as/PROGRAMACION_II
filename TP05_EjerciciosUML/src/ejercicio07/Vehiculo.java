/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alexia
 */
public class Vehiculo {
    private int patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(int patente, String modelo, Motor motor) {
        this.patente=patente;
        this.modelo=modelo;
        this.motor=motor; //Agregación
    }
    public String getModelo() {
    return modelo;
}

public int getPatente() {
    return patente;
}

    //asociacion
    public void setConductor(Conductor conductor) {
    this.conductor = conductor;
    if (conductor != null && conductor.getVehiculo() != this) {
        conductor.setVehiculo(this);
    }
}

public Conductor getConductor() {
    return conductor;
}
//mostrar todo
public String mostrar() {
    return "VEHÍCULO" +
           "\nPatente: " + patente +
           "\nModelo: " + modelo +
           "\nMotor: " + motor.getTipo() + " (N° de serie: " + motor.getNumeroSerie() + ")" +
           "\nConductor: " + conductor.getNombre() + " (Licencia: " + conductor.getLicencia() + ")";
}

    
}
