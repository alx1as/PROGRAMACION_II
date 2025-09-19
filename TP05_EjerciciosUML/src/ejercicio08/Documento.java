/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alexia
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; //comp
    private Usuario usuario;
    
    public Documento(String titulo, String contenido, FirmaDigital firma, Usuario usuario) {
        this.titulo=titulo;
        this.contenido=contenido;
        this.firma=firma; //composición
        this.usuario=usuario; //agregacion
    }
    //mostrar 
    public String mostrar() {
    return "DOCUMENTO" +
           "\nTítulo: " + titulo +
           "\nContenido: " + contenido +
           "\nFirma digital: Código Hash " + firma.getCodigoHash() + ", Fecha: " + firma.getFecha() +
           "\nUsuario: " + usuario.getNombre() + " (Email: " + usuario.getEmail() + ")";
}

}
