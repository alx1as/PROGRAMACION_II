package Interfaces;

import java.util.ArrayList;

public class Pedido implements Pagable {
    
    // Atributos
    ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    // Constructor
    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new ArrayList();
    }
    
    // Método para añadir un producto al array
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    // Método sobrescrito implementado de Pagable
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        
        return total;
    }
    
    // Método para notificar el estado del pedido 
    public void notificarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioDeEstado(nuevoEstado);
    }
    
}
