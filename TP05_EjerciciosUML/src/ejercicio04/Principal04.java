/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alexia
 */

public class Principal04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alexia Rubin", 40854522);
        Banco banco = new Banco("Banco Nación", 3050083);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(12345678, 202512, banco);

        //vincular bidireccionalmente
        tarjeta.setCliente(cliente);

        //mostrar los datos 
        System.out.println(tarjeta.mostrar());
    }
}

