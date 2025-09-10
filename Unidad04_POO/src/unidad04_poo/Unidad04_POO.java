/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alexia
 */
package unidad04_poo;

public class Unidad04_POO {
    public static void main(String[] args) {
       
        //Instanciando clases
        Empleado empleado1 = new Empleado("Alexia","Arquitecta",15000000,1);
        Empleado empleado2= new Empleado("Ana","Abogada",5000000,2);
        Empleado empleado3 = new Empleado("Bernardo","Vendedor",8000000,3);
        
        System.out.println("EMPLEADOS REGISTRADOS: ");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        
        //Simular aumento de salario
        System.out.println("SALARIOS ACTUALIZADOS SEPTIEMBRE 2025: ");
        empleado1.actualizarSalario(550.0);
        System.out.println(empleado1.toString());
        empleado2.actualizarSalario(50.0);
        System.out.println(empleado2.toString());
        empleado3.actualizarSalario(150.0);
        System.out.println(empleado3.toString());
        
        //Mostrar el total de empleados
        System.out.println("El total de empleados es de: " + Empleado.mostrarTotalEmpleados());
    }
    
}
