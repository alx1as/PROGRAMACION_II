
package unidad3;
public class Principal {
    public static void main(String[] args) {
        //crear instancia de estudiante 
        Estudiante est = new Estudiante();
        est.mostrarInfo();
        est.subirCalificacion(10);
        est.mostrarInfo();
        est.bajarCalificacion(5);
        est.mostrarInfo();
    }
}
