/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programación_estructurada;

/**
 *
 * @author alexia
 * 3.​ Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
1 Menor de 12 años: "Niño"
2 Entre 12 y 17 años: "Adolescente"
3 Entre 18 y 59 años: "Adulto"
4 60 años o más: "Adulto mayor"


 */
import java.util.Scanner;
public class Ejercicio03_etapas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, ingrese su edad: ");
        int edad=input.nextInt();
        
        if(edad<12) {System.out.println("Niño");}
        else if(edad>11 && edad<18) {System.out.println("Adolescente");}
        else if(edad>17 && edad <60) {System.out.println("Adulto");}
        else{System.out.println("Adulto mayor");}
        
    }
}
