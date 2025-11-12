package KATA_1;

// Subclase Auto que hereda de Vehiculo
public class Auto extends Vehiculo {
    // Atributo adicional exclusivo del auto
    private int cantidadPuertas;

    // Constructor que usa super para inicializar la parte de Vehiculo
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llama al constructor de la clase padre
        this.cantidadPuertas = cantidadPuertas; // Inicializa su propio atributo
    }

    // Sobrescribe el método mostrarInfo para agregar la cantidad de puertas
    @Override
    public void mostrarInfo() {
        // Llama al método original para mostrar marca y modelo
        super.mostrarInfo();
        // Agrega la información adicional
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
