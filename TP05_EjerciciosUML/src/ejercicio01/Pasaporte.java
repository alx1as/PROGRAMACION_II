package ejercicio01;

public class Pasaporte {

    // 1. Atributos
    private int numero;
    private int fechaEmision;
    private Titular titular; // Asociación 1 a 1
    private Foto foto;       // Composición

    // 2. Constructor
    public Pasaporte(int numero, int fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto; //Si se destruye el pasaporte también la foto.
    }
    // 3. Getters y Setters
    public int getNumero() {
        return numero;
    }
    public int getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }
    //Asociación bidireccional : sincroniza la relación con el objeto titular, lo que mantiene la consistencia.
    //Titual a diferencia de foto lo armamos por fuera del constructor porque es independiente a pasaporte.
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // “Solo actualizo al otro objeto si todavía no estaba vinculado conmigo”.
        }
    }

    public Foto getFoto() {
        return foto;
    }
    
    //Imprimir todos los datos juntos:
    @Override
    public String toString() {
          return "Pasaporte{" +
            "numero=" + numero +
            ", fechaEmision=" + fechaEmision +
            ", titular=" + titular +
            ", foto=" + foto +
            '}';
}


}
