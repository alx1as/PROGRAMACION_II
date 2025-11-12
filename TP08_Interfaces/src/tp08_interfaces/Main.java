/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_interfaces;

/**
 *
 * @author alexia
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== PARTE 1: E-commerce ===");
        Cliente c = new Cliente("Alexia");
        Pedido pedido = new Pedido(c);
        pedido.agregarProducto(new Producto("Libro", 1500));
        pedido.agregarProducto(new Producto("Mouse", 3500));
        pedido.mostrarPedido();
        pedido.cambiarEstado("En preparación");

        TarjetaCredito tarjeta = new TarjetaCredito();
        double conDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(conDescuento);

        System.out.println("\n=== PARTE 2: Excepciones ===");
        Excepciones.divisionSegura(10, 0);
        Excepciones.conversionCadena("abc123");
        Excepciones.leerArchivo("archivo_que_no_existe.txt");
        Excepciones.validarEdad(130);
        Excepciones.leerConTryWithResources("archivo_que_no_existe.txt");
    }
}