/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alexia
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
   public Usuario(String nombre, int dni) {
       this.nombre=nombre;
       this.dni=dni;
   }
   //ni el nombre ni dni cambia, por lo que solo getters
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    //Asociacion 1 a 1 con celular:
    public Celular getCelular() {
    return celular;
}

public void setCelular(Celular celular) {
    this.celular = celular;
    if (celular != null && celular.getUsuario() != this) {
        celular.setUsuario(this); // sincroniza la relación
    }
}
   @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni=" + dni + "}";
}

}
