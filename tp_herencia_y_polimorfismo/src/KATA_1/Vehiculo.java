/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_1;



// Clase base Vehiculo
public class Vehiculo {
    // Atributos protegidos para que puedan ser accedidos por las subclases
    protected String marca;
    protected String modelo;

    // Constructor para inicializar marca y modelo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que muestra la información básica del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
