/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author alexia
 */
public class CitaMedica {
    private int fecha,hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(int fecha, int hora, Paciente paciente, Profesional profesional) {
        this.fecha=fecha;
        this.hora=hora;
        this.paciente=paciente;
        this.profesional=profesional;
    }
    public String mostrar() {
    return "CITA MÉDICA" +
           "\nFecha: " + fecha +
           "\nHora: " + hora +
           "\nPaciente: " + paciente.getNombre() + " (Obra Social: " + paciente.getObraSocial() + ")" +
           "\nProfesional: " + profesional.getNombre() + " (Especialidad: " + profesional.getEspecialidad() + ")";
}

}
