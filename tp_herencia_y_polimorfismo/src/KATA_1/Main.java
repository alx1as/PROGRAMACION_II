package KATA_1;
public class Main {
    public static void main(String[] args) {
        // Instancia de Auto con marca, modelo y cantidad de puertas
        Auto miAuto = new Auto("Ford", "Ranger", 5);

        // Muestra la información completa usando el método sobrescrito
        miAuto.mostrarInfo();
    }
}
