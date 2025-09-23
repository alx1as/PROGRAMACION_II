/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto); // dependencia de creación
        System.out.println(r.mostrar());
    }
}

