/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esception1;

import java.util.Scanner;

/**
 *
 * @author serrperry
 */
public class Esception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mayor = 0;
        int numero2 = 0;
        for (int i = 0; i < 6; i++) {
            boolean aux = false;
            System.out.println("Introduceme un numero entero");
            do {
                Scanner sc = new Scanner(System.in);
                aux = false;
                try{
                    numero2 = sc.nextInt();
                }catch(RuntimeException e){
                    System.err.println("No has introducido un numero entero por el error: " + e.getMessage());
                    System.err.println("Introducemelo de nuevo");
                    aux = true;
                }
            } while (aux == true);
            if (mayor<numero2) {
                mayor = numero2;
            }
        }
        System.out.println("El numero mayor de los 6 es el " + mayor);
    }
}
