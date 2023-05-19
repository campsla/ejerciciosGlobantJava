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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if ((num1 > 25 && num2 > 25) || (num1 > 25 || num2 > 25)) {
            System.out.println("Alguno es mayor que 25");
        } else {
            System.out.println("Ningun es mayor que 25");
        }
    }
    
}
