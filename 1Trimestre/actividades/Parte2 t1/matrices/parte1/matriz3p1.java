package matrices.parte1;

public class matriz3p1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int[][] matriz= new int[4][5];
        int suma2 = 0;
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
                suma2 = suma2 + matriz[i][j];
            }
        }
        System.out.println("La suma total es " + suma2);
    }
}