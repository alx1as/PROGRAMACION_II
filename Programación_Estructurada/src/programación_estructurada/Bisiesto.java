/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;
import java.util.Scanner;
/**
 *
 * 1.​ Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.

 * @author alexia
 */
public class Bisiesto {
    public static void main (String[] args) {
        Scanner nro = new Scanner(System.in);
        System.out.println("Por favor, ingrese un año: "); /*Pedimos el año al usuario */
        int año = nro.nextInt(); /*lo guardamos en año */
        
        if((año%4==0)&&(año%100!=0)||(año%400==0) ) { /*Si el año es divisible por 4 pero no por 100 es bisiesto */
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
       nro.close(); /*buena práctica para liberar recursos: cerrar ell scanner */
    }
    
}
