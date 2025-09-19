/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alexia
 */

public class Principal11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Charly García", "Rock nacional");
        Cancion cancion = new Cancion("Cerca de la revolución", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}

