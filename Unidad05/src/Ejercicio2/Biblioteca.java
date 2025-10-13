/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alexia
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros; //colección de libros de la biblioteca
    
    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre=nombre;
        this.libros=libros;
    }
    // Agregar libro
    public void agregarLibro(String isbn, String titulo, Autor autor, int anioPublicacion ){
        Libro libro = new Libro(isbn, titulo, autor, anioPublicacion); //como tiene varios parámetros me conviene instanciar un libro y luego agregarlo
        this.libros.add(libro);
    }
    //Listar libros
    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
   //Buscar libro por Isbn
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        while (i < libros.size() && !this.libros.get(i).getIsbn().equals(isbn)) {
        i++;
    }
        if(i<libros.size()){
            return this.libros.get(i);
        } else {
            return null;
        }   
    }
    //Eliminar libro por Isbn
    public void eliminarLibro(String isbn) {
      Libro libroABorrar=this.buscarLibroPorIsbn(isbn); //reutilizo el método para buscar
      if (libroABorrar !=null){
          System.out.println("Producto eliminado con éxito.");
          libros.remove(libroABorrar);
      } else {System.out.println("No se pudo encontrar.");}
    }
    //Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        int cantidad = this.libros.size(); 
        System.out.println("Cantidad de libros en biblioteca: " + cantidad);
        return cantidad;
    }
    //Filtrar libros por año
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        //creo una lista para devolver:
        List<Libro> librosPorAño = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio) {
                librosPorAño.add(libro);
            }
        }
        return librosPorAño;
    }
    //Mostrar autores disponibles
    public List<Autor> mostrarAutoresDisponibles() {
    Set<Autor> autoresUnicos = new HashSet<>();
    for (Libro libro : this.libros) {
        Autor autor = libro.getNombre();
        if (autor != null) { 
            autoresUnicos.add(autor);
        }
    }
    return new ArrayList<>(autoresUnicos);
    }
    
}
