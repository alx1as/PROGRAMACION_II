/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alexia
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
    
    public Propietario (String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
    }
    
       public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public Computadora getComputadora() {
        return computadora;
    }
    //Asociación bidireccional:
      public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
      
}
}
