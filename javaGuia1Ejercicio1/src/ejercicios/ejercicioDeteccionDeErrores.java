/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicioDeteccionDeErrores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("NOmbre " + nombre + " edad " + edad);

    }

    
    
}
