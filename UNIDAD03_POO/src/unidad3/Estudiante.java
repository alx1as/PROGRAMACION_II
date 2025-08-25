/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author alexia
 * 1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones.
 */
public class Estudiante {
    private String nombre="Alexia";
    private String apellido="Rubin";
    private String curso="Programación II";
    private double calificacion=0;
    
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + "\n " 
                + curso + "\n Calificación: " + calificacion);
    }
    public void subirCalificacion(int puntos) { 
        if(puntos>0) {
           calificacion+=puntos;
        }
    }
    public void bajarCalificacion(int puntos) {
        if (puntos>0) {
            calificacion-=puntos;
        }
    }
}
