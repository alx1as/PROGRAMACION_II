/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alexia
 */
public class FirmaDigital {
    private int CodigoHash, fecha;
    public FirmaDigital(int CodigoHash, int fecha) {
        this.CodigoHash=CodigoHash;
        this.fecha=fecha;
    }

    public int getCodigoHash() {
        return CodigoHash;
    }

    public int getFecha() {
        return fecha;
    }
    
}
