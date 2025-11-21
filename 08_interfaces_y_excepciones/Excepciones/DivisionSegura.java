package Excepciones;

import java.util.Scanner;

public class DivisionSegura {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Ingrese dos numeros...");
        System.out.print("Primer numero: ");
        num1 = scan.nextDouble();
        
        System.out.print("Segundo numero: ");
        num2 = scan.nextDouble();
        
        try {
            if (num2 == 0) {
                throw new ArithmeticException("ERROR: No se puede dividir por cero.");
            }
            double resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
