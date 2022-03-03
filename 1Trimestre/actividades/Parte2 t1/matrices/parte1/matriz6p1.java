package parte1;
/**
 * matriz6p1
 */
public class matriz6p1 {

    public static void main(String[] args) {

        //Declaracion de variables
        
        int[][] matriz = new int[6][10];
        int max = 0;
        int min = 0;
        int aux = 0;
        boolean aux1 = false;        
        //solucion
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j]= (int)(Math.random()*((1000 + 0) +1)+0);

                do{

                    aux = (int)(Math.random()*((1000 + 0) +1)+0);
                    aux1 = false;

                    for(int k = 0; k < matriz.length; k++){
                        for(int l = 0; l < matriz[k].length; l++){

                            if(aux == matriz[k][l]){
                                matriz[i][j] = aux;
                                aux1 = true;
                            }

                        }
                    }

                }while(aux1);
            }
        }
/*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aux = matriz[i][j] //No me sirve ...
                for (int k = 0; k < matriz[i].length; k++){
                    if (matriz[i][k] == aux){
                        aux2 = 
                    }
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                //No lo entiendo
                do{
                    aux = (int)(Math.random()*((1000 + 0) +1)+0);
                }while(aux1 == true);
            
            }
        }
*/
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
                } else {
                    if (matriz[i][j]<min) {
                        min = matriz[i][j];
                    }
                }
            }
        }
        
        System.out.println("Numero maximo es " + max);
        System.out.println("Numero minimo es " + min);
        
    }
}