/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alexia
 */
public class Titular {
    //1. Atributos
    private String nombre;
    private final int dni;
    private Pasaporte pasaporte; //Asociación 1 a 1 con pasaporte.
    
    //2. Constructor
    public Titular(String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
    }
    
    //3. Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    //4. Asociación bidireccional con validación
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this); // mantiene la consistencia
    }}
    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni=" + dni + "}";
    }

}

