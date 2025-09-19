/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

public class Principal10 {
    public static void main(String[] args) {
        // Crear clave
        ClaveSeguridad clave = new ClaveSeguridad(9876, 20250919);

        // Crear cuenta bancaria sin titular
        CuentaBancaria cuenta = new CuentaBancaria(12345678, 500005058, clave);

        // Crear titular
        Titular titular = new Titular("Alexia Rubin", 40854522);

        // Asociar cuenta y titular (asociación bidireccional)
        cuenta.setTitular(titular);

        // Mostrar datos
        cuenta.mostrar();

    }
}

