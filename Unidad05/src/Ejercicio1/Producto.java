/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author alexia
 * Atributos:
● id (String) → Identificador único del producto.
● nombre (String) → Nombre del producto.
● precio (double) → Precio del producto.
● cantidad (int) → Cantidad en stock.
● categoria (CategoriaProducto) → Categoría del producto. 
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    //constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.categoria=categoria;
    }
    //generar el String con el estado del objeto:
    @Override
    public String toString() {
        return "\n------------------------------------------------\n" +
           "Producto: " + nombre + "\n" +
           "\tID: " + id + "\n" +
           "\tPrecio: $" + precio + "\n" +
           "\tStock: " + cantidad + " unidades" + "\n" +
           "\tCategoría: " + categoria.name() + " - " + categoria.getDescripcion();
}
    //mostrarInfo():
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public String getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock() {
        return cantidad;
    }
    

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }
    
   
}
