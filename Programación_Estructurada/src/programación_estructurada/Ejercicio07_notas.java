/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 7.​ Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.

 */
import java.util.Scanner;
public class Ejercicio07_notas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese una nota del 0 y el 10");
            num = input.nextInt();
        } while(num<0 || num>10);
       System.out.println("Nota válida ingresada: " + num);
    }
}
