/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alexia
 */


public class Principal08 {
    public static void main(String[] args) {
        FirmaDigital firma = new FirmaDigital(987654321, 20250919);
        Usuario usuario = new Usuario("Alexia Rubin", "alexiarubin@email.com");
        Documento doc = new Documento("Contrato", "Contenido...", firma, usuario);

        System.out.println(doc.mostrar());
    }
}

