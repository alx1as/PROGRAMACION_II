package Interfaces;

public class TarjetaCredito implements Pago {

    // Método sobrescrito implementado de Pago
    @Override
    public void procesarPago(double monto) {
        System.out.println("\nInformación: ");
        System.out.println("- Total: " + monto);
        System.out.println("Pago realizado con exito.");
    }
    
}
