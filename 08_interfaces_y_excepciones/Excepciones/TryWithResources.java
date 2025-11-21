package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        
        File archivo = new File("C:\\Users\\romer\\Documents\\NetBeansProjects\\TP8\\src\\Excepciones\\ArchivoParaLeer.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println("Contenido del archivo:\n");
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error de E/S: "+ ex.getMessage());
        }
        
    }
    
}
