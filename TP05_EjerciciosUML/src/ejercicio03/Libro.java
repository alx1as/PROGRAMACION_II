/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alexia
 */
public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor; //en libro contengo los datos de autor y editorial.
    private Editorial editorial;
    
    public Libro(String titulo, int isbn, Autor autor, Editorial editorial) {
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor=autor; // asociación unidireccional: Libro → Autor
    this.editorial=editorial; // agregación: Libro → Editorial
    }
    //método para mostrar todos los datos del libro. Los getters estan en sus repectivas clases
    public String mostrar() {
    return "Libro: " + titulo +
           "\nISBN: " + isbn +
           "\nAutor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")" +
           "\nEditorial: " + editorial.getNombre() + " - " + editorial.getDireccion();
}
}
