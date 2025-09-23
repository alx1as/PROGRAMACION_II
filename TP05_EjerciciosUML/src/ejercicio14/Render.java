/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

public class Render {
    String formato;
    Proyecto proyecto; // asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String mostrar() {
        return "RENDER EXPORTADO" +
               "\nFormato: " + formato +
               "\nProyecto: " + proyecto.nombre + " (" + proyecto.duracionMin + " min)";
    }
}
