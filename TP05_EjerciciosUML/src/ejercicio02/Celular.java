/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alexia
 */
public class Celular {
    //1. atributos propios
    private int imei; //nro único que identifica a cada teléfono móvil en el mundo
    private String marca;
    private String modelo;
    
    private Usuario usuario; //Asociación 1 a 1
    private Bateria bateria; //Agregación
    
    //2. Constructor:
    public Celular (int imei, String marca, String modelo) {
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
    }
    // ninguno de los 3 atributos de Celular cambia, por lo que solo getters.
    public int getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    //Asociación bidireccional con Usuario:
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this); // “Solo actualizo al otro objeto si todavía no estaba vinculado conmigo”.
        }
    }
    public Usuario getUsuario() {
    return usuario;
}
    //setter de agregación con batería:
    public Bateria getBateria() {
    return bateria;
}

    public void setBateria(Bateria bateria) {
    this.bateria = bateria;
}

    @Override
    public String toString() {
        return "Celular{imei=" + imei +
           ", marca='" + marca + '\'' +
           ", modelo='" + modelo + '\'' +
           ", usuario=" + usuario +
           ", bateria=" + bateria +
           '}';
}

}
