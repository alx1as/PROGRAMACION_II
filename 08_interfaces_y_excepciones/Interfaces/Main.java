package Interfaces;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("PARTE 1: Interfaces en un sistema de E-commerce.");
        
        // Instanciamos dos clientes
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
    
        // Cremaos un pedido para cada cliente
        Pedido pedido1 = new Pedido("Pendiente", cliente1);
        Pedido pedido2 = new Pedido("Pendiente", cliente2);
    
        // Creamos 3 productos
        Producto producto1 = new Producto("PS5", 1400000);
        Producto producto2 = new Producto("GPU", 2300000);
        Producto producto3 = new Producto("Monitor", 1100000);
    
        // Agregamos dos productos al pedido del cliente 1
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        
        // Notificamos el estado del pedido al cliente 1
        pedido1.notificarEstado("EN_PROCESO");
        
        // Calculamos el total dle pedido del cliente 1
        double total = pedido1.calcularTotal();
        
        // Creamos un nuevo pago con PayPal
        PayPal pago = new PayPal();
        
        // Procesamos el pago del cliente 1
        pago.procesarPago(total);
        
        // Notificamos el estado del pedido pagado al cliente 1
        pedido1.notificarEstado("PAGADO");
        
        // Agregamos un producto al pedido del cliente 2
        pedido2.agregarProducto(producto1);
        
        // Notificamos su estado en proceso al cliente 2
        pedido2.notificarEstado("EN_PROCESO");
        
        // Calculamos el total del pedido del cliente 2
        double total2 = pedido2.calcularTotal();
        
        // Creamos un pago con tarjeta
        TarjetaCredito pago2 = new TarjetaCredito();
        
        // Procesamos el pago con el monto del pedido del cliente 2
        pago2.procesarPago(total2);
        
        // Notificamos el estado del pedido pagado al cliente 2
        pedido2.notificarEstado("PAGADO");
        
        System.out.println("\nEjercicios finalizados.");
        
    }
    
}
