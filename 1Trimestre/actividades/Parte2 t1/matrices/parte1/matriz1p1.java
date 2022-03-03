package parte1;
public class matriz1p1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int[][] matriz2d1 = new int[3][6];
        matriz2d1[0][0] = 0;
        matriz2d1[0][1] = 30;
        matriz2d1[0][2] = 2;
        matriz2d1[0][5] = 5;
        matriz2d1[1][0] = 75;
        matriz2d1[1][4] = 0;
        matriz2d1[2][2] = -2;
        matriz2d1[2][3] = 9;
        matriz2d1[2][5] = 11;
        //Solucion
        for (int i = 0; i < matriz2d1.length; i++) {
            for (int j = 0; j < matriz2d1[i].length; j++) {
                System.out.print("\t" + matriz2d1[i][j]);
            }
            System.out.println();
        }
    }
}