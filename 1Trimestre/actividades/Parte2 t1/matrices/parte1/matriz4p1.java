package matrices.parte1;
import java.lang.Thread;
import java.util.*;
public class matriz4p1 {
    public static void main(String[] args) throws InterruptedException {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int[][] matriz= new int[4][5];
        int suma1 = 0;
        //Solucion
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*((20-1)+1)+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma1 = suma1 + matriz[i][j];
                Thread.sleep(2500);
                System.out.println("La suma intermedia "+ (i+j) + " = " + suma1);
                
            }
        }
        System.out.println("LA suma final es " +suma1);
    }        
}

