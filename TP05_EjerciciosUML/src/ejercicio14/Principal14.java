/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

public class Principal14 {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Video de Viaje", 12);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", p);
    }
}

