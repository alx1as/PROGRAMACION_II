/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author alexia
 */
public class Libro {
    private String isbn, titulo;
    private Autor autor;
    private int anioPublicacion;
    
    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion= anioPublicacion;
    }
    //mostrar info
    public void mostrarInfo() {
        String nombreAutor = (autor != null) ? autor.getNombre() : "N/A"; 
    
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + nombreAutor);
    System.out.println("Año de publicación: " + anioPublicacion);
    System.out.println("Isbn: " + isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    Autor getNombre() {
         return this.autor;
    }
    
}
