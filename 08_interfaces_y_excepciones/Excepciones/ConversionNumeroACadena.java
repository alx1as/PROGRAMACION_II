package Excepciones;

import java.util.Scanner;

public class ConversionNumeroACadena {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto que pueda ser convertido a entero.");
        System.out.print("Texto: ");
        String textoAConvertir = scan.nextLine();
        
        try {
            int textoConvertido = Integer.parseInt(textoAConvertir);
            System.out.println("Numero convertido: " + textoConvertido);
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: El texto ingresado no es un entero valido.");
        }
        
    }
    
}
