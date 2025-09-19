/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alexia
 */


public class Principal03 {
    public static void main(String[] args) {
        Autor autor = new Autor("Mariana Enriquez", "Argentina");
        Editorial editorial = new Editorial("Anagrama", "Barcelona");
        Libro libro = new Libro("Nuestra parte de noche", 97884, autor, editorial);

        System.out.println(libro.mostrar());
    }
}

