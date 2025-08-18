/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 8.​ Cálculo del Precio Final con impuesto y descuento.
 Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.

 */
import java.util.Scanner;
public class Ejercicio08_precioFInal {
    /*método para calcular el precio final*/
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*pedimos todos los precios y porcentajes*/
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.println("Ingrese el porcentaje de impuesto: ");
        double impuesto = input.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = input.nextDouble();
        /*se imprime el precio final invocando a la función calcularPrecioFinal definida antes*/
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es de $: " + precioFinal);
    }
}

/*PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento) */