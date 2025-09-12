/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alexia
 */
public class Bateria {
    private String modelo;
    private int capacidad;
   
    //constructor
    public Bateria (String modelo, int capacidad){
        this.modelo=modelo;
        this.capacidad=capacidad;
    }
    //getters (no necesita setter, existe independientemente)
    //en celular debo poner setBateria (agregación)
    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }
    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + " mAh}";
}

}
