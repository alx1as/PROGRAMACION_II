/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 0.​Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60

 */
import java.util.Scanner;
public class Ejercicio10 {
     public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
         return stockActual - cantidadVendida + cantidadRecibida;
     }
     
     public static void main (String[] args) {
         Scanner input = new Scanner(System.in);
         int stockActual, cantidadVendida, cantidadRecibida;
         
         System.out.println("Ingrese el stock actual de productos: ");
         stockActual= input.nextInt();
         
          System.out.println("Ingrese la cantidad vendida de productos: ");
         cantidadVendida= input.nextInt();
         
          System.out.println("Ingrese la cantidad recibida de productos: ");
         cantidadRecibida= input.nextInt();
         
         System.out.println("El stock actual de productos es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
         
     }
}
