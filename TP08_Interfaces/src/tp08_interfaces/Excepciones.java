/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_interfaces;

/**
 *
 * @author alexia
/**
 * clase de excepción personalizada
 * se usa para manejar edades fuera del rango válido
 */
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        // llama al constructor de la clase Exception con el mensaje recibido
        super(mensaje);
    }
}

/**
 * clase principal con métodos que demuestran distintos tipos de excepciones
 */
class Excepciones {

    // método para dividir dos números de forma segura
    public static void divisionSegura(int a, int b) {
        try {
            int resultado = a / b; // puede lanzar ArithmeticException si b es 0
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // se ejecuta si ocurre una división por cero
            System.out.println("Error: División por cero no permitida.");
        }
    }

    // método que convierte una cadena a número entero
    public static void conversionCadena(String input) {
        try {
            int numero = Integer.parseInt(input); // puede lanzar NumberFormatException
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            // se ejecuta si la cadena no es un número válido
            System.out.println("Error: Entrada no válida para conversión a número.");
        }
    }

    // método que intenta leer un archivo línea por línea
    public static void leerArchivo(String nombreArchivo) {
        try {
            java.io.FileReader fr = new java.io.FileReader(nombreArchivo); // puede lanzar FileNotFoundException
            java.io.BufferedReader br = new java.io.BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) { // lee línea por línea hasta el final
                System.out.println(linea);
            }

            br.close(); // se cierra el archivo
        } catch (java.io.FileNotFoundException e) {
            // se ejecuta si el archivo no existe
            System.out.println("Error: Archivo no encontrado.");
        } catch (java.io.IOException e) {
            // se ejecuta si ocurre un error al leer
            System.out.println("Error al leer el archivo.");
        }
    }

    // método que valida si la edad está en un rango razonable
    public static void validarEdad(int edad) {
        try {
            if (edad < 0 || edad > 120) {
                // lanza una excepción personalizada si la edad no es válida
                throw new EdadInvalidaException("Edad fuera de rango válido.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            // captura la excepción y muestra el mensaje
            System.out.println("Error: " + e.getMessage());
        }
    }

    // método para leer un archivo usando try-with-resources
    public static void leerConTryWithResources(String nombreArchivo) {
        // el recurso se cierra automáticamente al finalizar el bloque try
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.IOException e) {
            // captura cualquier error de lectura o apertura
            System.out.println("Error en lectura con try-with-resources.");
        }
    }
}

