/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 */
import java.util.Scanner;
public class Ejercicio05_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número (0 para terminar):");
        int num = input.nextInt();
        int sum=0;
        
        while(num!=0) { /*mientras el nro. sea distinto de cero*/
            if(num%2==0){sum+=num;} /*si es par sumamos*/
            System.out.println("Ingrese un número(0 para terminar): ");
            num = input.nextInt();
        }
        System.out.println("La suma de todos los números pares es de: " + sum);
        input.close();/*cierro el escáner*/
    }
}
