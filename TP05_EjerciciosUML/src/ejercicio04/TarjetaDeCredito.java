/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alexia
 */
public class TarjetaDeCredito {
    //1. Atributos
    private int numero;
    private int fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    //2. Constructor
    public TarjetaDeCredito(int numero, int fechaVencimiento, Banco banco) {
        this.numero=numero;
        this.fechaVencimiento=fechaVencimiento;
        this.banco=banco; //agregación
    }
    // Asociación bidireccional
    public Cliente getCliente() {
    return cliente;
}
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
            if (cliente != null && cliente.getTarjeta() != this) {
        cliente.setTarjeta(this);
    }
}
    public String mostrar() {
    return "Tarjeta de Crédito Nº " + numero +
           "\nVencimiento: " + fechaVencimiento +
           "\nCliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")" +
           "\nBanco: " + banco.getNombre() + " (CUIT: " + banco.getCuit() + ")";
}

}
