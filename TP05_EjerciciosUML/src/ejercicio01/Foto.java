/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alexia
 */
public class Foto {
    //Defino atributos internos
    private String imagen;
    private String formato; 
    
    //Constructor:
    public Foto(String imagen, String formato) {
        this.imagen=imagen;
        this.formato=formato; //con el constructor garantizo que el obj. siempre tenga valores válidos.
    }
    public String getImagen() {
        return imagen;
    }
    
    public String getFormato() {
        return formato;
    }
    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
}
}
