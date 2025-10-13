/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        // TAREA 1: Creación de la biblioteca.
        System.out.println("TAREA 1: CREACION DE LA BIBLIOTECA");
        List<Libro> listaLibros = new ArrayList<>();
        // Inicializamos la biblioteca con un nombre y la lista vacía
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Municipal", listaLibros);
        System.out.println("'Biblioteca Municipal' creada.");
        System.out.println("----------------------------------------");

        
        // TAREA 2: Crear al menos tres autores
        System.out.println("\nTAREA 2: CREACION DE AUTORES");
        // IDs simplificados (1, 2, 3)
        Autor autor1 = new Autor("1", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("3", "Jorge Luis Borges", "Argentina");
        
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        System.out.println("----------------------------------------");


        // TAREA 3: Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\nTAREA 3: AGREGAR 5 LIBROS");
        // ISBNs simplificados
        miBiblioteca.agregarLibro("1001", "Cien anios de soledad", autor1, 1967);
        miBiblioteca.agregarLibro("1002", "El amor en los tiempos del colera", autor1, 1985);
        miBiblioteca.agregarLibro("2001", "La casa de los espiritus", autor2, 1982);
        miBiblioteca.agregarLibro("2002", "Paula", autor2, 1994);
        miBiblioteca.agregarLibro("3001", "Ficciones", autor3, 1944);
        
        System.out.println("Se han agregado 5 libros a la biblioteca.");
        System.out.println("----------------------------------------");

        
        // TAREA 4: Listar todos los libros con su información y la del autor.
        System.out.println("\nTAREA 4: LISTADO COMPLETO DE LIBROS");
        miBiblioteca.listarLibros();
        System.out.println("----------------------------------------");
        
        
        // TAREA 5: Buscar un libro por su ISBN y mostrar su información.
        String isbnBusqueda = "2001"; 
        System.out.println("\nTAREA 5: BUSCANDO LIBRO CON ISBN '" + isbnBusqueda + "'");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn(isbnBusqueda);
        
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro con ISBN " + isbnBusqueda + " no encontrado.");
        }
        System.out.println("----------------------------------------");


        // TAREA 6: Filtrar y mostrar los libros publicados en un anio específico.
        int anioFiltro = 1967;
        System.out.println("\nTAREA 6: FILTRANDO LIBROS PUBLICADOS EN EL ANIO " + anioFiltro);
        List<Libro> librosPorAnio = miBiblioteca.filtrarLibrosPorAnio(anioFiltro);
        
        if (!librosPorAnio.isEmpty()) {
            System.out.println("Se encontraron " + librosPorAnio.size() + " libros:");
            // Itera sobre la lista filtrada y usa el método de impresión
            for (Libro libro : librosPorAnio) {
                libro.mostrarInfo();
            }
        } else {
            System.out.println("No se encontraron libros publicados en " + anioFiltro);
        }
        System.out.println("----------------------------------------");


        // TAREA 7: Eliminar un libro por su ISBN y listar los libros restantes.
        String isbnBorrar = "2002"; // ISBN de 'Paula'
        System.out.println("\nTAREA 7: ELIMINAR LIBRO CON ISBN '" + isbnBorrar + "'");
        miBiblioteca.eliminarLibro(isbnBorrar);
        
        System.out.println("\nLista de libros restantes:");
        miBiblioteca.listarLibros();
        System.out.println("----------------------------------------");


        // TAREA 8: Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nTAREA 8: CANTIDAD TOTAL DE LIBROS");
        // El método obtenerCantidadLibros ya imprime el resultado.
        miBiblioteca.obtenerCantidadLibros();
        System.out.println("----------------------------------------");


        // TAREA 9: Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\nTAREA 9: AUTORES DISPONIBLES (SIN DUPLICADOS)");
        List<Autor> listaAutores = miBiblioteca.mostrarAutoresDisponibles();
        
        System.out.println("Total de autores unicos: " + listaAutores.size());
        for (Autor autor : listaAutores) {
            // Utilizamos el método mostrarInfo() de la clase Autor
            autor.mostrarInfo(); 
        }
        System.out.println("----------------------------------------");
    }
}