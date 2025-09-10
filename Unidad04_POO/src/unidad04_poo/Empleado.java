/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad04_poo;

/**
 *
 * @author alexia
 */
public class Empleado {
    //Defino los atributos de la instancia:
    private String nombre;
    private String puesto;
    private double salario;
    private int id;
    private static int totalEmpleados=0;
    
    //Constructor para recibir todos los atributos:
    public Empleado (String nombre, String puesto, double salario, int id){
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        this.id=id;
        totalEmpleados++;
    }
    //Constructor sobrecargado que recibe solo nombre y puesto:
    public Empleado(String nombre, String puesto) {
        this.nombre=nombre;
        this.puesto=puesto;
        this.id= totalEmpleados + 1; //Asigno el ID
        this.salario=10000000; //Asigno un salario random
        totalEmpleados++;
    }
    //MÉTODOS
    //Porcentaje de aumento
    public void actualizarSalario(int porcentaje) {
        salario+=salario*porcentaje/100;
    }
    //Cantidad fija a aumentar:
    public void actualizarSalario(double cantidad) {
        salario+=cantidad;
    }
    //Override: 
    // toString: devuelve una descripción en texto de un objeto
    //.format para mostrar el número completo
    @Override
    public String toString() {
         return String.format("Empleado{nombre='%s', puesto='%s', salario=%.2f, id=%d}",
                 nombre, puesto, salario, id);
}
    //Mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
