/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATA_3;

/**
 *
 * @author alexia
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de empleados usando polimorfismo
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agrego empleados de diferentes tipos
        empleados.add(new EmpleadoPlanta("Alexia", 80000));
        empleados.add(new EmpleadoTemporal("Lucía", 120, 600));
        empleados.add(new EmpleadoPlanta("Marcos", 9000000));
        empleados.add(new EmpleadoTemporal("Diego", 100, 650));

        // Recorro la lista e imprimo la información
        for (Empleado emp : empleados) {
            emp.mostrarNombre();
            System.out.println("Sueldo: $" + emp.calcularSueldo());

            // Clasifico usando instanceof
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta permanente");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }

            System.out.println("---------------------");
        }
    }
}

