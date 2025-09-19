/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alexia
 */
public class PlacaMadre {
    private String modelo;
    private int chipset;
    
    public PlacaMadre(String modelo, int chipset) {
        this.modelo=modelo;
        this.chipset=chipset;
    }
    public String getModelo() {
    return modelo;
}

public int getChipset() {
    return chipset;
}

}
