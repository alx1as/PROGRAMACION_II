/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * a.​calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.​
Nacional: $5 por kg
Internacional: $10 por kg
* 
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.​
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0

 */
import java.util.Scanner;
public class Ejercicio09_envio {
    //función para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso*5;
        } else {
            return peso*10;
        }
    }
    //función para calcular el total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    //función para pedir los datos, leerlos e imprimir precio final.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine(); //para absorver el salto de línea
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        //llamamos a las funciones que calculan los costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);
        //imprimimos el costo de envío y el total a pagar:
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
