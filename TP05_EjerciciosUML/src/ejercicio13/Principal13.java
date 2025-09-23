/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

public class Principal13 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Alexia", "alexia@mail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("qrABC123", u);
    }
}

