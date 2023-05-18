
package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tres valores, boolean, double y char");
        boolean bandera = leer.nextBoolean();
        double real = leer.nextDouble();
        char caracter = leer.next().charAt(0);
                  
        System.out.println("Bandera: " + bandera);
        System.out.println("Real: " + real );
        System.out.println("Caracter: " + caracter);
        
    }
    
}
