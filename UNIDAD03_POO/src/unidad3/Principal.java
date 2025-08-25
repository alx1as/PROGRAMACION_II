package unidad3;
public class Principal {
    public static void main(String[] args) {
        //crear instancia de estudiante 
        Estudiante est = new Estudiante();
        est.mostrarInfo();
        est.subirCalificacion(10);//+10
        est.mostrarInfo();
        est.bajarCalificacion(5); //-5
        est.mostrarInfo();
        
        //instancia mascota
        Mascota masc = new Mascota ();
        masc.mostrarInfo();
        masc.cumplirAnios();// +1
        masc.mostrarInfo();
        
       //Intancia libro
       Libro lib = new Libro();
       lib.setAñoPublicacion(-300); //inválido
       System.out.println(lib.getAñoPublicacion()); ;
       lib.setAñoPublicacion(2005);
       System.out.println(lib.getAñoPublicacion()); ;
    }
}
