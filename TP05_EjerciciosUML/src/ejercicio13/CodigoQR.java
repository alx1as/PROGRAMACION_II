/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

public class CodigoQR {
    String valor;
    Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String mostrar() {
        return "CÓDIGO QR" +
               "\nValor: " + valor +
               "\nUsuario: " + usuario.nombre + " (" + usuario.email + ")";
    }
}
