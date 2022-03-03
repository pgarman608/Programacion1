package parte1;
import java.util.Scanner;

public class matriz2p1 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int c = 4;
        int f = 5;
        int[][] matriz= new int[c][f];
        int suma1 = 0;
        int col = 0;
        int filas = 0;
        //Solucion
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduceme un numero");
                matriz[i][j] = sc.nextInt();

                //Doy valores a la matriz

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("\t" + matriz[i][j]);
                
                suma1 = suma1 + matriz[i][j];
                col = col + matriz[i][j];

                /*Hago la suma final y la suma de las columnas*/

            }
            for (int j = 0; j < c ; j++) {
                filas = filas + matriz[j][i]; 

                //Hago la suma de las filas

            }

            System.out.println("La columna " +i+ " es " + filas);
            System.out.println("La fila " +i+ " es " + col);
            filas = 0;
            col = 0;
        
        }
        
        System.out.println("La suma total es " + suma1);
    
    }
}
