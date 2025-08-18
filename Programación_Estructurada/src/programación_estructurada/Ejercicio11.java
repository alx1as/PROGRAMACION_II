/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 11.​Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0

 */
import java.util.Scanner;

public class Ejercicio11 {

    static double descuentoEspecial = 0.10; //variable global 
    
    /*función para calcular el descuento*/
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial; 

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;

        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();

        calcularDescuentoEspecial(precio); //llamo a la función para calcular el dto.
    }
}

