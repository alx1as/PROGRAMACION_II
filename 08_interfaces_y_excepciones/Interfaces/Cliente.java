package Interfaces;

public class Cliente implements Notificable {
    
    // Atributo
    private String nombre;
    
    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    // Método sobrescrito implementado de Notificable
    @Override
    public void notificarCambioDeEstado(String nuevoEstado) {
        System.out.println("\nAVISO: " + nombre + " tu pedido ha cambiado de estado. ");
        System.out.println("- Nuevo estado: " + nuevoEstado);
    }
    
}
