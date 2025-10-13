/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author alexia
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    //constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id=id;
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public void mostrarInfo() {
        System.out.println("----- Datos del autor -----");
        System.out.println("Nombre: " + nombre + "\nID: " + id + "\nNacionalidad: " + nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }
    
}
