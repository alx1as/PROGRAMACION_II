/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alexia
 */
public class Principal02 {
     public static void main(String [] args) {
         //1. Batería:
        Bateria bateria = new Bateria("Samsung-123", 4000);

        //2. Celular:
        Celular celular = new Celular(987654, "Samsung", "Galaxy S20");

        //3. Usuario:
        Usuario usuario = new Usuario("Alexia", 4085452);

        //4. Relaciono Usuario y Celular (asociación bidireccional):
        celular.setUsuario(usuario);

        //5. Relaciono Celular y Batería (agregación):
        celular.setBateria(bateria);

        //6. Imprimo todos los datos:
        System.out.println(celular);
     }
}
