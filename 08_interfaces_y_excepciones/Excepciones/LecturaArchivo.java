package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Ingrese el nombre del archivo txt: ");
        String nombre = scan.nextLine();
        
        File archivo = new File(nombre);
        System.out.println("¿Existe?: " + archivo.exists());
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            br.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: El archivo no fue encontrado.");
        } catch(IOException ex){
            System.out.println("ERROR de E/S: " + ex.getMessage());
        } finally {
            scan.close();
        }
        
    }
    
}
