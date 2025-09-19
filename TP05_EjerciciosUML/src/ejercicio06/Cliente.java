/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alexia
 */
public class Cliente {
    private String nombre;
    private int telefono;
    
    public Cliente(String nombre, int telefono) {
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
    
}
