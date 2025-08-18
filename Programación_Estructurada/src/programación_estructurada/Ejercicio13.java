/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 */

public class Ejercicio13 {
    //función recursiva para imprimir los precios del array
    public static void imprimirArray(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirArray(precios, ++indice); // llamada recursiva con el siguiente índice
        }
    }
    public static void main(String[] args) {
        //array con los precios iniciales
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        //mostramos los precios originales
        System.out.println("Precios originales:");
        imprimirArray(precios, 0); //función recursiva con los precios y el índice 

        //modificamos el precio del tercer producto
        precios[2] = 129.99;

        //mostramos los precios modificados
        System.out.println("Precios modificados:");
        imprimirArray(precios, 0);
    }
}

