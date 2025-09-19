/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alexia
 */
public class ClaveSeguridad {
    private int codigo, ultimaModificacion;
    
    public ClaveSeguridad (int codigo, int ultimaModificacion){
        this.codigo=codigo;
        this.ultimaModificacion=ultimaModificacion;
       
    }

    public int getCodigo() {
        return codigo;
    }

    public int getUltimaModificacion() {
        return ultimaModificacion;
    }
    
}
