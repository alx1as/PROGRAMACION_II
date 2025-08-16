/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
6.​ Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.

 */
import java.util.Scanner;
public class Ejercicio06_positivos {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);/*inicio scanner*/
        int num = 0, pos = 0, neg = 0, cer = 0; /*definimos las variables a usar*/
        
        for(int i = 0; i<10;i++) { /*10 iteraciones para ingresar 10 números:*/
            System.out.println("Ingrese un número entero: ");
            num=input.nextInt();
            
            if(num>0){ /*si es positivo sumamos 1 al contador*/
               pos+=1;
            }
            else if(num<0) {/*si es negativo sumamos 1 al contador*/
               neg+=1;
            }
            else if(num==0) { /*si es cero sumamos 1 al contador*/
               cer+=1;
            }
        }
        System.out.println("En total hay " + pos + " números positivos, " 
        + neg + " números negativos y " + cer + " cero(s).");
    }
}
