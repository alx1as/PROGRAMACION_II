/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_2;

/**
 *
 * @author alexia
 */


public class Main {
    public static void main(String[] args) {
        // Crear un array de tipo Figura con distintas subclases
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo 1", 3.5);
        figuras[1] = new Rectangulo("Rectángulo 1", 4, 6);
        figuras[2] = new Circulo("Círculo 2", 2);

        // Mostrar nombre y área de cada figura usando polimorfismo
        for (Figura figura : figuras) {
            figura.mostrarNombre(); // Muestra el nombre desde la clase padre
            System.out.println("Área: " + figura.calcularArea()); // Llama al método sobrescrito
            System.out.println("---------------------");
        }
    }
}
