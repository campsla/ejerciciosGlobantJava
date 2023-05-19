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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        int nota = 11;
       
        while (!(nota >=0 && nota <= 10)){
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
        }
    }
    
}
