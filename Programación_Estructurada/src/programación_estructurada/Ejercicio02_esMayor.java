/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 
 * Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
    Ejemplo de entrada/salida:
    Ingrese el primer número: 8
    Ingrese el segundo número: 12
    Ingrese el tercer número: 5
    El mayor es: 12

 */
import java.util.Scanner;

public class Ejercicio02_esMayor {
    public static void main (String[] args) {
        Scanner numeros = new Scanner(System.in); /*Inicializo el scanner para leer los inputs  */ 
        
        /*Se piden los tres números */
        System.out.println("Ingrese el primer número entero: ");
        int numero1 = numeros.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = numeros.nextInt();
        System.out.println("Ingrese el tercer número entero: ");
        int numero3 = numeros.nextInt();
        
        int max=numero1; /*inicializo el max con el primer input para comparar */
        
        if(numero2>max) { /*Comparo */
            max = numero2;
        } if (numero3>max) {
            max=numero3;
        }
        /* Imprimimos el mayor*/
        System.out.println("El número mayor es: " + max);
        
        /*cerramos el scanner*/
        numeros.close();
    }
}
    