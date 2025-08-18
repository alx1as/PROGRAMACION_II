/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // creamos el array con los precios iniciales
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // mostramos los precios antes de cambiar
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }

        // ajustamos el precio del tercer producto
        precios[2] = 129.99;

        // mostramos lista actualizada
        System.out.println("Precios actualizados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
}

