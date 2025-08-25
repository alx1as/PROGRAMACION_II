package unidad3;
public class Principal {
    public static void main(String[] args) {
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
       System.out.println(lib.getAñoPublicacion()); 
       lib.setAñoPublicacion(2005);
       System.out.println(lib.getAñoPublicacion());

       //instancia gallina1:
        Gallina gal1 = new Gallina();
        gal1.envejecer(1);
        gal1.ponerHuevo(2);
        gal1.mostrarEstado();
        //gallina 2
        Gallina gal2 = new Gallina();
        gal2.envejecer(5);
        gal2.ponerHuevo(5);
        gal2.mostrarEstado();
       //instancia nave
        NaveEspacial nave = new NaveEspacial();
        nave.avanzar(90); // no debería avanzar
        nave.recargarCombustible(100); // cargo 100
        nave.despegar(); //despega correct
        nave.avanzar(90); // ahora si
        nave.mostrarEstado(); 
    }
   
}
