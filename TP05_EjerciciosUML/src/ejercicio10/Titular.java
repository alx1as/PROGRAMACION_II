/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alexia
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;
    
    public Titular(String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
     //Asociacion bidireccional
    public CuentaBancaria getCuentaBancaria() {
        return cuenta;
    }
   
    public void setCuentaBancaria(CuentaBancaria cuenta) {
    this.cuenta = cuenta;
    if (cuenta != null && cuenta.getTitular() != this) {
        cuenta.setTitular(this);
    }
}

}
