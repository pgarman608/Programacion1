package arai.Relacion1;

import java.util.*;
public class rai2{
    public static void main(String[] args) {
        //Declaración de variables
        int ary1 = 10;
        int[] numrs1 = new int[ary1];
        int num1 = 0;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        //Solucion
        System.out.println("Introduce el numero");
        num1 = sc.nextInt();
        for (int i = 0; i < numrs1.length; i++) {
            numrs1[i] = (int)(Math.random()*((20 -1) +1) +1 );
        }
        for (int i = 0; i < numrs1.length && (!exit); i++) {
            if (numrs1[i] == num1) {
                exit = true;
            }
            System.out.println(numrs1[i]);
        }
        if (exit == true) {
            System.out.println("En numero que has introducido ha salido en la array");
        }else{
            System.out.println("Tu numero no ha salido en la array");
        }
    }
}