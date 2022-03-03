package matrices.parte1;

public class matriz5p1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int[][] matriz = new int[6][10];
        int max = 0;
        int posiciondelmax = 0;
        int posiciondelmin = 0;
        int posicion = 1;
        int min = 0;
        //solucion
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*((1000 + 0) +1)+0);
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
        min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posiciondelmax = posicion;
                } else {
                    if (matriz[i][j]<min) {
                        min = matriz[i][j];
                        posiciondelmin = posicion;
                    }
                }
                posicion++;
            }
        }
        System.out.println("Numero maximo es " + max + " y su posicion es " + posiciondelmax);
        System.out.println("Numero minimo es " + min + " y su posicion es " + posiciondelmin);
    }
}
