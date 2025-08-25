/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author alexia
 * Gestión de Gallinas en Granja Digital  

a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.  

Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().  

Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado. 
 */
public class Gallina {
    private int idGallina=0;
    private int edad=0;
    private int huevosPuestos=0;
    public void ponerHuevo(int num) {
        if (num>0) {
            huevosPuestos+=num; //pone huevos por parámetro
        }
    }
    public void envejecer(int años) {
        if(años>0) {
            edad+=años; //envejecer por parámetro
        }
    }
    public void mostrarEstado() { //mostrar info
    System.out.println("ID: " + idGallina);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
