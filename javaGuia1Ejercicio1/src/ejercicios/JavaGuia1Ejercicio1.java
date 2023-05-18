/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
public class JavaGuia1Ejercicio1 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 12;
        
        int suma = num1 + num2;
        int resta = num2 - num1;
        
        num1++;
        num1++;
        num1++;
        num2--;
        
        boolean condicion1 = num1 < num2;
        boolean condicion2 = num1 != num2;
        boolean condicion3 = num1 <= num2;
        
        System.out.println("Suma " + suma);
        System.out.println("Resta " + resta);
        System.out.println("Contador1 " + num1);
        System.out.println("Contador2 " + num2);
        System.out.println("Condicion1 " + condicion1);
        System.out.println("Condicion2 " + condicion2);
        System.out.println("Condicion3 " + condicion3);
        
         

                
    }
    
}
