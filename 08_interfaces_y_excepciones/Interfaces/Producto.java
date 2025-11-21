package Interfaces;

public class Producto implements Pagable {
    
    // Atributos
    private String nombre;
    private double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método sobrescrito implementado de Pagable
    @Override
    public double calcularTotal() {
        return this.precio;
    }
    
}
