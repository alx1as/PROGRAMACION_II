package tp08_interfaces;

/**
 * interfaces que definen distintos comportamientos relacionados con pagos y notificaciones
 */
interface Pagable {
    // método que debe devolver el total a pagar
    double calcularTotal();
}

interface Pago {
    // método que procesa un pago según el monto recibido
    void procesarPago(double monto);
}

interface PagoConDescuento {
    // método que aplica un descuento al monto original y devuelve el nuevo valor
    double aplicarDescuento(double monto);
}

interface Notificable {
    // método para enviar un mensaje de notificación
    void notificar(String mensaje);
}

/**
 * clase que representa un producto con nombre y precio
 * implementa la interfaz Pagable
 */
class Producto implements Pagable {
    private String nombre;
    private double precio;

    // constructor que inicializa nombre y precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // devuelve el precio del producto como total
    @Override
    public double calcularTotal() {
        return precio;
    }

    // devuelve una representación en texto del producto
    @Override
    public String toString() {
        return nombre + ": $" + precio;
    }
}

/**
 * clase que representa un pedido hecho por un cliente
 * contiene una lista de productos y puede notificar cambios
 */
class Pedido implements Pagable {
    private java.util.List<Producto> productos; // lista de productos del pedido
    private Notificable cliente; // cliente que recibirá notificaciones

    // constructor que recibe el cliente y crea una lista vacía de productos
    public Pedido(Notificable cliente) {
        this.productos = new java.util.ArrayList<>();
        this.cliente = cliente;
    }

    // agrega un producto a la lista del pedido
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // cambia el estado del pedido y notifica al cliente
    public void cambiarEstado(String nuevoEstado) {
        if (cliente != null) {
            cliente.notificar("El estado del pedido cambió a: " + nuevoEstado);
        }
    }

    // calcula el total sumando los precios de todos los productos del pedido
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // muestra el detalle del pedido con cada producto y el total
    public void mostrarPedido() {
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

/**
 * clase que representa a un cliente que puede recibir notificaciones
 */
class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // muestra un mensaje de notificación personalizado para el cliente
    @Override
    public void notificar(String mensaje) {
        System.out.println("[Notificación para " + nombre + "]: " + mensaje);
    }
}

/**
 * clase que simula un método de pago con tarjeta de crédito
 * aplica un 10% de descuento
 */
class TarjetaCredito implements Pago, PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta de crédito: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        // aplica un 10% de descuento
        return monto * 0.90;
    }
}

/**
 * clase que simula un método de pago con PayPal
 * aplica un 15% de descuento
 */
class PayPal implements Pago, PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con PayPal: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        // aplica un 15% de descuento
        return monto * 0.85;
    }
}
