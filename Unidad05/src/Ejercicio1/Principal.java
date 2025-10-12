/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author alexia
 */
import java.util.List;

package Ejercicio1;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // Tarea 1: Crear y agregar 5 productos
        System.out.println("TAREA 1: AGREGANDO PRODUCTOS AL INVENTARIO");
        // creo los productos
        Producto p1 = new Producto("1", "Laptop Gamer", 2800.50, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Pan Integral 500g", 2.99, 150, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "Jeans Clásicos", 159.99, 40, CategoriaProducto.ROPA);
        Producto p4 = new Producto("4", "Set de Cuchillos", 1250.00, 75, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Auriculares Inalámbricos", 309.00, 120, CategoriaProducto.ELECTRONICA);
        // creo el inventario
        Inventario inventario = new Inventario();
        // agrego al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        System.out.println("Se agregaron 5 productos.\n");

        // Tarea 2: Listar todos los productos
        System.out.println("TAREA 2: LISTA COMPLETA DE PRODUCTOS");
        inventario.listarProductos();

        // Tarea 3: Buscar un producto por ID
        System.out.println("\nTAREA 3: BUSCANDO PRODUCTO CON ID '3'");
        inventario.buscarProductoPorId("3");

        // Tarea 4: Filtrar por categoría
        System.out.println("\nTAREA 4: FILTRANDO PRODUCTOS DE CATEGORÍA 'ELECTRÓNICA'");
        // llamo al método y guardo el resultado en una nueva lista
        List<Producto> productosElectronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        // recorro la nueva lista para mostrar los productos encontrados
        for (Producto producto : productosElectronica) {
            System.out.println(producto);
        }

        // Tarea 5: Eliminar un producto y listar los restantes
        System.out.println("\nTAREA 5: ELIMINANDO PRODUCTO CON ID '1' Y MOSTRANDO LISTA ACTUALIZADA");
        // elimino el producto
        inventario.eliminarProducto("1");
        // listo los productos que quedaron en el inventario
        System.out.println("Lista de productos después de eliminar: ");
        inventario.listarProductos();

        // Tarea 6: Actualizar el stock de un producto
        System.out.println("\nTAREA 6: ACTUALIZANDO STOCK DEL PRODUCTO CON ID '3' A 50 UNIDADES");
        inventario.actualizarStock("3", 50);
        // busco el producto para verificar que el stock se actualizó
        System.out.println("Verificación del cambio: ");
        inventario.buscarProductoPorId("3");

        // Tarea 7: Mostrar el total de stock disponible
        System.out.println("\nTAREA 7: CALCULANDO EL STOCK TOTAL");
        // llamo al método y guardo el resultado en una variable
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El stock total de todos los productos es: " + totalStock);

        // Tarea 8: Obtener y mostrar el producto con mayor stock
        System.out.println("\nTAREA 8: OBTENIENDO PRODUCTO CON MAYOR STOCK");
        Producto productoMaxStock = inventario.obtenerProductoConMayorStock();
        // verifico que no sea nulo (por si el inventario estuviera vacío)
        if (productoMaxStock != null) {
            System.out.println("El producto con mayor stock es:");
            System.out.println(productoMaxStock);
        } else {
            System.out.println("No hay productos en el inventario.");
        }

        // Tarea 9: Filtrar productos con precios entre $1000 y $3000
        System.out.println("\nTAREA 9: FILTRANDO PRODUCTOS CON PRECIO ENTRE $1000 Y $3000");
        List<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        // recorro la lista resultante y la muestro
        for (Producto producto : productosPorPrecio) {
            System.out.println(producto);
        }

        // Tarea 10: Mostrar las categorías disponibles
        System.out.println("\nTAREA 10: MOSTRANDO TODAS LAS CATEGORÍAS DISPONIBLES");
        CategoriaProducto[] categorias = inventario.mostrarCategoriasDisponibles();
        for (CategoriaProducto categoria : categorias) {
            // .name() devuelve el nombre de la constante del enum como un String
            System.out.println(categoria.name());
        }
    }
}