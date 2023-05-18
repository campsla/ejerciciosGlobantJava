
package ejercicios;

import java.util.Scanner;


public class ejemploScanner {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("INgresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Nombre: " + nombre + " edad: " + edad);
    }
    
}
