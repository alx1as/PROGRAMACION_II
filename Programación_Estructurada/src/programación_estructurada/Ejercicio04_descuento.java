/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 4.​ Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final

 */
import java.util.Scanner;
public class Ejercicio04_descuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, ingrese el precio del producto: "); 
        double precio = input.nextDouble();
        System.out.println("Por favor, ingrese su categoría (A, B o C): ");
        char cat =  Character.toUpperCase(input.next().charAt(0));
      
        switch(cat){
            case 'A':
                double totalA = (precio-(precio*10)/100);
                System.out.println("El precio original del producto es: "+ precio 
                                + "\nEl descuento aplicado es del 10%"  
                                + "\nPrecio final a pagar: $" + totalA);
                break;
            case 'B':
                  double totalB = (precio-(precio*15)/100);
                System.out.println("El precio original del producto es: "+ precio 
                                + "\nEl descuento aplicado es del 15%"  
                                + "\nPrecio final a pagar: $" + totalB);
                break;
            case 'C':
                  double totalC = (precio-(precio*20)/100);
                System.out.println("El precio original del producto es: "+ precio 
                                + "\nEl descuento aplicado es del 20%"  
                                + "\nPrecio final a pagar: $" + totalC);
                break;
            default:
                    System.out.println("Categoría inválida. Ingrese A, B o C.");
                    break;
        }
    }
    
}
