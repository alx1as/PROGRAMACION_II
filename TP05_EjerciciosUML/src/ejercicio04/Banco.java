/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alexia
 */
public class Banco {
    //1. Atributos
    private String nombre;
    private int cuit;
    //2. Constructor
    public Banco(String nombre, int cuit) {
        this.nombre=nombre;
        this.cuit=cuit;
    }
    //3.Getters
    public String getNombre() {
        return nombre;
    }
    public int getCuit() {
        return cuit;
    }
}
