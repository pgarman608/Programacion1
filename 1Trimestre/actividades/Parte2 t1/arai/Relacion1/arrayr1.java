package arai.Relacion1;

import java.util.*;
public class arrayr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int act = 0;
        System.out.println("Introduce el ejercicio");
        act = sc.nextInt();
        while (act == 1) {
            //Declaracion de variables
            int[] nums1 = new int[12];
            //Solucion
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("Introduceme el numero de la arraid = " + i);
                nums1[i] = sc.nextInt();
            }
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("Numero del arraid " + i + " contenido " + nums1[i]);
            }
            act = sc.nextInt();
        }
        while (act == 2) {
            char[] let1 = new char[9];
            let1[0] = 'a';
            let1[1] = 'x';
            let1[4] = '@';
            let1[6] = ' ';
            let1[7] = '+';
            let1[8] = 'Q';
            for (int i = 0; i < let1.length; i++) {
                System.err.println(let1[i]);
            }
        }
        while (act == 3) {
            int[] nums1 = new int[10];
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("Introduce un numero");
                nums1[i] = sc.nextInt(); 
            }
            for (int i = nums1.length - 1; i > 0; i--) {
                System.out.println("El numero " + i + " de la array es = " + nums1[i]);
            }
        }
        while (act == 4) {
            int[] numeros = new int[20];
            int[] cuadrado = new int[20];
            int[] cubo = new int[20];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int)(Math.random()*(100 - 1 + 1) + 1);
            }
            for (int i = 0; i < numeros.length; i++) {
                cuadrado[i] = (int)(Math.pow(numeros[i], 2));
            }
            for (int i = 0; i < numeros.length; i++) {
                cubo[i] = (int)(Math.pow(numeros[i],3));
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("El numero es " + numeros[i] + " su cuadrado " + cuadrado[i] + " su cubo " + cubo[i]);
            }
            act = sc.nextInt();
        }
        while (act == 5) {
            int[] nums1 = new int[10];
            int maxi = 0;
            int mini = 0;
            int nose = 0;
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("Introduce un numero");
                nums1[i] = sc.nextInt();
            }
            for (int i = 0; i < nums1.length; i++) {
                maxi = Math.max(nums1[i-nose],nums1[i] );
                mini = Math.min(nums1[i-nose],nums1[i] );
                if (nose != 1) {
                    nose++;
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                if (maxi == nums1[i]) {
                    System.out.println(nums1[i] + " maximo");
                } else {
                    if (mini == nums1[i]) {
                        System.out.println(nums1[i] + " minimo");
                    } else {
                        System.out.println(nums1[i]);
                    }
                }
            }
            act = sc.nextInt();
        }
        while (act == 6) {
            //Declaración de variables
            int ar1 = 15;
            int[] nums1 = new int[ar1];
            int numr1 = 0;
            //Solución
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("");
            }
        }
        while (act == 7) {
            //Declaracion de variables
            int[] numrs1 = new int[100];
            int num1 = 0;
            int num2 = 0;
            //Solucion
            System.out.println("Introduce el numero que queramos cambiar");
            num1 = sc.nextInt();
            System.out.println("Introduce el numero para cambiar los anteriores");
            num2 = sc.nextInt();
            for (int i = 0; i < numrs1.length; i++){
                numrs1[i] = (int)(Math.random()*((20 - 1) + 1) + 1);
            }
            for(int i = 0; i < numrs1.length; i++){
                System.out.println("\t" + numrs1[i]);
            }
            for (int i = 0; i < numrs1.length; i++){
                if(numrs1[i] == num1){
                numrs1[i] = num2;
                System.out.println("\\" + numrs1[i]);
                }else{
                System.out.println(numrs1[i]);
                }
            }
        }
        while (act == 8) {
            //Declaracion de variables

            //Solucion
        }
        while (act == 9) {
            
        }
        while (act == 10) {
            //Declaracion de variables
            int[] nums1 = new int[20];
            String ip= " ";
            String p = " ";
            int aux1 = 0;
            //Solucion
            for (int i = 0; i < nums1.length; i++) {
                nums1[i]=(int)(Math.random()*(((100) - 0 +1) + 0));
            }
            for (int i = 0; i < nums1.length ; i++) {
                for (int j = 0; j < nums1.length - 1 ; j++) {
                    if (nums1[j + 1] < nums1[j]) {
                        aux1 = nums1[j+1];
                        nums1[j+1] = nums1[j];
                        nums1[j] = aux1;
                    }
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i]%2==0) {
                    p = p + ", " + nums1[i];     
                }else{
                    ip = ip + ", " + nums1[i];
                }
            }
            System.out.println(p+ip);
            act = sc.nextInt();
        }
        while(act == -1){
            int[] numsr = new int[10];
            for (int i = 0; i < numsr.length; i++) {
                numsr[i] = (int)(Math.random() * (1000-1) + 1);
            }
            for (int index = 0; index < numsr.length; index++) {
                System.out.println(numsr[index]);
            }
            act = sc.nextInt();

        }
    }
}
