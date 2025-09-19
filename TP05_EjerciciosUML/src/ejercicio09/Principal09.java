/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author alexia
 */
public class Principal09 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Alexia Rubin", "OSDE");
        Profesional profesional = new Profesional("Dra. Martínez", "Dermatología");
        CitaMedica cita = new CitaMedica(20250925, 1030, paciente, profesional);

        System.out.println(cita.mostrar());
    }
}
