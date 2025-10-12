/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.ArrayList; 
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author alexia
 */
public class Inventario {
    
    private ArrayList<Producto> productos; 
    
    public Inventario() {
        this.productos= new ArrayList<>();
    }
    
    //agregar productos desde inventario. 
    public void agregarProducto(Producto p) { //deberia recibir un producto por parametro. Pra esto llamamos al Array PRODUCTO y el nombre del par p.
        this.productos.add(p);
    }
    //listar los productos
    public void listarProductos() {
        //mejorarlo con un for each
        for(Producto p : productos) {
            System.out.println(p);
        }
    }
    // METODO PARA BUSCAR PRODUCTO POR ID QUE SE REUTILIZARÁ
    private Producto encontrarProductoPorId(String id) {
    int i = 0;
    // búsqueda con el bucle while
    while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
        i++;
    }
    if (i < productos.size()) {
        return this.productos.get(i); //Devuelve el producto encontrado
    } else {
        return null; //Si recorrió toda la lista y no lo encontró, devuelve null
    }
}
    //MOSTRAR producto por ID --> reutilizo el método encontrarProductoPorId para evitar el uso de repetidos whiles.
    public Producto buscarProductoPorId(String id) {
            Producto productoEncontrado = this.encontrarProductoPorId(id);
            if (productoEncontrado != null) {System.out.println("\nProducto encontrado con ID " + id + ":" + productoEncontrado);}
            else {System.out.println("No se encontró el producto");}
            return productoEncontrado;
    }
   
    //ELIMINAR producto por ID
    public Producto eliminarProducto(String id) {
           Producto productoAEliminar= this.encontrarProductoPorId(id);
            
            if (productoAEliminar != null) {
                System.out.println("\n Producto eliminado con ID " + id + ":"); 
               
                productos.remove(productoAEliminar);
            } else {System.out.println("No se pudo eliminar");}
            return productoAEliminar;
    }
    //ACTUALIZAR STOCK
    public Producto actualizarStock(String id, int nuevaCantidad) {
       Producto productoAActualizar = this.encontrarProductoPorId(id); //guardo el producto x id en la nueva variable
       if(productoAActualizar!=null) { //si la encuentra actualizo el stock (cantidad). 
           productoAActualizar.setCantidad(nuevaCantidad); //setteo la cantidad 
           System.out.println("Stock actualizado con éxito. \n Nuevo Stock: " + nuevaCantidad);
       } else {System.out.println("No se pudo actualizar");}
       return productoAActualizar;
    }
    //FILTRAR POR CATEGORIA
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        //creo un array para devolver
       List<Producto> productosPorCategoria = new ArrayList<>();
       
       for (Producto producto : productos) {
           if(producto.getCategoria() == categoria){
               productosPorCategoria.add(producto);
           }
       }
       return productosPorCategoria;
}
    //Obtener total stock 
    public int obtenerTotalStock() {
        int stock = 0;
        for(Producto producto : productos) {
            stock += producto.getStock();
        }
        return stock;
    }
    //obtenerProductoConMayorStock()
    public Producto obtenerProductoConMayorStock() {
    return productos.stream() // 1. Stream permite hacer operaciones con cadenas.
                    .max(Comparator.comparingInt(Producto::getStock)) // 2. Pide el máximo comparando el stock de cada producto.
                    .orElse(null); // 3. Si no encuentra ninguno  devuelve null.
}
    //FILTRAR PRODUCTOS POR PRECIO
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosFiltradosPorPrecio = new ArrayList<>();
        for (Producto producto : productos) {
                if(producto.getPrecio() >= min && producto.getPrecio() <= max) {
                    productosFiltradosPorPrecio.add(producto);
                }
            }
        return productosFiltradosPorPrecio;
    }
    //Mostrar categorias disponibles 
    public CategoriaProducto[] mostrarCategoriasDisponibles() { //creo array para mostrar los productos de una categoria
        return CategoriaProducto.values();
    }
}
