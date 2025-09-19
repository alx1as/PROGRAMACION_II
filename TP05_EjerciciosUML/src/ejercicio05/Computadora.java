/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alexia
 */
public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placa; //composición
    private Propietario propietario;
    
    public Computadora(String marca, int numeroSerie, PlacaMadre placa) {
        this.marca=marca;
        this.numeroSerie=numeroSerie;
        this.placa=placa; //la placa está contenida en Computadora.
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    //Asociación bidireccional:
    public void setPropietario(Propietario propietario) {
    this.propietario = propietario;
    if (propietario != null && propietario.getComputadora() != this) {
        propietario.setComputadora(this);
    }
    }
    //muestro
    public String mostrar() {
    return "COMPUTADORA" +
           "\nMarca: " + marca +
           "\nNúmero de serie: " + numeroSerie +
           "\nPropietario: " + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")" +
           "\nPlaca madre: " + placa.getModelo() + " (Chipset: " + placa.getChipset() + ")";
}

}
