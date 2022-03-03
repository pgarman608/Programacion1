package arai.Relacion1;

import java.util.*;
public class rai3 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int ayr1 = 20;
        int[] numrs1 = new int[ayr1];
        int num1 = 0;
        int ii = 0;
        int im = 0;
        int ie = 0;
        int aux1 = 0;
        boolean exit = false;
        //Solucion
        for (int i = 0; i < numrs1.length; i++) {
            numrs1[i] = (int)(Math.random()*((200 - 1) +1) +1);
        }
        for (int i = 0; i < numrs1.length ; i++) {
            for (int j = 0; j < numrs1.length - 1 ; j++) {
                if (numrs1[j + 1] < numrs1[j]) {
                    aux1 = numrs1[j+1];
                    numrs1[j+1] = numrs1[j];
                    numrs1[j] = aux1;
                }
            }
        }
        for (int i = 0; i < numrs1.length; i++) {
            System.out.println(numrs1[i]);
        }
        System.out.println("--------");
        System.out.println("Introduce el numero que quieras encontrar en la array");
        num1 = sc.nextInt();
        System.out.println("--------");
        
        im = numrs1.length;
        im = (im / 2) - 1;
        ie = numrs1.length -1;

        for (int i = 0; (i < numrs1.length) && (!exit); i++) {
            if (numrs1[ii]== num1) {
                System.out.println("Tu numero aparaece en la posicion " + ii);
                exit = true;
            } else {
                if (numrs1[ie] == num1) {
                    System.out.println("Tu numero aparece en la posicion " + ie);
                    exit = true;
                } else {
                    if (numrs1[im] < num1) {
                        ii = im;
                        im = im +(im /2);
                    } else {
                        ie = im;
                        im = im/2;
                    }
                }
            }
        }
        if(exit == false){
            System.out.println("Tu numero no aparece");
        }
    }
}