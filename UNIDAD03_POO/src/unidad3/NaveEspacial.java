/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author alexia
 * 5.  Simulación de Nave Espacial: Crear una clase NaveEspacial con los atributos: nombre, combustible.  

Métodos requeridos: despegar(), avanzar(distancia),
* recargarCombustible(cantidad), mostrarEstado().  

Reglas: Validar que haya suficiente combustible antes de avanzar 
* y evitar que se supere el límite al recargar.  

Tarea: Crear una nave con 50 unidades de combustible, 
* intentar avanzar sin recargar, luego recargar y avanzar correctamente. 
* Mostrar el estado al final. 
 */
public class NaveEspacial {
    private String nombre="Alexius";
    private int combustible=50;
    
    public void despegar() {
        if (combustible >0) {
            combustible-=1;//si es mayor a cero despega y resta 1u.
            System.out.println("Despegó correctamente. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente");
        }
    }
    
    public void avanzar(int distancia) {
        if(combustible>=distancia) {
            System.out.println("Avanzó correctamente "+distancia + " kilómetros");
            combustible-=distancia;//resto el combustible proporcional a la distancia.
        } else {
            System.out.println("Debe cargar más combustible");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if(cantidad > 0 && combustible + cantidad <= 200) { //min>0 max 200 u. de combustible
            combustible+=cantidad;
        }
    }
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre + "\n Cantidad de combustible: " + combustible);
    }
}
