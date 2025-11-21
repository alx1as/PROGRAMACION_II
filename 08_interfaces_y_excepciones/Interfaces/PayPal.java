package Interfaces;

public class PayPal implements PagoConDescuento {

    // Método sobrescrito implementado de PagoConDescuento
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.21);
    }
    
    // Método sobrescrito implementado de PagoConDescuento <- Pago
    @Override
    public void procesarPago(double monto) {
        double total = aplicarDescuento(monto);
        System.out.println("\nInformación:");
        System.out.println("- Total con descuento: " + total);
        System.out.println("Pago realizado con exito");
    }
    
}
