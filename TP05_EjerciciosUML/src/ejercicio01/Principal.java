/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alexia
 */
public class Principal {
    public static void main(String [] args) {
        //1. Foto: 
        Foto foto = new Foto("pasaporte.png",".PNG");
        //2. Pasaporte:
        Pasaporte pasaporte = new Pasaporte(456789, 123 ,foto);
        //3. Titular:
        Titular titular = new Titular("Alexia",4085452); 
        //4. Titular + Pasaporte:
        titular.setPasaporte(pasaporte); //los enlazo con el set.
        
        // 5. Imprimo todos los datos:
         System.out.println(pasaporte);
    }
}
