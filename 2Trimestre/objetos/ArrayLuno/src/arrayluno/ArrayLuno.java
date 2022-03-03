/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayluno;

import java.util.ArrayList;

/**
 *
 * @author serrperry
 */
public class ArrayLuno {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<>(6);
        compañeros.add("Paco");
        compañeros.add("Pablo");
        compañeros.add("Pepe");
        compañeros.add("Maria");
        compañeros.add("Elena");
        compañeros.add("Antonia");
        for (String compañero : compañeros) {
            System.out.println(compañero);
        }
        int max = 20;
        int min = 10;
        int aux = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        ArrayList<Integer> numa = new ArrayList<>(aux);
        System.out.println(numa.size());
        for (int i = 0; i < aux; i++) {
            int aux2 = (int)Math.floor(Math.random() * (100 + 1));
            numa.add(i,aux2);
        }
        int suma = 0;
        int media = 0;
        int maximo = numa.get(0);
        int minimo = numa.get(0);
        for (int i = 0; i < aux; i++) {
            suma += numa.get(i);
            if (maximo < numa.get(i)) {
                maximo = numa.get(i);
            }
            if (minimo > numa.get(i)) {
                minimo = numa.get(i);
            }
        }
        media = suma / aux;
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
    }
}
