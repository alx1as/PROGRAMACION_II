package unidad3;
public class Mascota {
    private String nombre = "Apu";
    private String especie = "Cashi";
    private int edad = 1;
    
public void mostrarInfo() {
    System.out.println(nombre + "\nEspecie: "+especie + "\nEdad: "+edad);
}
public int cumplirAnios() {
    return edad +=1;
}
}
