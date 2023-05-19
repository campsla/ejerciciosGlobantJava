/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int nro = 0;
        int acumulador = 0;
        
        do {
            System.out.println("Ingrese un nro");
            nro = leer.nextInt();
            if (nro == 0){
                System.out.println("Se capturo el Cero");
                break;
            }else{
                if (nro > 0){
                acumulador = acumulador + nro;
                }
            }
            cont++;
        } while (cont <= 20);
        System.out.println("La suma es " + acumulador);
        
    }
   
}
